import java.math.BigInteger;
import java.util.Scanner;

public class GenerateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		BigInteger oneChange = BigInteger.valueOf(sc.nextInt());//time for one change: add or remove
		BigInteger duplicate = BigInteger.valueOf(sc.nextInt());//duplicate the entire file
		
		BigInteger[] times = new BigInteger[size+1];
		
		BigInteger temp1, temp2;
		int compare;
		times[0] = BigInteger.ZERO;
		times[1] = oneChange;
		for(int i=2;i<=size;i++){
		
			temp1 = times[i-1].add(oneChange);
			temp2 = times[(i+1)/2].add(duplicate);
			temp2 = temp2.add(oneChange.multiply(BigInteger.valueOf(i%2)));
			
			
			compare = temp1.compareTo(temp2);
			if(compare<1)
				times[i] = temp1;
			else
				times[i] = temp2;
			
		}
		System.out.println(times[size]);
	}
}
