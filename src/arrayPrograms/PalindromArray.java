package arrayPrograms;

public class PalindromArray {

	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5,4,3,2,1};
		
		int i , j = ar.length-1;
		
		for (i = 0; i < ar.length/2; i++) {
			if (ar[i] != ar[j]) {
				break;
			}
			j--;
		}
		if (i >= j) {
			System.out.println("it is a palindrom Array");
		}
		else {
			System.out.println("it is not a palindrom Array");
		}
	}
	
}
