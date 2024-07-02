import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {

    public static void main(String[] args) {
        String logFile = "production_log.csv";
        String startTimeStr = "2024-06-18T19:00:01";
        String endTimeStr = "2024-06-18T20:00:01";

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime startTime = LocalDateTime.parse(startTimeStr, formatter);
        LocalDateTime endTime = LocalDateTime.parse(endTimeStr, formatter);

        String[] apiEndpoints = {"/api/signDoc", "/api/addDoc", "/api/sendMessage", "/api/getMessage", "/api/getDocByName"};
        int[] counts = new int[apiEndpoints.length];

        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Extract timestamp from the log line
                String timestampStr = extractTimestamp(line);
                if (timestampStr != null) {
                    LocalDateTime timestamp = LocalDateTime.parse(timestampStr, formatter);
                    if (timestamp.isAfter(startTime) && timestamp.isBefore(endTime)) {
                        for (int i = 0; i < apiEndpoints.length; i++) {
                            if (line.contains(apiEndpoints[i])) {
                                counts[i]++;
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < apiEndpoints.length; i++) {
            System.out.println("Запрос " + apiEndpoints[i] + " вызывался: " + counts[i] + " раз(а)");
        }
    }

    private static String extractTimestamp(String logLine) {
        // Regular expression to match the timestamp in the log line
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(logLine);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
