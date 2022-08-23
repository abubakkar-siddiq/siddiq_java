package strings.mypackage;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()- 1- i)) { 
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "racecar";
		
		System.out.println(isPalindrome(str));

	}

}
