package kyu6;

public class Line {
    static int[] customers = {25, 25, 25, 25, 50, 100, 50};
    public static int count_25 = 0;
    public static int count_50 = 0;
    public static int check = 0;

    public static void main(String[] args) {

        System.out.println("Sale was successful: " + TicketSale(customers));
        System.out.printf("25: %d and 50: %d", count_25, count_50);
    }

    public static String TicketSale(int[] customers) {

        for (int i = 0; i < customers.length; i++) {
            switch (customers[i]) {
                case 25:
                    count_25++;
                    break;
                case 50:
                    check = ChangeOperations(customers[i]);
                    if(check==1) return "NO";
                    count_50++;
                    break;
                case 100:
                    check = ChangeOperations(customers[i]);
                    if(check==1) return "NO";
                    break;
            }
        }
    return "YES";}

    public static int ChangeOperations(int ticket) {
        switch (ticket) {
            case 50:
                if (count_25 >= 1) {
                    count_25--;
                }
                else return 1;
                break;
            case 100:
                if (count_50 >= 1 && count_25 >= 1) {
                    count_50--;
                    count_25--;
                } else if (count_25 >= 3) {
                    count_25 = count_25 - 3;
                } else return 1;
                break;
        }
        return 0;
    }

}
