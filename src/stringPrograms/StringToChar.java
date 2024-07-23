package stringPrograms;

import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) {
		
		String ip = "tejas";
		
		char ans[] = convertToString(ip);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	public static char[] convertToString(String ip) {
		
		char[] ch = new char[ip.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = ip.charAt(i);
		}
		return ch;
	}
}
