package kyu6;

import java.util.Arrays;

class Meeting {
   public static String s = "Alex:STAN;Michael:Wahl;Anna:Gates;Ann:Arno;Robert:Dorries;Ann:Meta;Ann:Gates;Ann:Meta;Alex:STAN;Alex:Schwarz;Michael:Bell;Grace:Bell;Amandy:Wahl;Paul:Wahl;Ann:Bell;Anna:Bell;Megan:Arno;Alex:Kern;Sarah:Bell;Alex:Kor";


    public static String meeting(String s) {
        s = s.toUpperCase();
        String[] list = s.split(";");
        System.out.println(Arrays.toString(list));
        System.out.println(list.length);
        String[] result = new String[list.length];

                for(int i=0; i < result.length; i++) {
                    System.out.println(list[i]);
                    String[] tempMember = list[i].split(":");
                    String temp = tempMember[1];
                    tempMember[1] = tempMember[0];
                    tempMember[0] = temp;
                    //System.out.println(temp);
                    result[i] = Arrays.toString(tempMember);
                   }
                Arrays.sort(result);
                String st = new String();
                for(String str: result) {
                    st = st + str;
                    System.out.println(st);
                }

        st = st.replace('[','(');
        st = st.replace(']',')');
        System.out.println(st);

        return s;
    }

    public static void main(String[] args) {
        meeting(s);

    }
}