package strings.mypackage;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Tony";
		String str2 = "Tony";
		String str3 = new String("Tony");
		
		//using == operator
		if(str1 == str2) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		if(str1 == str3) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		//using .equals function which returns boolean value
		if(str1.equals(str3)) {
			System.out.println("String are equal");
		}else {
			System.out.println("Strings are not equal");
		}

	}

}
