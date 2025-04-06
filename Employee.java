package com.assignment.constructor.prac;

/*Define an Employee class with attributes: empId, empName, designation, salary.
   Implement a method to display employee details.
   Implement a method to calculate bonus (10% of salary if salary < 50,000, otherwise 5%).
   Create a Main class to test the logic. */

public class Employee {
	//fields
	public int empid ;
	public String empName ; 
	public String designation ;
	public double salary ;
	public double bonus;
	
	public Employee(int empid,String empName,String designation,double salary) {
		this.empid = empid ; 
		this.empName = empName ; 
		this.designation = designation ; 
		this.salary = salary ; 
     }
	 public double calculateBonus() {
	        if (salary > 50000) {
	            return bonus =  salary * 0.10;
	        } else {
	            return bonus = salary * 0.05;
	        }
	 }
	

	public void displaydetails() {
		System.out.println("Emp Id : "+empid);
		System.out.println("Emp Name : "+empName);
		System.out.println("Emp designation : "+designation);
		System.out.println("Emp salary : "+salary);
		System.out.println("Emp bonus : "+calculateBonus());
		
		System.out.println("---------------------");
		
	}
	

}
