import java.math.BigInteger;
import java.util.Scanner;

public class Barnicle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String scientific = sc.nextLine();
		char[] parts = scientific.toCharArray();
		
		String a= scientific.substring(0, 1);
		int i=2;
		while(parts[i]!='e'){
			i++;
		}
		String dec = scientific.substring(2,i);
		String pow = scientific.substring(++i);
		int power = Integer.parseInt(pow);
		
		String answer;
		if(power>=dec.length()){
			power-=dec.length();
			while(power>0){
				dec+="0";
				power--;
			}
			answer = a+dec;
		}
		else{
			answer = a+dec.substring(0, power)+"."+dec.substring(power);
		}
		i=0;
		while(answer.charAt(i)=='0'){
			i++;
		}
		if(answer.charAt(i)=='.')
			System.out.println("0"+"."+answer.substring(++i));
		else
			System.out.println(answer.substring(i));
		
	}
}
