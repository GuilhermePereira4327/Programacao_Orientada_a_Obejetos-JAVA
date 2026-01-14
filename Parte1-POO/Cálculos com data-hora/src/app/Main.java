package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2026-01-12");
		LocalDateTime d05 = LocalDateTime.parse("2026-01-12T01:30:36");
		Instant d06 = Instant.parse("2026-01-12T01:30:36Z");
		
		LocalDate pasteWeekLocalDate = d04.minusDays(7);
		System.out.println("pasteWeekLocalDate = " + pasteWeekLocalDate);	
		
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		LocalDateTime pasteWeekLocalDateTime = d05.minusDays(7);
		System.out.println("pasteWeekLocalDateTime = " + pasteWeekLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		Instant pasteWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println("pasteWeekInstant = " + pasteWeekInstant);
		
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pasteWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		System.out.println("t1 dias = " + t1.toDays());
		
		Duration t2 = Duration.between(pasteWeekLocalDateTime, d05);
		System.out.println("t2 dias = " + t2.toDays());
		
		Duration t3 = Duration.between(pasteWeekInstant, d06);
		System.out.println("t3 dias = " + t3.toDays());

		Duration t4 = Duration.between(d06, pasteWeekInstant);
		System.out.println("t4 dias = " + t4.toDays());

		
	}

}
