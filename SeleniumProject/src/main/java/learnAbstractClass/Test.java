package learnAbstractClass;

public class Test {

	public static void main(String[] args) {
		//we can't create object of abstract class but can create reference variable
		
		
		MobileUser mu;
		mu = new Karim();
		mu.sendmessage();
		
		mu.call();
		
		mu = new Rahim();
		mu.sendmessage();
		
		mu.call();

	}

}
