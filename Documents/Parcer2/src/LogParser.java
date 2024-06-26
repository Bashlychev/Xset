import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser {
    public static void main(String[] args) {
        String filePath = "src/production_log.csv";
        String[] queries = {
                "/api/signDoc",
                "/api/addDoc",
                "/api/sendMessage",
                "/api/getMessage",
                "/api/getDocByName"
        };

        Map<String, Integer> queryCounts = parseLogs(filePath, queries);

        for (String query : queries) {
            System.out.println("Запрос " + query + " вызывался: " + queryCounts.getOrDefault(query, 0));
        }
    }

    public static Map<String, Integer> parseLogs(String filePath, String[] queries) {
        Map<String, Integer> queryCounts = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String query : queries) {
                    Pattern pattern = Pattern.compile(".*" + query + ".*");
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        queryCounts.put(query, queryCounts.getOrDefault(query, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return queryCounts;
    }
}
