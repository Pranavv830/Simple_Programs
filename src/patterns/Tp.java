package patterns;

public class Tp {

	public static void main(String[] args) {
		
//		int m = 5;
//		int n = 5;
//		
//		for(int i=1 ; i<=m ; i++) {
//			for(int j=1 ; j<=n ; j++) {
//				if (i==1 || j==1 || i==m || j==n) {
//					System.out.print(" * ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		int n = 4;
//		
//		for(int i=1 ; i<=n ; i++) {
//			
//			for(int j=1 ; j<=n-i ; j++) {
//				System.out.print("   ");
//			}
//			
//			for(int k=1 ; k<=i ; k++) {
//				System.out.print(" * ");
//			}
//			
//			System.out.println();
//		}
		
		int n = 5;
		int num = 1;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print(num+++" ");
			}
			System.out.println();
		}
	}
	https://github.com/Pranavv830/demo.git
	
}
