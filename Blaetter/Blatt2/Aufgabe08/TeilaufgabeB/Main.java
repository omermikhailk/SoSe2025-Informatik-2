import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;

public class Main {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentDateAndTime = LocalDateTime.of(currentDate, currentTime);

		// Ich weiss nicht, wann genau die Klausur stattfindet, deswegen gehe ich davon aus, dass sie
		// am 01.08.2025 ist
		LocalDateTime examDateAndTime = LocalDateTime.of(LocalDate.of(2025, 8, 1), LocalTime.of(12, 0));

		Duration timeBetweenNowAndExam = Duration.between(currentDateAndTime, examDateAndTime);
		int hoursUntilExam = (int) timeBetweenNowAndExam.toHours();
		System.out.println(hoursUntilExam + " Stunden bis zur Klausur!");
	}
}
