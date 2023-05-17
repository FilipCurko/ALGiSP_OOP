package pckg_freq_cntr;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String filePath = "STABLES/src/pckg_freq_cntr/quotes.txt";
        ArrayList<String> text = AUX_CLS.readDataFromFile(filePath);
        AUX_CLS.readTextFromArrayList(text,10);
        int[] length = {3, 4, 7, 11, 15};
        HashMap<Integer, Integer> freqCounter = AUX_CLS.wordLengthCounter(text, length);
        for(Integer key : )

    }
}
