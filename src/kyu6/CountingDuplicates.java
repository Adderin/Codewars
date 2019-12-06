package kyu6;

import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Set<String> count = new HashSet<>();

        for (String string : text.toLowerCase().split("")) {
            if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
        }
        return count.size();
    }
    public static void main(String[] args){
        System.out.println("Write your text below:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("There are " + duplicateCount(text) +" duplicates in the text");
        scanner.close();
    }
}
