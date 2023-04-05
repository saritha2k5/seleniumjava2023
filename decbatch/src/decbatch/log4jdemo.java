package decbatch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {

	private static Logger logger=LogManager.getLogger(log4jdemo.class);
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello world");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
	}
}
