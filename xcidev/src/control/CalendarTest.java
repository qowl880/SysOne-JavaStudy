package control;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2025, 2-1,1);
		int dayofweek = c.get(Calendar.DAY_OF_WEEK);		// 요일 구하기
		System.out.println(dayofweek);
		int end = c.getActualMaximum(Calendar.DAY_OF_MONTH);	// 달의 마지막 날짜 구하기
		
		System.out.println(end);
	}
}
