package excise1;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1-1");
		String[] inputStr1 = {"A", "B C", "dog"};
		ReverseArray.main(inputStr1);
		
		System.out.println("1-2");
		String[] inputStr2a ={"apple dog", "dog"};
		String[] inputStr2b ={"apple dog", "cat"};
		CheckIfContains.main(inputStr2a);
		CheckIfContains.main(inputStr2b);
		
		System.out.println("1-3");
		String[] inputStr3a ={"153"};
		String[] inputStr3b ={"154"};
		CheckArmstrongNumber.main(inputStr3a);
		CheckArmstrongNumber.main(inputStr3b);
	}

}
