import java.time.LocalTime;
import java.util.Scanner;

public class no2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		LocalTime time = LocalTime.of(h, m).minusMinutes(45);
		
		System.out.println(time.getHour() + " " + time.getMinute());
	
	}

}
