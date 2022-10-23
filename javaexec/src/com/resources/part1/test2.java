package com.resources.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 课后练习1-2
 */
public class test2 {
	public static void main(String[] args) {
		printstring2();
	}
	
	 //判断后一个字符串是否包含在前一个字符串中
		public static void printstring2(){
			System.out.println("Please enter !");
			Scanner scan1 = new Scanner(System.in);
			//输入字符串
			List<String> stringlist1 =new ArrayList<>();
			for (int i=0;i<2;i++) {
				stringlist1.add(scan1.nextLine());
			}
			//判断后一个字符串是否包含在前一个中
			System.out.println("The result is:");
			String a,b;
			a=stringlist1.get(0);
			b=stringlist1.get(1);
			if (a.indexOf(b)!=-1) {
				System.out.println("TRUE!");
			}else {
				System.out.println("FALSE!");
			}
			//关闭scanner
			scan1.close();
		}
}
