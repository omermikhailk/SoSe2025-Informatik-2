import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		LocalDateTime nextMeeting = LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 0));
		LocalDateTime[] timeArray = new LocalDateTime[31];
		
		int currentMeetingMonth = nextMeeting.getMonthValue();
		int count = 0;

		while (true) {
			if (currentMeetingMonth == LocalDate.now().getMonthValue()) {
				if (count == 31) {
					break;
				}
				else {
					int dayValue = nextMeeting.getDayOfWeek().getValue();
					if (dayValue != 6 || dayValue != 7) {
						timeArray[count] = nextMeeting;
					}
					
					int day = nextMeeting.getDayOfMonth();
					if (day > 31) {
						day -= 30;
					}
					int month = nextMeeting.getMonthValue();
					int year = nextMeeting.getYear();
					nextMeeting = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(10, 0));

					count += 1;
				}
			}
		}

		System.out.println(Arrays.toString(timeArray));
	}
}
