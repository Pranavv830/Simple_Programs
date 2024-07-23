package arrayPrograms;

public class MaxRepeated {

	public static void main(String[] args) {
		
		int[] ar = {2,2,3,4,2,2,2,2,1,1,0,2,1};
		
		int[] total = new int[ar.length];
		
		int xt = 1;
	    
		for (int i = 0; i < ar.length-1; i++) {
			if (ar[i] == ar[i+1]) {
				xt++;
			}
			else {
				xt = 1;
			}
			total[i+1] = xt;
		}
		int max = Integer.MIN_VALUE;
		int index = -1;
		
		for (int i = 0; i < total.length; i++) {
			if (total[i] > max) {
				max = total[i];
			}
		}
		if (index != -1) {
			System.out.println(ar[index]+" is repeated "+max+" times");
		}
	}
}
