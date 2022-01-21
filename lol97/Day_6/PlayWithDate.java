import java.time.LocalDate;
import static java.time.LocalDate.now;


public class PlayWithDate{
	public boolean isValid30DaysBefore(String date){
		LocalDate ld = LocalDate.parse(date);
		return ld.minusDays(31l).isBefore(now());
	}

	public boolean isValid30DaysAfter(String date){
		LocalDate ld = LocalDate.parse(date);
		return ld.minusDays(61l).isBefore(now());
	}

	public static void main(String[] args) {
		System.out.println(now());
		PlayWithDate pwd = new PlayWithDate();
		System.out.println(pwd.isValid30DaysBefore("2023-11-01"));			
	}
}