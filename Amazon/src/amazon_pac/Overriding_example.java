package amazon_pac;

class Parent_SwipeMachine
{  
	void TV (){
	// functionality to read normal cards
		
		System.out.println("I am parent TV");
	}
	}

class Child_ChipCardMachine extends Parent_SwipeMachine

{  
	void TV(){
		System.out.println("I am Child TV");
		super.TV();
	//functionality to read chip card
	}
	}
	
public class Overriding_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  
			Child_ChipCardMachine normal = new Child_ChipCardMachine();
		normal.TV();
		
		//reading normal swipe card  
		//normal = new ChipCardMachine();
		//normal.readCard();	//reading chip based swipe card
		} }
	}


