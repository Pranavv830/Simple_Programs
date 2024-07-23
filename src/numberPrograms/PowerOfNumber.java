package numberPrograms;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		int base = 2;
		int raise = 6;
		
		int ans = 1;
		
		for(int i = 0; i < raise ; i++ ) {
			
			ans = ans*base;
		}
		System.out.println(ans);

	}
}
