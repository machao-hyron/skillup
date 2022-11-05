package javatest;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = n;//用于计算输入值位数
        int i = 0, j, temp, count = 0;
        temp = n;
        while (q > 0) {
            q = q / 10;
            count++;
        }//count为输入值位数
        while (n > 0) {
            j = n % 10;
            n = n / 10;
            i = i + ((int) Math.pow(j, count));//输入数的每一位的count次方
        }
        if (temp == i)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }

}


