package assignments_1;
import java.util.*;

public class leapyr {
	public static boolean isLeapYear(int year) {
	    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	
    }
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		if(isLeapYear(n)) System.out.println("It is a leap year.");
		else System.out.println("It is not a leap year.");
	}
}
