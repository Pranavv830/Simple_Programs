package arrayPrograms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		
		int search = sc.nextInt();
		
		int[] ar = {1,2,3,4,5,6,7,8,9};
		
		int start = 0 , end = ar.length-1 , mid = (start+end)/2;
		
		while(start <= end) {
			
			if (ar[mid] == search) {
				break;
			}
			else if (ar[mid] > search) {
				end = mid-1;
			}
			else if (ar[mid] < search) {
				start = mid+1;
			}
			mid = (start + end)/2;
		}
		
		if (ar[mid] == search) {
			System.out.println("number found at index "+mid);
		}
		else {
			System.out.println("element not found!");
		}
	}
}
