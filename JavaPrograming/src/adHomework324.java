import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class adHomework324 {

	public static void main(String[] args) throws ParseException {

		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2001-12-19");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		
		while(true) {
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);
			
			if(year == 2022) {
				System.out.println("결혼기념일" + sdf.format(cal.getTime()));
				break;
			}
			int daylnyear = 365;
			if(((year%4==0 && year%100!=0)) || (year%400==0)) {
				daylnyear = 366;
			}
			
			if(date == daylnyear && month == 11) {
				cal.set(year + 1, 0, 1);
			} else if (date == 28 && month == 1 && daylnyear == 365){
				cal.set(year,2,1);
			} else if (date == 29 && month == 1 && daylnyear == 366) {
				cal.set(year,2,1);
			} else {
				cal.add(Calendar.DATE, 1);
			}
			
		}
	}

}
