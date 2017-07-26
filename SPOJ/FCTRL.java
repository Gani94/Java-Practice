import java.util.Scanner;

public class FCTRL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inputs = new int[n];
		sc.nextLine();
		for(int i=0;i<n;i++){
			inputs[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			countTrailingZeroes(inputs[i]);
		}
	}

	private static void countTrailingZeroes(int n) {
		// TODO Auto-generated method stub
		int count=0;
		while(n>0){
			n=n/5;
			count+=n;
		}
		System.out.println(count);
	}
}
