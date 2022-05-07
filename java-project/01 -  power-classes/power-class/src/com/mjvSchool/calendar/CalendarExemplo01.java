package com.mjvSchool.calendar;

import java.util.Calendar;

public class CalendarExemplo01 {

	public static void main(String[] args) {

		// Pega do sistema
		
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario.getTime());
		System.out.println(calendario.get(Calendar.YEAR));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));

		// Seta a data
		Calendar calendario2 = Calendar.getInstance();
		calendario2.set(Calendar.YEAR, 1998);
		calendario2.set(Calendar.MONTH, 05);
		calendario2.set(Calendar.DAY_OF_MONTH, 20);
		calendario2.set(Calendar.HOUR,8);
		calendario2.set(Calendar.MINUTE,20);
		System.out.println(calendario2.getTime());
		System.out.println(calendario2.get(Calendar.YEAR));
		System.out.println(calendario2.get(Calendar.MONTH));
		System.out.println(calendario2.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario2.get(Calendar.HOUR));
		System.out.println(calendario2.get(Calendar.MINUTE));
		
	}

}
