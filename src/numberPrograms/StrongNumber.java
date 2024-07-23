package numberPrograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
       
        int ans = fact(num);
        if (ans == num) {
			System.out.println("it is strong number");
		}
        else {
        	System.out.println("it is not a strong number");
		}
        
	}
	public static int fact(int num) {
	    int sum = 0;
	    
		while(num>0) {
			int facto = 1;
			int rem = num%10;
			
			for (int i = 1; i <= rem; i++) {
				facto = facto * i;
			}
			sum = sum+facto;
			num/=10;	
		}
		return sum;
	}
}
