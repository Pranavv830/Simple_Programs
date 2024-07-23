package numberPrograms;

import java.util.Scanner;

public class CheckFibonaci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		int num = sc.nextInt();
		
		int n1=0 , n2=1;
		int n3;
		
		while(true) {
			n3 = n1+n2;
			
			if(n3 == num) {
				System.out.println("it is a fibonaci number");
				break;
			}
			
			else if(n3 > num) {
				System.out.println("it is not a fibonaci number");
				break;
			}
			n1 = n2;
			n2 = n3;
			
		}
		
	}
}
