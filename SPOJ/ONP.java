import java.util.Scanner;

public class ONP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = sc.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			RPN(inputs[i]);
		}
	}

	private static void RPN(String string) {
		// TODO Auto-generated method stub
		
		
		
	}
	
}
