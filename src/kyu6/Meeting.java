package kyu6;

import java.util.Arrays;
import java.util.Collections;

class Meeting {
   public static String s = "Alex:STAN;Michael:Wahl;Anna:Gates;Ann:Arno;Robert:Dorries;Ann:Meta;Ann:Gates;Ann:Meta;Alex:STAN;Alex:Schwarz;Michael:Bell;Grace:Bell;Amandy:Wahl;Paul:Wahl;Ann:Bell;Anna:Bell;Megan:Arno;Alex:Kern;Sarah:Bell;Alex:Kor";


    public static String meeting(String s) {
        s = s.toUpperCase();
        String[] list = s.split(";");
        String[] result = new String[list.length];

                for(int i=0; i < result.length; i++) {
                    String[] tempMember = list[i].split(":");
                    String temp = tempMember[1];
                    tempMember[1] = tempMember[0];
                    tempMember[0] = temp;
                    result[i] = tempMember[0]+tempMember[1];
                    System.out.println(result[i]);
                    }

                Arrays.sort(result);
                for(String string: result) {
                   System.out.println(string);
                }

                String st = new String();
                for(String str: result) {
                    st = st + str;
                }

        st = st.replace('[','(');
        st = st.replace(']',')');

        return s;
    }

    public static void main(String[] args) {
        meeting(s);

    }
}