import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String birthday;

		if (s.hasNextLine()) {
			birthday = s.nextLine();

			LocalDate birthdayDate = LocalDate.parse(birthday);
			int birthdayYear = birthdayDate.getYear();
			int currentYear = LocalDate.now().getYear();

			while(birthdayYear != currentYear) {
				birthdayYear += 1;
			}

			LocalDate birthdayCurrentYear = LocalDate.of(birthdayYear, birthdayDate.getMonthValue(), birthdayDate.getDayOfMonth());

			int daysUntilBirthday = (int) ChronoUnit.DAYS.between(LocalDate.now(), birthdayCurrentYear);

			System.out.println("Es gibt noch " + daysUntilBirthday + " Tage bis deinem Geburtstag (" + birthdayCurrentYear.toString() + ")");
		}
		else {
			System.exit(1);
		}
	}
}
