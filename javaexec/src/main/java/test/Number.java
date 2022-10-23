package test;

import java.util.Scanner;

public class Number {
    public void number(int a){
        int len;
        int b,c;
        int d = 0;
        b=a;
        len=String.valueOf(b).length();
        while(b!=0)
        {
            c=b%10;
            d+=(int)Math.pow(c,len);
            b/=10;
        }
        if(a==d)
            System.out.println("输出:"+'\n'+"TRUE");
        else
            System.out.println("输出:"+'\n'+"FALSE");
    }

}
