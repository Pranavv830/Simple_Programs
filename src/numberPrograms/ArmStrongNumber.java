package numberPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num == checkArmStrong(num)) {
			System.out.println("it is ArmStromg number");
		}
		else {
			System.out.println("it is not a ArmStrong Number");
		}
	}
	public static int checkArmStrong(int num) {
		int ct = count(num);
		int sum = 0;
		
		while(num>0) {
			int rem = num%10;
			sum = sum + power(rem , ct);
			num/=10;
		}
		
		return sum;
	}
	
	public static int power(int rem, int ct) {
		int pow = 1;
		
		for (int i = 0; i < ct ; i++) {
			pow = pow * rem;
		}
		return pow;
	}
	public static int count(int num) {
		int ct = 0;
		
		while(num>0) {
			ct++;
			num/=10;
		}
		return ct;
	}
	
	
	
}
