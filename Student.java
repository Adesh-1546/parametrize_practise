package com.assignment.constructor.prac;

public class Student {
	// Attributes
    private int studentId;
    private String studentName;
    private String course;
    private int year;
    private double percentage;

    // Constructor
    public Student(int studentId, String studentName, String course, int year, double percentage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.year = year;
        this.percentage = percentage;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
        System.out.println("Percentage: " + percentage + "%");
    }

    // Method to calculate and return grade
    public String calculateGrade() {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

}
