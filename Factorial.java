package lab13;

import java.util.Scanner;
import java.util.function.*;

public class Factorial {
	public int getFactorial(int n) {
		int fact=1;
		if(n<0)
		{
			return -1;
		}
		else if(n==0 ||n==1) {
			return 1;
		}
		else {
			while(n!=0)
			{
				fact=fact*n;
				n--;
			}
			return fact;
		}
		
	}
	

	public static void main(String[] args) {
		int n=0;
		Factorial f1=new Factorial();
		System.out.println("Enter numnber:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		try {
			n=Integer.parseInt(str);
			if(n<0) {
				throw new Exception();
			}
		}
		catch(NumberFormatException ne) {
			System.out.println("Number should be integer");
		}
		catch(Exception e)
		{
			System.out.println("Number should be a positive integer");
		}
		Function<Integer,Integer> fn= f1::getFactorial;
		int result=fn.apply(n);
		System.out.println("Factorial of number"+result);
		
		
		
		

	}

}
