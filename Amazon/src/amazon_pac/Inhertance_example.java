package amazon_pac;

public class Inhertance_example {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drived d=new Drived();
		d.drivedmethod();
	
		}

}

class Base
{
	int i=10;
	
	public void basemethod()
	{
		System.out.println("BASE");
	}
}

class Drived extends Base
{

	public void drivedmethod()
	{
		super.basemethod();
		
		System.out.println("Derived");
	}
}
