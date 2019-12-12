package others;

import java.util.Arrays;

public class StringPracticing {

public static void main(String[] args) {
//        String[] list = {"[BELL, ANN]", "[BELL, ANNA]", "BELL, ANNA", "BELL, ANN"};
//        Arrays.sort(list);
//        for(String st : list)
//            System.out.println(st);
    StringBuilder sb = new StringBuilder();
    sb.append("Hello there");
    sb.append("! Everything's good?");
    System.out.println(sb);

    String st = new String();
    System.out.println(st.concat("Thank you for calling us"));
    System.out.println(st+"hmmm");
    System.out.println(st.concat("! We are so happy"));
    }
}


