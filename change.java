import java.util.Scanner;

public class change{
	
	public static void main(String args[]) {
		int functionID;
		int sysstatus=1;
		int funstatus=1;
		System.out.println("System Is Started");
		for(int i=1 ;i==sysstatus;) {
		
			System.out.println("Please Choose Function");
			System.out.println("choose:1;2;3;4;");
			System.out.println("***Enter Other Is End***");
			Scanner src=new Scanner(System.in);
			functionID=src.nextInt();
			switch(functionID) {
				case 1:{
					System.out.println("Change String Place Function");
					for(int j=1;j>0;) {
						System.out.println("Please Enter 3 Num");
						function1();
						System.out.println("Run Again?1;0");	
						funstatus=src.nextInt();
						j=funstatus;
					}
					break;
				}
				case 2:{
					System.out.println("Find String Function");
					for(int j=1;j>0;) {
						System.out.println("Please Enter 2 String");
						function2();
						System.out.println("Run Again?1;0");	
						funstatus=src.nextInt();
						j=funstatus;
					}
					break;
				}
				case 3:{
					System.out.println("Is amusitelang int Function");
					for(int j=1;j>0;) {
						System.out.println("Please Enter 1 Int");
						function3();
						System.out.println("Run Again?1;0");	
						funstatus=src.nextInt();
						j=funstatus;
					}
					break;
				}
				case 4:{
					System.out.println("Car Function");
					for(int j=1;j>0;) {
						System.out.println("Please Enter Speed And Status");
						function4();
						System.out.println("Run Again?1;0");	
						funstatus=src.nextInt();
						j=funstatus;
					}
					break;
				}
				default:{
					sysstatus=0;
				}
			}
		
		}

	}
	
	public static void function1() {
		int index = 3;
		String temp;
		String[] a = new String[index];
		Scanner src = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]= src.nextLine();
		}
		for(int i=0;i<a.length/2;i++) {
			temp = a[i];
			a[i] =a[a.length-1-i];
			a[a. length-1-i] = temp;
		}
		for(int i=0;i<a. length;i++) {
			System.out.println(a[i]);
		}
	}	
	
	public static void function2() {
		String[]b = new String[2];
		Scanner src = new Scanner(System.in);
		for(int i=0;i<b.length;i++) {
			b[i]=src.nextLine();
		}
		if (b[0].indexOf(b[1])>0){
			System.out.println("TRUE");
			System.out.println(b[0].indexOf(b[1]));
		}else{
			System.out.println("FALSE");
		}
	}
	
	
	public static void function3() {
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		Scanner src = new Scanner(System.in);
		c = src.nextInt();
		e = c;
		f = c;
		d = 0;
		for(int i=1;c/10>=1;i++) {
			c = c/10;
			d = i+1;
		}
		c = 0;
		for(int i=0;i<d;i++) {
			c = (int)(c+Math.pow(f%10, d));
			f=f/10;
		}
		if(e==c) {
			System.out.println("TRUE");
		}else {
			System.out.println("FLASE");
		}
		
	}
	
	public static void function4() {
		car x1=new car();
		x1.set(true,1,"yellow");
//		x1.color="yellow";
//		x1.seat();
		car x2=new car();
		x2.set(true,2,"blue");
//		x2.color="blue";
//		x2.seat();
		car x3=new car();
		for (int i=1;i>0;) {
			int speed =0;
//			int c=0;
			Scanner src = new Scanner(System.in);
			System.out.println("Please Enter Speed");
			speed=src.nextInt();
//			System.out.println("Please Enter Status");
//			c=src.nextInt();
//			x1.status(c);
			x1.speedon (speed);
			x2.speedon (speed);
			x3.speedon (speed);
			System.out.println("*******************");
			System.out.println("Car1:"+x1.toString());
			System.out.println("Car2:"+x2.toString());
			System.out.println("Car3:"+x3.toString());
			System.out.println("*******************");
			System.out.println("Is continue?1;0");
			i=src.nextInt();
		}

	}
	
}
class car{
	int LOCK = 0;
	int ON   = 1;
	int START= 2;
	private int speed =0;
	private boolean isSeated = false;
	private int status = LOCK;
	String color="black";
	
	public void set (boolean a,int b,String c){
		this.color =c;
		this.isSeated = a;
		this.status = b;
	}
	public void speedon (int temp){
		if(this.isSeated && this.status==this.START){
		this.speed = this.speed +temp;
		}
	}
	public void seat(){
		this.isSeated = true;
	}
	public void status (int temp2) {
		switch(temp2){
		case 0 : this.status= this.LOCK ; this.speed = 0;break;
		case 1 : this.status= this. ON ;this.speed = 0;break;
		case 2 : this.status= this.START ;break;
		default: this.status=this.LOCK;break;
		}
	}
	public String toString(){
		String a="";
		if(speed!=0) {
		
			a=" speed: "+speed+":color: "+color+";";
		
			return a;
		}else{
			a="car is stopping:"+"isSeated:"+isSeated+";co1or:"+color+";status:"+status;
			return a;
		}
	}
}
	
	