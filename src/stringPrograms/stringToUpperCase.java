package stringPrograms;

public class stringToUpperCase {

	public static void main(String[] args) {
		
		String ip = "Rohit";
		System.out.println(upper(ip));
	}

	public static String upper(String ip) {
		String ans ="";
		for (int i = 0; i < ip.length(); i++) {
			char ch = ip.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				ans = ans +(char) (ch-32);
			}
			else ans = ans+ch;
		}
		return ans;
	}
}
