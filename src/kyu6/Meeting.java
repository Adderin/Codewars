package kyu6;

import java.util.Arrays;

class Meeting {
   public static String s = "Alex:STAN;Michael:Wahl;Anna:Gates;Ann:Arno;Robert:Dorries;Ann:Meta;Ann:Gates;Ann:Meta;Alex:STAN;Alex:Schwarz;Michael:Bell;Grace:Bell;Amandy:Wahl;Paul:Wahl;Ann:Bell;Anna:Bell;Megan:Arno;Alex:Kern;Sarah:Bell;Alex:Kor";


    public static String meeting(String s) {
        String[] list = s.toUpperCase().split(";");
        String[] result = new String[list.length];

                for(int i=0; i < result.length; i++) {
                    String[] tempMember = list[i].split(":");
                    String temp = tempMember[1];
                    tempMember[1] = tempMember[0];
                    tempMember[0] = temp;
                    result[i] = tempMember[0]+", "+tempMember[1];
                    }

                Arrays.sort(result);

                String st = new String();
                for(String str: result) {
                    st = st+ "("+str+")";
                }
        return s;
    }

    public static void main(String[] args) {
        meeting(s);

    }
}