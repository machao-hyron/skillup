package test1;
import java.util.*;

public class exe3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入想要的数据");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        int length = String.valueOf(num).length();
        while (temp != 0){
            int rem = temp%10;
            sum+=(int)Math.pow(rem,length);
            temp/=10;
        }
        if (sum == num){
            System.out.println(num+"\t"+"yes");
        }else {
            System.out.println(num+"\t"+"no");
        }
    }
}
