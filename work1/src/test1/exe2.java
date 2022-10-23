package test1;
import java.util.*;

public class exe2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("请输入数据1");
        String list1 = s1.nextLine();
        System.out.println("请输入数据2");
        String list2 = s2.nextLine();
        System.out.println("结果为：");
        if (list1.indexOf(list2)!=-1){//indexOf用法，如果包含，返回值是会在父类字符串的其实位置，不包含的话，则会返回-1
            System.out.println(list1+"\t"+" 包含 "+"\t"+list2);
        }else {
            System.out.println(list1+"\t"+" 不包含 "+"\t"+list2);
        }

    }
}
