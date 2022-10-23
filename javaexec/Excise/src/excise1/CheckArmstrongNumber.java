package excise1;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int backUp = num;
		int result = 0;
		do {
			int a = num%10;
			result += Math.pow(a, args[0].length());
			num/=10;
		} while (num%10!=0);
		System.out.println(backUp==result? "TRUE" : "FALSE");
	}

}
