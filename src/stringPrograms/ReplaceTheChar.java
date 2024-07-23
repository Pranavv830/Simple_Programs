package stringPrograms;

public class ReplaceTheChar {

	public static void main(String[] args) {
		
		System.out.println(replace("banana",'a','e'));
	}

	public static String replace(String ip, char old, char naya) {
		String ans ="";
		
		for (int i = 0; i < ip.length(); i++) {
			if (ip.charAt(i)==old) {
				ans = ans + naya;
			}
			else {
				ans = ans + ip.charAt(i);
			}
		}
		return ans;
	}
}
