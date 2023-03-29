package chap15_usefulClass;

import java.util.Calendar;

public class _19_differeceOfTwoDate {

	public static void main(String[] args) {

		
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2011, 2, 11);
		
		//getTimeInMill() : long타입으로 지정된 날짜를
		//					밀리세컨드로 리턴.
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지" + 
						(diff / 1000) + "초가 지났습니다.");
		
		System.out.println("d2부터 d1까지" + 
				(diff / (1000 * 60)) + "분이 지났습니다.");
		
		System.out.println("d2부터 d1까지" + 
				(diff / (1000 * 60 * 60)) + "시간이 지났습니다.");
		
		System.out.println("d2부터 d1까지" + 
				(diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다.");
		
		System.out.println("d2부터 d1까지" + 
				(diff / ((long)1000 * 60 * 60 * 24 * 30)) + "달이 지났습니다.");
		
		System.out.println("d2부터 d1까지" + 
				(diff / ((long)1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다.");
		
		
		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (1000 * 60) % 60;
		long diffHours = diff / (1000 * 60 * 60) % 24;
		long diffDays = diff / (1000 * 60 * 60 * 24);
		long diffMonths = diff / diffDays / 30;
		long diffYears = diff / diffMonths / 12;
		
		String result = String.format("%d년 %d개월 %d일 %d시간 %d분 %d초가 지났습니다.",
				diffYears, diffMonths % 12, diffDays, diffHours, diffMinutes, diffSeconds);
		
		System.out.println(result);
		
	
		long year = diff /
				 ((long)1000 * 60 * 60 * 24 * 365);
		diff = diff %
				 ((long)1000 * 60 * 60 * 24 * 365);
		long month = diff /
				((long)1000 * 60 * 60 * 24 * 30);
		diff = diff %
				((long)1000 * 60 * 60 * 24 * 30);
		long date = diff /
				((long)1000 * 60 * 60 * 24);
		diff = diff %
				((long)1000 * 60 * 60 * 24);
		long hour = diff /
				((long)1000 * 60 * 60);
		diff = diff %
				((long)1000 * 60 * 60);
		

				
		

	}

}
