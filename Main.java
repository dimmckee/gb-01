package J3.HomeWork_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printLastNLinesSecond(100);
    }

    private static void printLastNLinesSecond(int lines) {
        File file = new File("/Users/dmitry/MEGA/Geek Brains Main/gb-3/src/J3/HomeWork_3/test");

        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            long fileLength = file.length() - 1;
            StringBuilder sb = new StringBuilder();
            int reachedLines = 0;

            raf.seek(fileLength);

            for (long ptr = fileLength; ptr >= 0 ; ptr--) {
                raf.seek(ptr);
                char c = (char) raf.read();

                if (c == '\n') {
                    reachedLines++;

                    if (reachedLines == lines) {
                        break;
                    }
                }

                sb.append(c);
            }

            sb.reverse();

            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printLastNLinesFirst(int count) {
        try (
                FileInputStream fin =
                        new FileInputStream(
                                "/Users/dmitry/MEGA/Geek Brains Main/gb-3/src/J3/HomeWork_3/test"
                        );
                BufferedReader br =
                        new BufferedReader(new InputStreamReader(fin))
        ) {
            String line;
            List<String> tempLines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                tempLines.add(line);
            }

            for (int i = count; i < tempLines.size(); i++) {
                System.out.println(tempLines.get(i));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
