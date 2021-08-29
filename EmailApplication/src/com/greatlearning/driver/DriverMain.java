package com.greatlearning.driver;
import java.util.*;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class DriverMain {

	public static void main (String arg[])
	{	
		System.out.println("Enter the department");
		System.out.println(" 1.Technical \n 2.Legal \n 3.HR \n 4.Account\n");
		Scanner sc= new Scanner(System.in);
		int choice= sc.nextInt();
		Employee e1=new Employee("isha","agarwal");
		Department d1=new Department();


		CredentialService c1= new CredentialService();


		switch(choice)
		{
		case 1: d1.setDepartmentName("Technical");
		System.out.println("Dear "+e1.getFirstName()+" "+e1.getLastName()+" your generated credentials are as follows");
		String Emailid=c1.generateEmail(e1,d1);
		String password=c1.generatPassword();
		c1.showCredentials(Emailid, password);


		break;
		case 2: d1.setDepartmentName("Legal");
		System.out.println("Dear "+e1.getFirstName()+" "+e1.getLastName()+" your generated credentials are as follows");
		String Emailid1=c1.generateEmail(e1,d1);
		String password2=c1.generatPassword();
		c1.showCredentials(Emailid1, password2);

		break;

		case 3: d1.setDepartmentName("HR");
		System.out.println("Dear "+e1.getFirstName()+" "+e1.getLastName()+" your generated credentials are as follows");
		String Emailid3=c1.generateEmail(e1,d1);
		String password3=c1.generatPassword();
		c1.showCredentials(Emailid3, password3);
		break;

		case 4: d1.setDepartmentName("HR");
		System.out.println("Dear "+e1.getFirstName()+" "+ e1.getLastName()+"  your generated credentials are as follows");
		String Emailid4=c1.generateEmail(e1,d1);
		String password4=c1.generatPassword();
		c1.showCredentials(Emailid4, password4);
		break;

		default:System.out.println("wrong choice");



		}




	}

}
