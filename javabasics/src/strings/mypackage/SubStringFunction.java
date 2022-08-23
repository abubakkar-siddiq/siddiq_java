package strings.mypackage;

public class SubStringFunction {
	
	public static String substring(String str, int si, int ei) {
		String substr = "";
		
		for(int i=si; i<ei; i++) {
			substr += str.charAt(i);
		}
		return substr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		//System.out.println(substring(str, 0, 5));
		
		
		System.out.println(str.substring(0, 5)); //inbuild function

	}

}
