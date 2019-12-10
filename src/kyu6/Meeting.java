package kyu6;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Meeting {
   public static String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";


    public static String meeting(String s) {

        String[] list = s.split(";");
        String[] result = new String[list.length];

                for(int i=0; i <  list.length-1; i++) {
                    String[] tempMember = list[i].split(":");
                    String temp = tempMember[1];
                    tempMember[1] = tempMember[0];
                    tempMember[0] = temp;
                    for(int j=0; j < tempMember.length-1; j++) {
                       result[i] = Arrays.toString(tempMember);
                       }
                    }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result).toUpperCase());

        return s;
    }

    public static void main(String[] args) {
        meeting(s);

    }
}
//SAMPLE OUTPUT
//"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"