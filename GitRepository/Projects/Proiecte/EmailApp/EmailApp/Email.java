package EmailApp;

import java.util.Scanner;

public class Email {
		
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int mailboxCapacity = 6000;
		private int defaultPasswordLenght = 10;
		private String alternateEmail;
		private String companyName = "business.com";
		
		public Email(String firstName, String lastName) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println(" EMAIL CREATED  " + this.firstName + " " + this.lastName);
			
			this.department = setDepartment();
			System.out.println(" Department " + this.department);
			
			this.password = randomPassword(defaultPasswordLenght);
			System.out.println(" Your password is:  " + this.password);
			
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
			System.out.println(" Your email is  " + email);
			
		}

		private String setDepartment() {
			
			System.out.print("Enter the department\n1 for Marketing\n2 for Call Center\n3 for Management\n0 for none\nEnter Department Number");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if (depChoice == 1) {
				return "Marketing";				
			}else if(depChoice == 2) {
				return "Call Center";
			}else if(depChoice == 3) {
				return "Management";
			}else {return "The department does not exist";}
		}
		
		private String randomPassword(int lenght) {
			
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUMWXYZ0123456789!@#$%";
			char[] password = new char[lenght];
			for(int i=0; i<lenght; i++) {		
				int rand = (int )(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
		
			return new String(password);
		}
	
		public void setMailboxCapacity(int capacity) {
			
			this.mailboxCapacity = capacity;
		}
		
		public void setAlternateEmail(String altEmail) {
			
			this.alternateEmail = altEmail;
		}
		
		public void changePassword(String password) {
			
			this.password = password;
		}
		
		public int getMailboxCapacity() {
			
			return mailboxCapacity;
			
		}
		
		public String getAlternateEmail() {
			
			return alternateEmail;
		}
		
		public String getPassword() {
			
			return password;
		}
		
		public String showInfo() {
			
			return " Worker name is "  + firstName + " " + lastName + 
					"\n Company Email: " + email +
					"\n Mailbox Capacity " + mailboxCapacity + "mb";
		}				
}
