package com.gentech.withoutconstructer;

class Employee
{
	
	String firstName;
	String lastName;
	String email;
	long phonenumber;
	String adress;
}
class Department
{
	String dname;
	String departmentid;
	String departmentemail;
	long dnumber;
	String location;
}
class Insurance
{
	String nameofinsurer;
	String policyholder;
	String date;
	long phonenumber;
	String brachname;
}

public class Assign1 {

	public static void main(String[] args) {
		
		
		Employee obj= new Employee();
		obj.firstName="Mallikarjuna";
		obj.lastName="Amarashetti";
		obj.email="mallikarjuna@gmail.com";
		obj.phonenumber=8147771704l;
		obj.adress="AT:RAMDURGA,TQ:RAMDURGA,D:BELAGAVI";
		System.out.println("firstName:"+obj.firstName);
		System.out.println("lastName:"+obj.lastName);
		System.out.println("email:"+obj.email);
		System.out.println("phonenumber:"+obj.phonenumber);
		System.out.println("adress:"+obj.adress);
		System.out.println("-------------------------------------");
		
		Department obj1= new Department();
		obj1.dname="Computer Science";
		obj1.departmentid="24MCA22";
		obj1.departmentemail="vtu@gmail.com";
		obj1.dnumber=8168844889l;
		obj1.location="Belagavi";
		System.out.println("dname :"+obj1.dname);
		System.out.println("departmentid :"+obj1.departmentid);
		System.out.println("departmentemail :"+obj1.departmentemail);
		System.out.println("dnumber :"+obj1.dnumber);
		System.out.println("location :"+obj1.location);
		System.out.println("-------------------------------------");
		
		Insurance obj2=new Insurance();
		obj2.nameofinsurer="AKASH";
		obj2.policyholder="DARSHAN";
		obj2.date="1/1/2024";
		obj2.phonenumber=9968686845L;
		obj2.brachname="Belagavi";
		System.out.println("nameofinsurer :"+obj2.nameofinsurer);
		System.out.println("policyholder :"+obj2.policyholder);
		System.out.println("date :"+obj2.date);
		System.out.println("phonenumber :"+obj2.phonenumber);
		System.out.println("brachname :"+obj2.brachname);
		System.out.println("-------------------------------------");
		
		
	}
	

}
