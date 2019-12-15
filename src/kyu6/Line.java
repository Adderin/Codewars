package kyu6;

public class Line {
    static int[] customers = {25, 25, 50};
    public static int count_25 = 0;
    public static int count_50 = 0;
    public static int count_100 = 0;

    public static void main(String[] args) {
        TicketSale(customers);
        System.out.printf("25: %d and 50: %d", count_25, count_50);
    }

    public static String TicketSale(int[] customers) {
        for (int i = 0; i < customers.length; i++) {
            switch (customers[i]) {
                case 25:
                    count_25++;
                    break;
                case 50:
                    ChangeOperations(customers[i]);
                    count_50++;
                    break;
                case 100:
                    ChangeOperations(customers[i]);
                    count_100++;
                    break;
                default:
                    System.out.println("Something went wrong!");
                    return "NO";
            }
        }
    return "YES";}

    public static void ChangeOperations(int ticket) {
        switch (ticket) {
            case 50:
                if (count_25 >= 1) {
                    count_25--;
                }
                break;
            case 100:
                if (count_50 >= 1 && count_25 >= 1) {
                    count_50--;
                    count_25--;
                } else if (count_25 >= 3) {
                    count_25 = count_25 - 3;
                }
                break;
        }
    }

}
