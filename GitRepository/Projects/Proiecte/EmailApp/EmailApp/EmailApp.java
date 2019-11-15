package EmailApp;


public class EmailApp{
	
	public static void main(String [] args) {
		
		
		Email m1 = new Email("Ion" , "Popescu");
		System.out.println(m1.showInfo());
		
		Email m2 = new Email("George" , "Sima");
		System.out.println(m2.showInfo());
		
		Email m3 = new Email("Daniel" , "Popescu");
		System.out.println(m3.showInfo());
		
	}
	
	
	
}