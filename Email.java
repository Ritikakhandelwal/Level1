
package emailapp;
import java.util.*;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLenght = 10;
	private String email;
	private String companySuffix = "aeycompany.com";
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED:" +this.firstName +" "+this.lastName);
		this.department = setDepartment();
		//System.out.println("Department:" +this.department);
		this.password = randomPassword(defaultPasswordLenght);
		System.out.println("Your password is:" +this.password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your email is :" +email);
	}
	
     private String setDepartment(){
    	 System.out.print("Employee Name: " + firstName + " " + lastName + "\nDepartment Codes:\n1 for sales\n2 for development\n3 for accounting\n0 for none \nEnter Department code:");
    	 Scanner in = new Scanner(System.in);
    	int depChoice = in.nextInt();
    	if(depChoice == 1){ return "sales"; }
    	else if(depChoice == 2){ return "dev"; }
    	else if(depChoice == 3){ return "acct"; }
    	else { return ""; }
     }	
    	private String randomPassword(int lenght)	{
    		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    		char[] password = new char[lenght];
    		for(int i=0; i<lenght; i++){
    			int rand = (int) (Math.random() * passwordSet.length());
    			password[i] = passwordSet.charAt(rand);
    		}
    		return new String (password);
    	}
    public void setMailboxCapacity(int capacity){
    	this.mailboxCapacity = capacity;
    
    }
	public void setAlternateEmail(String altEmail){
	this.alternateEmail = altEmail;
	}
	
     public void changePassowrd(String Password){
    	 this.password = password;
    	 
     } 
     public int getMailBoxCapacity() {
    	 return mailboxCapacity;
     }
     public String getAlternateEmail(){
    	 return alternateEmail;
     }
     public String getPassword()
     {
    	 return password;
     }
     public String ShowInfo()
     {
    	 return "Display Name:"+ firstName + " " + lastName +
    	 "\nCompany Email:" + email +
    	 "\nMailBox Capacity:" + mailboxCapacity + "mb";
     }
}
