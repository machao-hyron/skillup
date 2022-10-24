package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

/**
 * 课后练习1
 * @author Youth
 *
 */
public class Practice1 {
	
	public static void main(String[] args){

//		pratice1_1();
//		pratice1_2();
		pratice1_3();
        }
	/**
	 * 练习1-3
	 */
	public static void pratice1_3(){
		Scanner s = new Scanner(System.in);
        System.out.println("请输入：");
        //获取的输入字符串，命名为numString
        String numString = s.nextLine();
        
        int[] intArr2 = new int[numString.length()];
        //将字符串转换为int集合
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        s.close();
        //判断是否满足阿姆斯特朗数字条件
        int numSum = 0;
        for (int i = 0; i < intArr2.length; i++) {
			int j = intArr2[i];
			numSum = numSum + j * j * j;
		}
        if (numSum == Integer.parseInt(String.valueOf(numString))) {
			System.out.println("输出:TRUE");
		}else {
			System.out.println("输出:FALSE");
		}
        
	}
	/**
	 * 练习1-2
	 */
	public static void pratice1_2(){
		Scanner s = new Scanner(System.in);
        System.out.println("请输入两个字符：");
        String stingLine;
        String stingLine_1 = null;
        String stingLine_2 = null;
        while(! (stingLine= s.nextLine()).equals("")) {
        	if (stingLine_1 == null) {
        		stingLine_1 = stingLine;
        		continue;
			}else if (stingLine_2 == null) {
				stingLine_2 = stingLine;
				continue;
			}else {
				break;
			}
        }
        s.close();
        if (stingLine_1.indexOf(stingLine_2) >= 0) {
			System.out.println("输出：TRUE\n第二个字符串出现在第一个字符串中");
		}else if (stingLine_2.indexOf(stingLine_1) >= 0) {
			System.out.println("输出：FALSE\n第一个字符串出现在第二个字符串中");
		}else {
			System.out.println("输出：FALSE\n两个字符串互不包含");
		}

	}
	/**
	 * 练习1-1
	 */
	public static void pratice1_1(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符：");
        List<String> input = new ArrayList();
        String stingLine;
        while(! (stingLine = s.nextLine()).equals("")) {
        	input.add(stingLine);
        }
        //若没有关闭Scanner对象将会出现警告 
        s.close();
        System.out.println("倒序输出：");
        for (int i = input.size()-1; i >= 0; i--) {
            System.out.println(input.get(i)); 
		}
    }
	


}
