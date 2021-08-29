package com.greatlearning.service;
import com.greatlearning.model.*;
import java.util.Random;


public class CredentialService {

	public String generateEmail(Employee employee,Department departmentname)
	{
		String email=(employee.getFirstName()+employee.getLastName()+"."+departmentname.getDepartmentName()+"@abc.com");
		return email;

	}

	public String generatPassword()
	{
		String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+ "0123456789"+"@#$%^&*_=+-/.?<>";
		Random objrand= new Random();
		char password[]= new char[8];

		for(int i=0;i<password.length;i++)
		{
			password[i]=Letters.charAt(objrand.nextInt(Letters.length()));



		}

		return password.toString();
	}
	public void showCredentials(String email, String password)

	{
		System.out.println(email + "\n" +password );

	}
}
