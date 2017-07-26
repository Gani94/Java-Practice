import java.math.BigInteger;
import java.util.Scanner;

public class FCTRL2 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inputs = new int[n];
		sc.nextLine();
		for(int i=0;i<n;i++){
			inputs[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			factorial(inputs[i]);
		}
	}

	private static void factorial(int i) {
		// TODO Auto-generated method stub
		
		BigInteger n = BigInteger.valueOf(i);
		while(i>1){
			n =n.multiply(BigInteger.valueOf(--i));
		}
		System.out.println(n);
	}
}
