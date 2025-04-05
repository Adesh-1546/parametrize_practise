package com.assignment.constructor.prac;

public class Main {
	 public static void main(String[] args) {
	        // Create a student object
	        Student student = new Student(101, "Alice Smith", "Computer Science", 2, 87.5);

	        // Display student details
	        student.displayDetails();

	        // Calculate and display grade
	        String grade = student.calculateGrade();
	        System.out.println("Grade: " + grade);
	    }

}
