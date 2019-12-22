package kyu6;
public class StrongestEvenNumber {

    public static int strongestEven(int n, int m) {
        int strongness = 0;
        int max = 0;
        for(int i = n; i <= m; i++) {
            if(checkStrength(i) > strongness) {
            strongness = checkStrength(i);
            max = i;
            }

        }
        return max;
    }
    public static int checkStrength(int x) {
        int strongness = 0;
        while(x%2 == 0) {
            x = x/2;
            strongness++;
        }
        return strongness;
    }

    public static void main(String[] args) {
        System.out.println(strongestEven(1,2));
    }
}