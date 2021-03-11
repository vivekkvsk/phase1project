package lockMe;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Authentication {


	public static  Scanner input;
	public static  Scanner lockerInput;
	public static Scanner keyboard;
	public  static PrintWriter output;
	public  static PrintWriter lockerOutput;
	public  static Userdetails userdetails;
	public  static Users users;
	
	

public static void main (String[] args) {	
	
	 application();
	 welcomeScreen();
	 SignInoptions();
	 
	 }
	
public static  void welcomeScreen() {
		// TODO Auto-generated method stub
		System.out.println("#####################################################");
		System.out.println("                                                     ");
		System.out.println("                                                      ");
		System.out.println("    Welcome to Lock me.com                                   ");
		System.out.println("#######################################################");
	}
public static  void SignInoptions() {
	System.out.println("1. Registration");
	System.out.println("2. Login");
	//Scanner keyboard = new Scanner(System.in);
	int option = keyboard.nextInt();
	switch(option) {
		case 1:
			registration();
			break;
		case 2:
			login();
			break;
	    default :
			System.out.println("Please choose either of the optoins 1 or 2");
			SignInoptions();
			break;
	
	}
	keyboard.close();
}

public static  void registration() {
	// TODO Auto-generated method stub
	
	//Scanner keyboard = new Scanner(System.in);
	//Scanner keyboard = new Scanner(System.in);
	//Users users = new Users();
//	printWriter output = new PrintWriter();
	
	
	
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome to Registation screen                                    ");
	System.out.println("#######################################################");
	
	
	System.out.println("Enter username:");
	String username = keyboard.next();
	users.setUsername(username);
    System.out.println("Enter Password:");
    String password = keyboard.next();
    
    
    users.setPassword(password);
    
    output.println(users.getUsername());
    
    output.println(users.getPassword());
    
    System.out.println("Regitataion successful");
    
    output.close();
    keyboard.close();
    keyboard.close();
    
    }
public static void login() {
	// TODO Auto-generated method stub
	//Scanner keyboard = new Scanner(System.in);
	//Scanner input = new Scanner(System.in);
	//Scanner keyboard = new Scanner(System.in);
	
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome to login screen                           ");
	System.out.println("#######################################################");
	
	System.out.print("Enter username:");
	//Boolean found = false;
	String inpUsername = keyboard.next();
		//Boolean found = false;
	  if(input.next().equals(inpUsername)) {
			System.out.println("Enter Password : ");
			
			String inpPassword = keyboard.next();
			System.out.println("Logged in successfuly! 200 ok");
			lockerOptions(inpUsername);
			}

	    	else {
		System.out.println("Usernot found error 404");
		login();
	}
	  keyboard.close();
	  keyboard.close();
	  input.close();
}


public static void lockerOptions(String inpUsername) {
	// TODO Auto-generated method stub
	System.out.println("1. Fetch the detials");
	System.out.println("2. Store the detials");
	//Scanner keyboard = new Scanner(System.in);
	int option = keyboard.nextInt();
	

	switch(option){
		case 1:
			fetchdetails(inpUsername);
			break;
		case 2:
			stroedetails(inpUsername);
			break;
	default :
			System.out.println("Please choose either of the optoins 1 or 2");
			break;	
	
	}
	keyboard.close();
	
}

public static void stroedetails(String loggedInUser) {
	// TODO Auto-generated method stub
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome to Store the details screen                                    ");
	System.out.println("#######################################################");
	
	
	System.out.println("enter sitename:");
	
	String sitename = keyboard.next();
	
    userdetails.setSitename(sitename);	
	
	System.out.println("enter username:");
	
	String username = keyboard.next();
	
	userdetails.setUsername(username);
    
	
	System.out.println("enter password:");
	
	String password = keyboard.next();
	
	userdetails.setPassword(password);
	
    
	lockerOutput.println(userdetails.getSitename());
	lockerOutput.println(userdetails.getUsername());
	lockerOutput.println(userdetails.getPassword());
    
	System.out.println("username and passowrd deatils are stored successfully");
	lockerOutput.close();
	keyboard.close();
	keyboard.close();
	keyboard.close();
	}

public static void fetchdetails(String inpUsername) {
	// TODO Auto-generated method stub
	Scanner lockerInput = new Scanner(System.in);
	
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome Screen- Fetch userdetails                                    ");
	System.out.println("#######################################################");
	
	
		if(lockerInput.next().equals(inpUsername)) {
		System.out.println("Enter sitedetails:");
		String sitedetails = lockerInput.next();
		
		System.out.println("Enter username:");
		String username = lockerInput.next();
		System.out.println("Enter Password:");
		String password = lockerInput.next();
		}
		else {
		 System.out.println("Please enter valid details");
		}
		lockerInput.close();
    
	}
	
	

public static  void application() {
	// TODO Auto-generated method stub
	try {
		FileWriter f = new FileWriter("text.txt");
		output = new PrintWriter(f);
		lockerOutput = new PrintWriter(f);
		users = new Users();
		userdetails = new Userdetails();
		keyboard = new Scanner(System.in);
		input = new Scanner(System.in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
