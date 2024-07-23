package stringPrograms;

public class RemoveSubString {

	public static void main(String[] args) {
		
		String str = "rajesh";
		String sub = "je";
		
		System.out.println(removeString(str,sub).toString());
		
	}

	public static String removeString(String str, String sub) {

		String ans ="";
		if (str.contains(sub)) {
			
			
			int start = str.indexOf(sub);
			
			if (start != -1) {
				for (int i = 0; i < str.length(); i++) {
					if (i < start || i >= start + sub.length()) {
						ans=ans+str.charAt(i);
					}
				}
			}
			
		}
		else {
			ans=str;
		}
		return ans;
	}
	
	
}
