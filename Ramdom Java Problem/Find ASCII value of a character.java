package prac1;




public class FindAscii {

	public static void main(String[] args) {

		//Type1
		char ch1 = 'a';
		int ascii1 = ch1;
		System.out.println("Type 1: "+ch1+" ASCII is "+ascii1);
		
		
		//Type2: TypeCast "char to int"
		char ch2 = 'c';		
		int ascii2 = (int) ch2;
        System.out.println("Type 2: "+ch2+" ASCII is "+ascii2);    

	}

}
