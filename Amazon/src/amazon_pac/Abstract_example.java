package amazon_pac;


 abstract class Shape
{
	 abstract void draw();
	 {
		 
	 }
	
}

 class rectangle extends Shape
 {
	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
	
}
public class Abstract_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape r1=new rectangle();
		r1.draw();
		
	}

}
