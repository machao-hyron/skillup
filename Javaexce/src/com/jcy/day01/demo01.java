package com.jcy.day01;

import java.util.Arrays;
import java.util.Random;

public class demo01 {

    private static final String basestr = "qwertyuiopasdfghjklzxcvbnmQAZXSWEDCVFRTGBNHYUJMKIOLP1234567890!@#$%^&*()";

    /**
     * 主函数入口
     * @param args
     */
    public static void main(String[] args) {
        //作业1.1 start
        String[] sarr1 = getStrarr(20);
        System.out.println("原字符串数组：" + Arrays.toString(sarr1));
        System.out.println("字符串数组的顺序倒转");
        System.out.println("倒序之后字符串数组：" + Arrays.toString(strarrReverse(sarr1)));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //作业1.1 end
        //作业1.2 start
        String[] sarr2 = getStr(true);
        String str01 = sarr2[0];
        String str02 = sarr2[1];
        System.out.println("字符串1：" + str01);
        System.out.println("字符串2：" + str02);
        System.out.println("包含关系：" + containJudgment(str01,str02));
        String[] sarr3 = getStr(false);
        String str03 = sarr3[0];
        String str04 = sarr2[1];
        System.out.println("字符串1：" + str03);
        System.out.println("字符串2：" + str04);
        System.out.println("包含关系：" + containJudgment(str03,str04));
        //作业1.2 end
        //作业1.3 start
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(ArmstrongnumberJudgment(number));
        System.out.println(ArmstrongnumberJudgment(153));
        //作业1.3 end

    }

    /**
     * 数组倒序
     * @param arr
     * @return
     */
    public static String[] strarrReverse(String[] arr){
        String[] str = new String[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++){
            str[i] = arr[j-1];
            j--;
        }
        return str;
    }

    /**
     * 字符串包含关系判断
     * @param str01
     * @param str02
     * @return
     */
    public static boolean containJudgment(String str01,String str02){
        if (str01.length() >= str02.length()){
            return str01.indexOf(str02) !=-1;
        }else {
            return str02.indexOf(str01) !=-1;
        }
    }

    /**
     * 判断是否为阿姆斯特朗数
     * @param number
     * @return
     */
    public static boolean ArmstrongnumberJudgment(int number){
        if (number < 0){
            number = number * -1;
        }
        System.out.println("输入的整数为：" + number);
        String numstr = String.valueOf(number);
        System.out.println("转化的字符串为：" + numstr);
        int length = numstr.length();
        System.out.println("整数的长度为：" + length);
        char[] c = numstr.toCharArray();
        System.out.println("字符串转化的字符数组为：" + Arrays.toString(c));
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            System.out.println("获取的单字符：" + c1);
            int j = Integer.parseInt(String.valueOf(c1));
            System.out.println("转化为整数：" + j);
            sum += Math.pow(j,length);
            System.out.println("获取的和为：" + sum);
        }
        System.out.println("获取的最终和为：" + sum);
        return sum == number;
    }

    /*------------------------------------------------作业之外代码，可无视--------------------------------------------------*/

    /**
     * 字符串数组随机生成
     * @param length
     * @return
     */
    public static String[] getStrarr(int length){
        String[] str = new String[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            /*随机生成字符串的长度*/
            int strlen = random.nextInt(10);
            /*随机生成一个字符串*/
            for (int j = 0; j < strlen+1; j++) {
                int index = random.nextInt(basestr.length());
                char c = basestr.charAt(index);
                stringBuffer.append(c);
            }
            /*转化为字符串类型*/
            String str2 = stringBuffer.toString();
            /*将字符串添加到数组*/
            str[i] = str2;
        }
        return str;
    }

    /**
     * 获取两个字符串
     * @param flag
     * @return
     */
    public static String[] getStr(boolean flag){
        String[] str = new String[2];
        Random random = new Random();
        int index = random.nextInt(10);
        StringBuffer stringBuffer = new StringBuffer();
        /*随机生成第一个字符串*/
        for (int j = 0; j < index + 1; j++) {
            int index_base = random.nextInt(basestr.length());
            char c = basestr.charAt(index_base);
            stringBuffer.append(c);
        }
        String str01 = stringBuffer.toString();
        str[0] = str01;
        stringBuffer.delete(0,stringBuffer.length());
        /*随机生成第二个字符串*/
        /*增加包含可能性的概率为100%*/
        if (flag){
            for (int j = 0; j < index + 5; j++) {
                int index_base = random.nextInt(basestr.length());
                char c = basestr.charAt(index_base);
                stringBuffer.append(c);
            }
            int appendindex = random.nextInt(index + 5);
            stringBuffer.insert(appendindex,str01);
            String str02 = stringBuffer.toString();
            str[1] = str02;
        /*随机生成，不增加概率*/
        }else {
            for (int j = 0; j < index; j++) {
                int index_base = random.nextInt(basestr.length());
                char c = basestr.charAt(index_base);
                stringBuffer.append(c);
            }

            String str02 = stringBuffer.toString();
            str[1] = str02;
        }
        return str;
    }




}
