package com.resources.part1;

import java.util.Scanner;

/*
 * 课后练习1-3
 */
public class test3 {
	public static void main(String[] args) {
		System.out.println("Please enter !");
		Scanner scan1 = new Scanner(System.in);
		//输入数字
		int num = scan1.nextInt();
		printstring3(num);
		scan1.close();
	}
	
	 //判断一个数字是否是阿姆斯特朗数
	public static void printstring3(int number){
		int input = number;
		int in = number;
		int n=0;//位数
		int result=0;
		while(number!=0) {
			number = number/10;
			n++;
		}
		int x=0;
		//取每位的数字
		for (int i=1;i<=n;i++) {
			if(i==1) {
				x=in%10;
				in=in-x;
			}else {
				in=in/10;
				if(i==n) {
					x=in;
				}else {
					x=in%10;
					in=in-x;
				}
			}
			result=result+pow(x,n);
			//System.out.println("x:"+x);
			//System.out.println("result:"+result);
			}
		//判断
		if(input ==result) {
			System.out.println("TRUE!");
		}else{
			System.out.println("FALSE!");
		}
		//System.out.println("n:"+n);
		//System.out.println("input:"+input);
		x=0;
	}

	private static int pow(int x, int y) {
		// 计算次方
		int powner=1;
		for (int j=0;j<y;j++) {
			powner=powner*x;
		}
		return powner;
	}
}