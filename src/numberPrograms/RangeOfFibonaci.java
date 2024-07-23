package numberPrograms;

import java.util.Scanner;

public class RangeOfFibonaci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter staring num");
		int start = sc.nextInt();
		
		System.out.println("enter ending num");
		int end = sc.nextInt();
		
		int n1 = 0 , n2 = 1;
		int n3;
		
		for ( ; ; ) {
			n3 = n1+n2;
			
			if (n1 >= start && n1 <= end) {
				System.out.println(n1);
			}
			else if (n1>end) {
				break;
			}
			n1 = n2;
			n2 = n3;
		}
		
		
	}
}
