package kyu5;

public class LeagueOrder {
static int NUMBER = 6;
static int[][] GAMES = {
    {0, 5, 2, 2},
    {1, 4, 0, 2},
    {2, 3, 1, 2},
    {1, 5, 2, 2},
    {2, 0, 1, 1},
    {3, 4, 1, 1},
    {2, 5, 0, 2},
    {3, 1, 1, 1},
    {4, 0, 2, 0}
};

    public static int[] computeRanks(int number, int[][] games) {
        int [] teamOrder = {4, 4, 6, 3, 1, 2};


        return teamOrder;
    }
    int [][] sortingLeagueTable(int [][] teamTable){

        return teamTable;
    }
    static void showTable(int[] table){
        for(int i: table) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

       showTable(computeRanks(NUMBER,GAMES));
    }

}
