package others;

import java.util.Arrays;

public class StringPracticing {

public static void main(String[] args) {
        String[] list = {"[BELL, ANN]", "[BELL, ANNA]", "BELL, ANNA", "BELL, ANN"};
        Arrays.sort(list);
        for(String st : list)
            System.out.println(st);
    }
}


