package testcases;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "سلام hello 01824345";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
		String s2 = "ахбөйыобөр سلام hey there 09988787";
		
		s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
	}

}
