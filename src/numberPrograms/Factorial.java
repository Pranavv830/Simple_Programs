package numberPrograms;

public class Factorial {

	public static void main(String[] args) {
		
    	int num = 5;
		int ans = 1;
//		
//		while(num != 0) {
//			 
//			ans *= num;
//			num--;
//		}
//		System.out.println(ans);
		
		
		for (int i = 1; i <= num; i++) {
			ans *= i;
		}
		System.out.println(ans);
	}
}
