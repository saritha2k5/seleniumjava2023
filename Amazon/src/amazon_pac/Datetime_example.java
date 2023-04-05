package amazon_pac;

import java.time.Duration;
import java.time.Instant;

public class Datetime_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant CT=Instant.now();
		System.out.println(CT);
		System.out.println(CT.plus(Duration.ofDays(30)));
		
		System.out.println(CT.minus(Duration.ofDays(30)));
		

	}

}
