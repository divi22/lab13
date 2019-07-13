package lab13;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Exercise1 {

	public static void main(String[] args) {
		try {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of x(base):");
			int num1=sc.nextInt();
			System.out.println("Enter value of y(power):");
			int num2=sc.nextInt();
			BiFunction<Integer,Integer,Integer> power=(a,b)->(int)Math.pow(a,b);
			System.out.println("Result is:"+power.apply(num1, num2));
		}
		catch(InputMismatchException im) {
			System.out.println("Enter valid integer");
		}

	}

}
