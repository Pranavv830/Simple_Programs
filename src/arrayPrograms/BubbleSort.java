package arrayPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] ar = {4,6,3,2,5,7,8,4};
		
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = 0; j < ar.length-1-i; j++) {
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
