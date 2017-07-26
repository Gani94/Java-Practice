import java.util.Scanner;

public class GameWithSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int min = Math.min(rows, columns);
		
		if(min%2==0)
			System.out.println("Malvika");
		else
			System.out.println("Akshat");
	}
}
