package myprojectlockme;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Authentication {
	
	public static void main(String[] args) {
		
		welcomescreen();
	}
	

	private static void welcomescreen() {
		// TODO Auto-generated method stub
		System.out.println("****************************");
		System.out.println("                            ");
		System.out.println("Welcome Screen	");
		System.out.println("****************************");
		System.out.println("Enter Below options");
		System.out.println("1.Fetch Details");
		System.out.println("2.Business level operations");
		System.out.println("3.ExitApplication");
		Scanner input = new Scanner(System.in);
		int options = input.nextInt();
		
		switch(options){
		
		case 1:
		   Fetchdetails();
		break;
		case 2:
			Business_operations();
		break;
		case 3:
			Exit_application();
		break;
		default:
			System.out.println("Enter any one of the following options");
			welcomescreen();
	}
		input.close();
	
	
}

	private static void Fetchdetails() {
		// TODO Auto-generated method stub
		System.out.println("****************************");
		System.out.println("                            ");
		System.out.println("Welcome to Fetch details screen	");
		System.out.println("****************************");
		
		File listoffiles = new File("/home/kasturivivek994/Downloads/");
		
		String[] files = listoffiles.list();
		Arrays.sort(files);
		
		for(int i=0; i<files.length;i++) {
			System.out.println(files[i]);
		}
		 //SYstem
		Exit_application();
		
		
	}

	private static void Exit_application() {
		
		// TODO Auto-generated method stub
		System.out.println("****************************");
		System.out.println("                            ");
		System.out.println("End Screen	");
		System.out.println("****************************");
		
	}

	private static void Business_operations() {
		// TODO Auto-generated method stub
		System.out.println("****************************");
		System.out.println("                            ");
		System.out.println("Welcome to business operations Screen	");
		System.out.println("****************************");
		System.out.println("Enter any one of the below options");
		System.out.println("1.Add file details");
		System.out.println("2.Delete file details");
		System.out.println("3.To search specific file");
		System.out.println("4.Go back to main screen");
		Scanner input2 = new Scanner(System.in);
		int bo = input2.nextInt();
		
		 switch(bo){
			
			case 1:
				addfile();
			break;
			case 2:
				deletefile();
			break;
			case 3:
				searchfile();
			break;
			case 4:
				gotomainscreen();
			break;
		}
		 
		 input2.close();
		 }


	private static void searchfile() {
		// TODO Auto-generated method stub
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the file name to search from main directory ");
		File f = new File("/home/kasturivivek994/Downloads/");
		
		String filename2 = input3.nextLine();
		
		String[] SO = f.list();
		    int flag = 0;
			for(int i =0;i<SO.length;i++) {
				
				 if(SO[i].equals(filename2)) {
			 
				 flag=flag+1;
			 }
		
			}
			if(flag>0) {
                System.out.println("File exits in the directory. Here is the file:"+filename2);
                System.out.println("************************************************************************************************************************");
                System.out.println("*******Going back to main contex,kindly enter any one of the following or exit application by clickling option.3**************************");
			}
			   else {
					System.out.println("File doesnot exits in the directory");
					System.out.println("**********************************************************");
	                System.out.println("*******Going back to main contex,kindly enter any one of the following or exit application by clickling option.3**************************");
				}
			welcomescreen();
			input3.close();
	}
	


	private static void gotomainscreen() {
		// TODO Auto-generated method stub
		welcomescreen();
		
		
	}


	private static void deletefile() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired name of your file: ");
        String fileName2 = input.nextLine();
		File file = new File("/home/kasturivivek994/Downloads/"+ fileName2);

		if(file.delete()){
		System.out.println("File deleted successfully");
		}
		else
		{
		System.out.println("File not found");
		}
		
		input.close();
		
	}


	private static void addfile()  {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired name of your file: ");
        String fileName = input.nextLine();
        
     
 

        try {
            File file = new File("/home/kasturivivek994/Downloads/"+ fileName);

 

            if (file.createNewFile()) {
                System.out.println("File has been created successfully");
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
      
        
	}
	
		}

