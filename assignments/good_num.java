package assignments_1;

import java.util.Scanner;

public class good_num {
	public static boolean goodNum(int n) {
		int rev=0,num=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev==num;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(goodNum(n)) System.out.println("This is a good number.");
		else System.out.println("Not a good number.");
	}
}
