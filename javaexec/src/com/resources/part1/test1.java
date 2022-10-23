package com.resources.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 课后练习1-1
 */
public class test1 {
	public static void main(String[] args) {
		printstring1();
	}
	
	 //将输入的字符串数组的顺序倒转
	public static void printstring1(){
		System.out.println("Please enter !");
		Scanner scan1 = new Scanner(System.in);
		//输入字符串
		int num=3;
		List<String> stringlist1 =new ArrayList<>();
		for (int i=0;i<num;i++) {
			stringlist1.add(scan1.nextLine());
		}
		//输出字符串
		System.out.println("Your input is:");
		int length = stringlist1.size();
		for(int j=length-1;j>=0;j--) {
			System.out.println(stringlist1.get(j));
		}
		//关闭scanner
		scan1.close();
	}
	
}
