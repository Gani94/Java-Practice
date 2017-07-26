import java.util.Arrays;
import java.util.Scanner;

public class OptimalPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] points = new int[n];
		for(int i=0;i<n;i++){
			points[i] = sc.nextInt();
		}
		Arrays.sort(points);
		
		if(n%2==0)
			System.out.println(points[(n/2)-1]);
		else
			System.out.println(points[n/2]);
	}
}
