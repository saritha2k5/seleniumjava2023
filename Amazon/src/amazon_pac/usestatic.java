package amazon_pac;

public class usestatic {
	
	static int intnum1=3;
	static int intnum2;
	static
	{
		System.out.println("Static block initialized");
		intnum2=intnum1*5;
		
	}

	static void mymethod(int intnum3)
	{
		System.out.println("The num1 value is:"+intnum1);
		System.out.println("The num2 value is:"+intnum2);
		System.out.println("The num3 value is:"+intnum3);
		
	}
	
	
	public static void main(String[] args) {
		
		
		mymethod(500);
		
		// TODO Auto-generated method stub

	}

}
