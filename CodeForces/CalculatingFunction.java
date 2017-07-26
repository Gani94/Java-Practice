import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger number = new BigInteger(sc.next());
		BigInteger  two   = new BigInteger("2");
		BigInteger  zero  = new BigInteger("0");
		BigInteger  remainder = number.remainder(two);
		if(remainder.equals(zero))
			System.out.println(number.divide(two));
		else{
			number = number.add(BigInteger.valueOf(1));
			number = number.divide(two);
			number = number.multiply(BigInteger.valueOf(-1));
			System.out.println(number);
		}
	}
}
