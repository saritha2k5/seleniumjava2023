package amazon_pac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reg_example {

	
	public static void main(String[] args) {
		
		
		/*String inputstr="Test String";
		String pattern="Test Sting";
				boolean patternmatched=Pattern.matches(pattern, inputstr);
				System.out.println(patternmatched);
				*/
		
		String input="E3";
		Pattern p=Pattern.compile("^[A-Z][0-9]&");
		Matcher m=p.matcher(input);
		if(!m.find())
		{
			System.out.println("Enter code start with uppercase alphabet and end with digit");
		}
		
		else
			System.out.println("pass");
	}
}
