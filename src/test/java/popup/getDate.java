package popup;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class getDate {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("dd/MMMM/yyyy");
		String date = format.format(new Date());
		System.out.println(date);
		
		LocalDateTime sysdate = LocalDateTime.now();
	   System.out.println(sysdate.getDayOfMonth());System.out.println(sysdate.getMonth());System.out.println(	sysdate.getYear());	
		
	

	}

}
