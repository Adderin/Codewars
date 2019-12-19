package others;

public class ConstructorPractice {
    public static String color;
    private int height;
    private int length;
    public ConstructorPractice(int height, int length, String color){
        this.length = length;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {
        ConstructorPractice c = new ConstructorPractice(2,3,"violet");
        System.out.println(c.height + " " + c.length + " " + c.color);
    }
}
