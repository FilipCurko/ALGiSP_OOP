package pckg_freq_cntr;
import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
public class AUX_CLS {

    public static HashMap<Integer, Integer> wordLengthCounter(ArrayList<String> text, int [] length) {
        String base = "N= ";
        HashMap<Integer, Integer> freqCounter = new HashMap<>();
        for (int num : length) {
            freqCounter.put(num, 0);
        }
        for (String line : text) {
            String[] words = line.split(" ");
            System.out.println(Arrays.toString(words));
            for (String word : words) {
                for (int num : length) {
                    if (num == word.length()) {
                        int value = freqCounter.get(num) + 1;
                        freqCounter.put(num, value);
                        break;
                    }
                }
            }
        }
        return freqCounter;
    }

        public static boolean fileExist (String filePath){
            File file = new File(filePath);
            boolean exist = file.exists() && file.isFile();
            System.out.println("File exists: " + exist);
            System.out.println("File path: " + filePath);
            return exist;
        }
        public static ArrayList<String> readDataFromFile (String filePath){
            ArrayList<String> text = new ArrayList<>();
            if (fileExist(filePath)) {
                try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        text.add(line);
                    }
                    System.out.println("Reading data from file is finished!");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            } else {
                System.out.println("Can not read from file... File does not exists...");
            }
            return text;
        }
        public static void readTextFromArrayList (ArrayList < String > text,int numLines){
            for (int k = 0; k < numLines; k++) {
                System.out.println(text.get(k));
            }
        }

    }
