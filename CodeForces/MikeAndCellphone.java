import java.util.Scanner;

public class MikeAndCellphone {

	static int n;
	static int[][] pad = new int[6][5];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int number = sc.nextInt();
		int[] digits = new int[n];
		
		for(int i=n-1;i>=0;i--){
			digits[i]=n%10;
			n=n/10;
		}
		
		if(isUnique(digits))
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

	private static boolean isUnique(int[] digits) {
		// TODO Auto-generated method stub
		int[] increments = {1,-1,3,-3};
		for(int i:increments){
			if(!check(digits,i))
				return false;
		}
		return false;
	}

	private static boolean check(int[] digits, int increment) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			
		}
		
		
		return false;
		
		
	}
}
