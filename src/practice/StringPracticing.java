package practice;

import java.util.Scanner;

public class StringPracticing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        try {
            if (city.substring(city.length() - 4).equals("burg")) {
                System.out.println("This is a city!");
            } else System.out.println("Not a city");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("What is it?");
        }
    }
}
