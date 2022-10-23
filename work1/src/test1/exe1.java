package test1;
import java.util.*;

public class exe1 {
    public static void main(String[] args) {
        //在代码里写死数组进行数据处理
        String[] str = {"A","B C","dog"};
        System.out.println("正常顺序："+"\t"+Arrays.toString(str));
        for (int x=0,y=str.length-1;x<=y;x++,y--){      //直接数组元素对换
            String temp = str[y];
            str[y] = str[x];
            str[x] = temp;
        }
        System.out.println("倒序顺序："+"\t"+Arrays.toString(str));


        //从键盘接受输入数据进行处理
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数据");
        String list = in.nextLine();
        System.out.println("正常顺序：");
        System.out.println(list);
        StringBuffer buffer = new StringBuffer(list);//直接使用reverse方法，反向排序
        System.out.println("倒序顺序：");
        System.out.println(buffer.reverse());
    }
}
