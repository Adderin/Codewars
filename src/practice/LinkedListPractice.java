package practice;

import java.util.LinkedList;

class LinkedListPractice {
    public void show() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Element1");
        list.add("Element2");
        System.out.println(list.getFirst());
    }
}
class Main {
    public static void main(String[] args) {
        LinkedListPractice practice = new LinkedListPractice();
        practice.show();
    }
}