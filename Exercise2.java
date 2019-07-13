package lab13;

import java.util.Scanner;
import java.util.function.*;

public class Exercise2 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string:");
			String str=sc.nextLine();
			Function<String,String> fn=(s)->
			{
				String space="";
				for(int i=0;i<str.length();i++)
				{
					space=space+str.charAt(i)+" ";
				}
				return space;
			};
			String res=fn.apply(str);
			System.out.println(res);
	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
