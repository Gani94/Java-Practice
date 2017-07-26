import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PaskmakAndFlowers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] values = new int[n];
		for(int i=0;i<n;i++){
			values[i] = sc.nextInt();
		}
		
		Arrays.sort(values);
		int maxDifference = values[n-1] - values[0];
		BigInteger possibilities = BigInteger.valueOf(0);
		if(maxDifference==0){
			possibilities = possibilities.add(BigInteger.valueOf(n));
			possibilities = possibilities.multiply(BigInteger.valueOf(n-1));
			possibilities = possibilities.divide(BigInteger.valueOf(2));
			System.out.println(maxDifference + " " + possibilities);
		}
		else{
		long minCount=1, maxCount=1;
		int i=0;
		while(values[i++]==values[i])
			minCount++;
		i=n-1;
		while(values[i--]==values[i])
			maxCount++;
		possibilities = possibilities.add(BigInteger.valueOf(minCount));
		possibilities = possibilities.multiply(BigInteger.valueOf(maxCount));
		System.out.println(maxDifference + " " + possibilities);	
		}
	}
}
