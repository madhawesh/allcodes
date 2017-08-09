package pro1.pro2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import org.eclipse.jetty.util.log.Log;
import org.testng.annotations.Test;

public class DateTest {
	public Logger log;
	@Test
	public void test1(){
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -10);
	    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd"); // you can specify your format here...
	   /* Log.d("DATE","Date before 90 Days: " + s.format(new Date(cal.getTimeInMillis())));*/
	 
	}

}
