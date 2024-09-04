import java.io.*;

public class SecondMethod {
    public static void main(String[] args) {
        BufferedReader bR = null;
        FileWriter fW = null;
        try {
            bR = new BufferedReader(new FileReader("text.txt"));
            StringBuffer sB = new StringBuffer();
            String line;
            while ((line = bR.readLine()) != null) {
                sB.append(line).append("\n");
            }

            StringBuffer text = new StringBuffer(); //Подсчет гласных и согласных
            int GlasCount = 0;
            int SoglCount = 0;
            for (int i = 0; i < sB.length(); i++) {
                char currentChar = sB.charAt(i);
                if (isVowel(currentChar)) {
                    text.append('a');
                    GlasCount += 1;
                } else if (Character.isLetter(currentChar)) {
                    text.append('м');
                    SoglCount += 1;
                } else {
                    text.append(currentChar);
                }
            }

            fW = new FileWriter("export.txt"); //Экспорт в файл
            fW.write(text.toString());
            fW.flush();

            System.out.println("Гласные буквы " + GlasCount);
            System.out.println("Согласные буквы: " + SoglCount);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (bR != null)
                    bR.close();
                if (fW != null)
                    fW.close();
            } catch (IOException e) {
                System.err.println("Error while closing resources: " + e.getMessage());
            }
        }
    }

    public static boolean isVowel(char c) { // Поиск гласных
        c = Character.toLowerCase(c);
        return c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' || c == 'у' || c == 'ы' || c == 'э' || c == 'ю' || c == 'я';
    }
}

//123