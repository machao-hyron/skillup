package javatest;

public class TestOne {
    public static void main(String[] args) {
        String[] arr = new String[]{"A", "B", "C", "Dog"};
        String s = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = s;
        for (String arr1 : arr) {
            if (arr1 == arr[0] || arr1 == arr[arr.length - 2]) {
                System.out.println(arr1);
            } else {
                System.out.printf("%s" + " ", arr1);
            }
        }
    }


}
