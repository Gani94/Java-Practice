import java.util.Scanner;

public class AddingReversedNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answers = new int[n];
		sc.nextLine();
		int a,b;
		for(int i=0;i<n;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			answers[i]=reverseOfSum(a,b);
		}
		for(int i=0;i<n;i++){
			System.out.println(answers[i]);
		}
	}

	private static int reverseOfSum(int a, int b) {
		// TODO Auto-generated method stub
		int answer;
		a = reverse(a);
		b = reverse(b);
		answer = a+b;
		answer = reverse(answer);
		return answer;
	}

	private static int reverse(int a) {
		// TODO Auto-generated method stub
		int reversedNumber=0;
		while(a/10!=0){
			reversedNumber+=a%10;
			a=a/10;
			reversedNumber*=10;
		}
		reversedNumber+=a;
		return reversedNumber;
	}
}
