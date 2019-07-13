package lab13;

import java.util.Scanner;
import java.util.function.*;

public class Excercise3 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username");
			String uname=sc.nextLine();
			System.out.println("Enter password");
			String pass=sc.nextLine();
			BiPredicate<String,String> up=(username,password)->
			{
				if(username.equals("system") && password.equals("root123")) 
					return true;
				else 
					return false;
				
			};
			boolean result=up.test(uname,pass);
			System.out.println("Result: "+result);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
