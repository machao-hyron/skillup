package excise1;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String [] args){
		String[] newArray =new String[args.length];
		for(int i =args.length, j=0; i>0; i--,j++){
			newArray[j] = args[i-1];
		}
		Arrays.stream(newArray).forEach(System.out::println);
	}
}
