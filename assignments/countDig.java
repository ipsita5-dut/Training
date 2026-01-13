package assignments;

public class countDig {
	public static int count(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		return cnt;
	}
	public static int power(int a, int b) {
		int res=1;
		while(b>0) {
			res*=a;
			b--;
		}
		return res;
	}
	
	public static boolean armstrong(int n) {
		int cnt=count(n),num=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=power(d,cnt);
			n/=10;
		}
		if(sum==num) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		int cnt=0,n=153;
//		while(n>0) {
//			int d=n%10;
//			cnt++;
//			n=n/10;
//		}
//		System.out.println(count(n));
		
		System.out.println(armstrong(n));
	}
}
