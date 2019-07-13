package lab13;

import java.util.Scanner;
import java.util.function.*;

public class Exercise4 {
	private String empId;
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID:");
			String id=sc.next();
			System.out.println("Enter Name:");
			String name=sc.next();
			
			Exercise4 ex=new Exercise4();
			Consumer<String> con1=ex::setEmpId;
			con1.accept(id);
			Consumer<String> con=ex::setEmpName;	
			con.accept(name);
		
			Supplier<String> sup=ex::getEmpId;
		Supplier<String> sup2=ex::getEmpName;
		
		System.out.println("EmpId:"+sup.get());
		System.out.println("EmpName:"+sup2.get());
		
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
