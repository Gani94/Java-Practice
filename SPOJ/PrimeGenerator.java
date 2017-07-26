import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] limits = new int[n][2];
		sc.nextLine();
		int upperLimit, lowerLimit;
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		for(int i=0;i<n;i++){//storing all testcases
			limits[i][0]=sc.nextInt();
			limits[i][1]=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0;i<n;i++){//printing primes for each testcase
			
			printPrimesInRange(limits[i][0], limits[i][1], primeList);
		}
	}

	private static void printPrimesInRange(int lowerLimit, int upperLimit, ArrayList<Integer> primeList) {
		// TODO Auto-generated method stub
		int originalListSize = primeList.size();
		int startingPoint = 0, endingPoint=originalListSize-1;
		int largestPrimeInList = primeList.get(originalListSize-1);
		if(upperLimit>largestPrimeInList){
			findMissingPrimes(primeList, upperLimit);
			endingPoint = primeList.size()-1;
		}
		else{
			while(upperLimit<primeList.get(endingPoint)){
				endingPoint--;
			}
		}
		
		while(lowerLimit>primeList.get(startingPoint))
			startingPoint++;
		for(int i=startingPoint;i<=endingPoint;i++){
			System.out.println(primeList.get(i));
		}
		System.out.println();
	}

	private static void findMissingPrimes(ArrayList<Integer> primeList, int upperLimit) {
		// TODO Auto-generated method stub
		int listSize = primeList.size();
		int firstPrime = primeList.get(listSize-1);
		for(int i=firstPrime+1;i<=upperLimit;i++){
			if(isPrime(i,primeList))
				primeList.add(i);
		}
		
		
	}

	private static boolean isPrime(int input, ArrayList<Integer> primeList) {
		// TODO Auto-generated method stub
		int listSize = primeList.size();
		for(int i=0;i<listSize;i++){
			if(input%primeList.get(i)==0)
				return false;
		}
		
		
		return true;
	}
}
