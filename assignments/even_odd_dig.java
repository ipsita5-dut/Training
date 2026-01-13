package assignments_1;
import java.util.*;

public class even_odd_dig {
	public static boolean sameEvenOdd(int n) {
	    int evenCnt = 0, oddCnt = 0;

	    while (n > 0) {
	        int digit = n % 10;

	        if (digit % 2 == 0)
	            evenCnt++;
	        else
	            oddCnt++;

	        n /= 10;
	    }

	    return evenCnt == oddCnt;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		if(sameEvenOdd(n)) System.out.println("Even and odd digits are same.");
		else System.out.println("Even and odd digits are not same.");
	}
}
