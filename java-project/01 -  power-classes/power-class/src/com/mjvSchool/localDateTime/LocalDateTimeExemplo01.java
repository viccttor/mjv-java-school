package com.mjvSchool.localDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeExemplo01 {

	public static void main(String[] args) {
		LocalDateTime data = LocalDateTime.now();
		System.out.println(data);
		System.out.println(data.getDayOfWeek().name()); 
	}

}
