package assignments_1;

import java.util.Scanner;

public class disarium_no {
	public static int cnt(int n) {
		 int cnt = 0;
		 int x = n;
		 while (x>0) {
		    x = x / 10;
		    cnt++;
		 }
		 return cnt;
	}
	
	public static boolean isdisarium(int n) {
		int cnt= cnt(n);
		int num=n,sum=0;
		 while(num>0) {
			 int d= num%10;
			 
			 int pow=1;
			 for(int i=1;i<=cnt;i++) {
				 pow*=d;
			 }
			 
			 sum+=pow;
			 cnt--;
			 num/=10;
		 }
		 
		 return sum==num;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		if(isdisarium(n)) System.out.println("It is a disarium no.");
		else System.out.println("Not a disarium no.");
	}
}
