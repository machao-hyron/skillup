package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

/**
 * �κ���ϰ1
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
	 * ��ϰ1-3
	 */
	public static void pratice1_3(){
		Scanner s = new Scanner(System.in);
        System.out.println("�����룺");
        //��ȡ�������ַ���������ΪnumString
        String numString = s.nextLine();
        
        int[] intArr2 = new int[numString.length()];
        //���ַ���ת��Ϊint����
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        s.close();
        //�ж��Ƿ����㰢ķ˹������������
        int numSum = 0;
        for (int i = 0; i < intArr2.length; i++) {
			int j = intArr2[i];
			numSum = numSum + j * j * j;
		}
        if (numSum == Integer.parseInt(String.valueOf(numString))) {
			System.out.println("���:TRUE");
		}else {
			System.out.println("���:FALSE");
		}
        
	}
	/**
	 * ��ϰ1-2
	 */
	public static void pratice1_2(){
		Scanner s = new Scanner(System.in);
        System.out.println("�����������ַ���");
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
			System.out.println("�����TRUE\n�ڶ����ַ��������ڵ�һ���ַ�����");
		}else if (stingLine_2.indexOf(stingLine_1) >= 0) {
			System.out.println("�����FALSE\n��һ���ַ��������ڵڶ����ַ�����");
		}else {
			System.out.println("�����FALSE\n�����ַ�����������");
		}

	}
	/**
	 * ��ϰ1-1
	 */
	public static void pratice1_1(){
        Scanner s = new Scanner(System.in);
        System.out.println("�������ַ���");
        List<String> input = new ArrayList();
        String stingLine;
        while(! (stingLine = s.nextLine()).equals("")) {
        	input.add(stingLine);
        }
        //��û�йر�Scanner���󽫻���־��� 
        s.close();
        System.out.println("���������");
        for (int i = input.size()-1; i >= 0; i--) {
            System.out.println(input.get(i)); 
		}
    }
	


}
