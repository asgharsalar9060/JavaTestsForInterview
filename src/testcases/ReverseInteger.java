package testcases;

public class ReverseInteger {

	public static void main(String[] args) {

		//using algo
		long num = 12345;//54321
		long rev = 0;
		
		while(num !=0) {
			rev = rev * 10 + num % 10;//5432
			num = num / 10;//12
		}
		System.out.println("reverse num is: " + rev);

		//using StringBuffer
		long num2 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
	}

}
