package training.solution6;

/**
 * Solution6 - Seconds to days, hours and seconds
 */
public class Solution6
{
    public static void main( String[] args )
    {
    	System.out.println(convertSecondsToDHMS(6012345));
    }
    
    private static String convertSecondsToDHMS(int seconds) {
    	int minute = 60;
    	int hour = 3600;
    	int day = 86400;
    	
    	int numberOfDays = seconds / day;
    	int numberOfHours = (seconds % day ) / hour ;
    	int numberOfMinutes = ((seconds % day ) % hour ) / minute ;
    	int numberOfSeconds = ((seconds % day ) % hour ) % minute  ;

    	return String.format(" %d seconds are %d days, %d hours, %d minutes, %d seconds",
    			seconds, numberOfDays, numberOfHours, numberOfMinutes, numberOfSeconds);
    }
}
