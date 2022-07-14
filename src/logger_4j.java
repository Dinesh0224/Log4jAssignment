import org.apache.log4j.Logger;

public class logger_4j {
public static Logger logger = Logger.getLogger(logger_4j.class);
	
	public static void main(String args[])
	{
		logger.info("This is Info Log");
		logger.debug("This is Debug Log");
		logger.warn("This is Warn Log");
		logger.error("THis is Error Log");
	}
}
