package Typecasting;

public class Test {

	public static void main(String[] args) {
		int x;//32 bit of data
		long y=23456789L;//64 bit
		x=(int)y;
		System.out.println(x);
		
		float m=234.66f;
		int n=(int)m;
		System.out.println(n);
		//typecasting works well ABOVE
		/*Below NOT
		String name="Upsana";
		char nn=(char)name;//single characters don't work
		
		char k='Y';
		String l=(String)k;
		/*these are meant for special characters
		cannot convert string to characters*/
		char[] h= {'U', 'P', 'S'};
		String temp=h.toString();
		System.out.println(temp);

		char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
	     String helloString = new String(helloArray); 
	     System.out.println(helloString);
		
		
	}

}
