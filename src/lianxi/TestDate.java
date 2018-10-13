package lianxi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date2 = formater.format(date);
		System.out.println(date2);

		/*
		 * SimpleDateFormat formater1=new SimpleDateFormat("yyyy-MM-dd  ");
		 * date=new Date(115,3,6); String date3=formater.format(date);
		 * //System.out.println(date3);
		 */Calendar a = Calendar.getInstance();
		 	a.set(2018, 3, 6);
		 	int i=a.get(Calendar.WEEK_OF_YEAR);
		 	System.out.println(i);

	}

}
