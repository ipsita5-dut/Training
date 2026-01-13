package assignments_1;

import java.util.Scanner;

public class Xylem_Phloem {
	public static boolean isXylemNum(int num) {
	    int last = num % 10;
	    int first = num;
	    int middleSum = 0;

	    while (first >= 10)
	        first /= 10;

	    num /= 10;
	    while (num > 9) {
	        middleSum += num % 10;
	        num /= 10;
	    }

	    return (first + last) == middleSum;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		if(isXylemNum(n)) System.out.println("It is a xylem number.");
		else System.out.println("It is a phloem number.");
	}

}
