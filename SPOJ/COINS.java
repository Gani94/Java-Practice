import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COINS {

	public static void main(String[] args) {
		
		
		Map<Long, Long> map = new HashMap<Long, Long>();
		
		Scanner sc = new Scanner(System.in);
		while(true){
		Long n = sc.nextLong();
		Long answer = exchange(n,map);
		System.out.println(answer);
		if(!sc.hasNextLong())
			break;
		}
		
	}

	private static Long exchange(Long n, Map<Long, Long> map) {
		// TODO Auto-generated method stub
		
		if(n==0)
			return (long) 0;
		if(map.containsKey(n))
			return map.get(n);
		
		
			
		 map.put(n,Math.max(n, exchange(n/2, map)+exchange(n/3, map)+exchange(n/4, map)));
		 return map.get(n);
	}
}
