package practice;

class InheritancePractice {
    private int data;

    public InheritancePractice(){
        data = 5;
    }

    public int getData() {
        return this.data;
    }
}
class Heir extends InheritancePractice{
    private int data;
    public Heir(){
        data = 6;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Heir myData = new Heir();
        System.out.println(myData.getData());
    }
}
