package test;

public class Contain {
    public void contain(String a , String b){
        boolean status = a.contains(b);
        if (status){
            System.out.println("输出:"+'\n'+"TRUE");
        }else {
            System.out.println("输出:"+'\n'+"FALSE");
        }
    }
}
