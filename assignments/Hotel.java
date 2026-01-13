package assignments;

public class Hotel {
	
	static void chef() {
		System.out.println("Preparing food");
	}
	
	static void server() {
		System.out.println("Serving food");
	}
	
	static void cashier() {
		System.out.println("Counting money");
	}
    public static void main(String[] args) {
    	System.out.println("main start");
    	chef();
    	server();
    	cashier();
    	System.out.println("main end");
    	
    }
}
