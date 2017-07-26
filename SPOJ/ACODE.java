import java.math.BigInteger;
import java.util.Scanner;

public class ACODE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if(s.equals("0"))
				break;
			possibilities(s);
		}
	}

	private static void possibilities(String s) {
		// TODO Auto-generated method stub
		
		char[] chars = s.toCharArray();
		int size = chars.length;
		BigInteger[] possibilities  = new BigInteger[size+1];
		possibilities[0]=BigInteger.valueOf(1);
		possibilities[1]=BigInteger.valueOf(1);
		
		for(int i=2;i<=size;i++){
			possibilities[i]=possibilities[i-1];
			int tens = Character.getNumericValue(chars[i-2]);
			int ones = Character.getNumericValue(chars[i-1]);
			if(ones==0)
				possibilities[i]=possibilities[i-2];
			else
			if(tens*10+ones<27 && tens!=0)
				possibilities[i]=possibilities[i].add(possibilities[i-2]);
		}
		System.out.println(possibilities[size]);
	}
}
