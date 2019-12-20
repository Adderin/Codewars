package practice;

public class InitializationPractice {
    private String name = "Let's rock";
    { System.out.println(name);}
    private static int COUNT = 0;
    static { System.out.println(COUNT);}
    static { COUNT+=10; System.out.println(COUNT);}
    public InitializationPractice() {
        System.out.println("Constructor");
    }
}

class CallInitializationPractice {
    public static void main(String[] args) {
        InitializationPractice init = new InitializationPractice();
    }
}