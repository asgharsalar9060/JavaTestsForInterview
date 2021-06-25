package testcases;

public class ReverseString {

	public static void main(String[] args) {

		String st = "Hello world";
		
		//1st method
		int len = st.length();
		String reverse = "";//maintain an empty String variable to return the string
		
		for(int i=len-1; i>=0; i--) {
			reverse = reverse + st.charAt(i);//1st reverse is empty then it appends st
		}
		System.out.println(reverse);
		
		//2nd method
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());
		
		
	}

}
