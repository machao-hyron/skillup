package excise1;

public class CheckIfContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] toCompare = args[0].toCharArray();
		char[] data = args[1].toCharArray();
		boolean result = false;
		for (int i = 0; i < toCompare.length; i++) {
			int origLength = 0;
			if (toCompare.length-i < data.length)break;
			for (int j = 0; j < data.length; j++) {
				
				if (data[j]!=toCompare[j+i]) {
					break;
				}
				origLength++;
			}
			if (data.length == origLength) {
				result = true;
			}
		}
		System.out.println(result ? "TRUE" : "FALSE");
	}

}
