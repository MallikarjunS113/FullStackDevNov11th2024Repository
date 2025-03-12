package com.gentech.withconstructer;

class Employee
{
	String firstName;
	String lastName;
	String email;
	long phonenumber;
	String adress;
	
	Employee()
	{
		firstName="Mallikarjuna";
		lastName="Amarashetti";
		email="mallikarjuna@gmail.com";
		phonenumber=8147771704l;
		adress="AT:RAMDURGA,TQ:RAMDURGA,D:BELAGAVI";
		System.out.println("firstName:"+firstName);
		System.out.println("lastName:"+lastName);
		System.out.println("email:"+email);
		System.out.println("phonenumber:"+phonenumber);
		System.out.println("adress:"+adress);
		System.out.println("-------------------------------------");
		
	}
}

class Department
{
	String dname;
	String departmentid;
	String departmentemail;
	long dnumber;
	String location;
	
	Department()
	{
		dname="Computer Science";
		departmentid="24MCA22";
		departmentemail="vtu@gmail.com";
		dnumber=8168844889l;
		location="Belagavi";
		System.out.println("dname :"+dname);
		System.out.println("departmentid :"+departmentid);
		System.out.println("departmentemail :"+departmentemail);
		System.out.println("dnumber :"+dnumber);
		System.out.println("location :"+location);
		System.out.println("-------------------------------------");
	}
}
class Insurance
{
	String nameofinsurer;
	String policyholder;
	String date;
	long phonenumber;
	String brachname;
	
	Insurance()
	{
		nameofinsurer="AKASH";
		policyholder="DARSHAN";
		date="1/1/2024";
		phonenumber=9968686845L;
		brachname="Belagavi";
		System.out.println("nameofinsurer :"+nameofinsurer);
		System.out.println("policyholder :"+policyholder);
		System.out.println("date :"+date);
		System.out.println("phonenumber :"+phonenumber);
		System.out.println("brachname :"+brachname);
		System.out.println("-------------------------------------");
		
	}
}

public class Withconstructer {

	public static void main(String[] args) {
		
		
		Employee obj= new Employee();
		
		
		Department obj1= new Department();
		
		
		Insurance obj2=new Insurance();
		
		
	}
	

}

