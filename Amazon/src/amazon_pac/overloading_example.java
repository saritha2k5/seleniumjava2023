package amazon_pac;


class Car {
	 int noOfCylinders;
	 int noOfValves; 
	 int enginePower;
	 boolean isPowerSteering;
	 Car(){
	 //1. default no-argument constructor 
		 noOfCylinders = 3;
	 noOfValves = 4;
	 enginePower = 48;	//48 ps  
	 isPowerSteering = false;
	 }
	 Car(boolean isPowerSteering){
	 // 2. constructor with 1 arg 
		 this();
	 this.isPowerSteering = isPowerSteering;
	 }
	 Car(int enginePower,int noOfCylinders, int noOfValves){
	 // 3. constructor with // 3 args 
		 this.noOfCylinders = noOfCylinders;  
		 this.noOfValves = noOfValves ; 
		 this.enginePower = enginePower; 
		 this.isPowerSteering = true;
	 }
	 }


public class overloading_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car ca=new Car();
System.out.println(ca.noOfCylinders);
		
	Car ca1=new Car(true);
	
	System.out.println(ca1.isPowerSteering);
	
	Car ca2=new Car(3,5,6);
	System.out.println(ca2.enginePower);
	System.out.println(ca2.isPowerSteering);
	
			
	
	}

}
