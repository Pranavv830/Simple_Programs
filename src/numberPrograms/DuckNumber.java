package numberPrograms;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		String num = sc.next();
		
//		while(num != 0) {
//			
//			int rem = num%10;
//			
//			if (rem == 0) {
//				break;
//			}
//			num/=10;
//		}
//		if (num == 0) {
//			
//			System.out.println("it is not a duck number");
//			
//		} else {
//			System.out.println("it is a duck number");
//		}
		
		int j;
		for (j = 1; j < num.length()-1; j++) {
			
			if (num.charAt(j)=='0') {
				break;
			}
			
		}
		if (num.charAt(0)=='0') {
			System.out.println("it is not a duck number");
		}
		else if (num.charAt(j)=='0') {
			System.out.println("it is duck number");
		} 
		else {
			System.out.println("it is not duck number");
		}
		
	}
}
