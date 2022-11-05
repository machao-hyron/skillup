package javatest;

public class TestTwo {
    public static void main(String[] args) {
        String one = new String("apple dog");
        String two = new String("dog");
        if (one.indexOf(two) == -1) {
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }

    }
}
