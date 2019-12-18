package others;

public class OverloadPractice {

    public void number (int i) {
        System.out.println("Integer");
    }
    public void number (double d) {
        System.out.println("Double");
    }
    public void number (short s) {
        System.out.println("Short");
    }
    public void number (byte b) {
        System.out.println("Byte");
    }
    public void number (long l) {
        System.out.println("Long");
    }
    public void number (float f) {
        System.out.println("Float");
    }
    public void number (Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        OverloadPractice over = new OverloadPractice();
        over.number(2);
        over.number(24.52);
        over.number(2123l);
        over.number(212.3f);
        over.number("Hi");
    }
}
