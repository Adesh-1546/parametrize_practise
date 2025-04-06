package com.assignment.constructor.prac;

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
