package strings.mypackage;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("");
		for(char ch='a'; ch<='z'; ch++) {
			sb.append(ch);
		}
		System.out.println(sb);
		System.out.println(sb.length());

	}

}
