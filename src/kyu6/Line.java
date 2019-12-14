package kyu6;

import java.util.LinkedList;

public class Line {
    int[] customers = {25, 25, 50};
    LinkedList<Integer> cashbox = new LinkedList<Integer>();

    public static void main(String[] args) {

    }

    public void TicketSale(int[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] == 25) {
                cashbox.add(customers[i]);
            }
            else if(customers[i] == 50 || customers[i] == 100) {

            }

        }
    }
        public static void ChangeOperations(int[] ticket){


    }
}