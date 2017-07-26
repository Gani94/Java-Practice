import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGeneratorSieve {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] limits = new int[n][2];
	sc.nextLine();
	int upperLimit, lowerLimit;
	for(int i=0;i<n;i++){//storing all testcases
		limits[i][0]=sc.nextInt();
		limits[i][1]=sc.nextInt();
		sc.nextLine();
	}
	for(int i=0;i<n;i++){
		printPrimeInRange(limits[i][0],limits[i][1]);
	}
}

private static void printPrimeInRange(int lowerLimit, int upperLimit) {
	// TODO Auto-generated method stub
	
    // initially assume all integers are prime
	 boolean[] isPrime = new boolean[upperLimit+1];
	 isPrime[0]=false;
	 isPrime[1]=false;
     for (int i = 2; i <= upperLimit; i++) {
         isPrime[i] = true;
     }
	
     // mark non-primes <= n using Sieve of Eratosthenes
     for (int factor = 2; factor*factor <= upperLimit; factor++) {

         // if factor is prime, then mark multiples of factor as nonprime
         // suffices to consider multiples factor, factor+1, ...,  n/factor
         if (isPrime[factor]) {
             for (int j = factor; factor*j <= upperLimit; j++) {
                 isPrime[factor*j] = false;
             }
         }
         
         
     }
     for (int i = lowerLimit; i <= upperLimit; i++) {
         if (isPrime[i]) 
        	 System.out.println(i);
     }
     
     
     System.out.println();
}
}
