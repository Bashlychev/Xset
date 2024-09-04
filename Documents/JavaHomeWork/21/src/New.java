import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class New {

    public static void main(String[] args) {
        String fileName = "text";

        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                stringList.add(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            return;
        } catch (IOException e) {
            System.err.println("Ошибка в обработке файла");
            return;
        }

        String strOnlyWords = String.join(" ", stringList)
                .replaceAll("[^a-zA-Z\\s]", "")
                .replaceAll("\\s+", " ")
                .trim();

        // Разделение строки по словам
        String[] words = strOnlyWords.split("\\s+");

        // Подсчет входящих слов по отдельности
        Map<String, Integer> wordToCount = new TreeMap<>();
        for (String word : words) {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }

        int totalWords = words.length;

        for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            double percentage = (count * 100.0) / totalWords; // Рассчитать процент
            System.out.printf("%s: %d = %.2f%%\n", word, count, percentage);
        }

        int maxValue = Collections.max(wordToCount.values());
        System.out.println("Числа, встречающиеся максимальное количество раз = " + maxValue + ": ");
        for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }
    }
}