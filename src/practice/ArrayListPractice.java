package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5;i++) {
            list.add(scanner.nextInt());
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        list.remove(0);
        for(int y: list){
            System.out.print(y+" ");

        }
    }
}
