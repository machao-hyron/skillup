package test;

public class test1 {

    public static void main(String[] args) {
        String[] arr = new String[]{"A","BC","dog"};
        System.out.println("输出:");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+'\n');
        }
    }
}
