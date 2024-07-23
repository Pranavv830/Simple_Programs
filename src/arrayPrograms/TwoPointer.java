package arrayPrograms;

import java.util.Arrays;

public class TwoPointer {

	public static void main(String[] args) {
	
		int[] ar = {-1,0,3,-3,6,10,-5,20,-6};
		int p1 = 0 , p2 = ar.length-1;
		
		while(true) {
			
			while(true) {
				if(ar[p1] >= 0) {
					break;
				}
				p1++;
			}
			
			while(true) {
				if (ar[p2] < 0) {
					break;
				}
				p2--;
			}
			
			if (p1 < p2) {
				int temp = ar[p1];
				ar[p1] = ar[p2];
				ar[p2] = temp;
			}
			else {
				break;
			}
			
		}
		System.out.println(Arrays.toString(ar));
	}
	
}
