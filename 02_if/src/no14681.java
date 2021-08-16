import java.util.Scanner;

public class no14681 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(0 < x && x <= 1000 && 0 < y && y <= 1000 ) {
			System.out.println(1);
		} else if(0 < x && x <= 1000 && 0 > y && y >= -1000) {
			System.out.println(4);
		} else if( 0 > x && x >= -1000 && 0 < y && y <= 1000) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
	}

}
