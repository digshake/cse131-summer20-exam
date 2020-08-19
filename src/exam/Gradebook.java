package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Gradebook {
	//Part 3: Implement the Gradebook
	
	//You are expected to use this HashMap to store
	//graded items for each student
	private HashMap<String, ArrayList<Gradeable>> grades;
	
	public static void main(String[] args) {
		
		//Please do not modify this code.
		//There is space provided for you to add your
		//own tests at the end of the method
		
		//Create the gradebook and some assignments
		Gradebook gb = new Gradebook("CSE131", .7, .3); //assignments are worth 70%, exams worth 30%
		Assignment assignment1 = new Assignment(100, 87, "Assignment 1", 3);
		Assignment assignment2 = new Assignment(80, 63, "Assignment 2", 0);
		Exam exam1 = new Exam(100, 91, "Multiple Choice");
		Exam exam2 = new Exam(85, 20, "Essay");
		
		//should be zero
		System.out.println(gb.getCurrentCourseGrade("Louis Cole"));

		//should show assignment 1 with the following information:
		//Assignment 1: 87.0 / 100, late days: 3
		System.out.println(assignment1);
		
		//add assignment 1
		gb.addGrade("Louis Cole", assignment1);
		
		//should be 87
		System.out.println(gb.getAssignmentGrade("Louis Cole"));
		
		//should be 60.9
		System.out.println(gb.getCurrentCourseGrade("Louis Cole"));
	
		//should show exam 1 with the following information:
		//Multiple Choice exam: 91.0 / 100
		System.out.println(exam1);
		
		//add exam 1
		gb.addGrade("Louis Cole", exam1);
		
		//should be 91
		System.out.println(gb.getExamGrade("Louis Cole"));
		
		//should be 88.2
		System.out.println(gb.getCurrentCourseGrade("Louis Cole"));
	
		//add the other assignment and exam
		gb.addGrade("Louis Cole", assignment2);
		gb.addGrade("Louis Cole", exam2);
		
		//should be 83.3
		System.out.println(gb.getAssignmentGrade("Louis Cole"));
		
		//should be 60
		System.out.println(gb.getExamGrade("Louis Cole"));
		
		//should be 76.3
		System.out.println(gb.getCurrentCourseGrade("Louis Cole"));
	
		//Create and add a bunch of grades for another student:
		Assignment assignment1b = new Assignment(100, 95, "Assignment 1", 0);
		Assignment assignment2b = new Assignment(80, 70, "Assignment 2", 4);
		Exam exam1b = new Exam(100, 70, "Multiple Choice");
		Exam exam2b = new Exam(85, 70, "Essay");
		
		gb.addGrade("Marc Rebillet", assignment1b);
		gb.addGrade("Marc Rebillet", assignment2b);
		gb.addGrade("Marc Rebillet", exam1b);
		gb.addGrade("Marc Rebillet", exam2b);
		
		//Should display the following:
		
		/*
		Grades for: Louis Cole
		Assignment 1: 87.0 / 100, late days: 3
		Multiple Choice exam: 91.0 / 100
		Assignment 2: 63.0 / 80, late days: 0
		Essay exam: 20.0 / 85
		Exam Grade: 60.0
		Assignment Grade: 83.33333333333334
		Course Grade: 76.33333333333334

		Grades for: Marc Rebillet
		Assignment 1: 95.0 / 100, late days: 0
		Assignment 2: 70.0 / 80, late days: 4
		Multiple Choice exam: 70.0 / 100
		Essay exam: 70.0 / 85
		Exam Grade: 75.67567567567568
		Assignment Grade: 91.66666666666666
		Course Grade: 86.86936936936937
		*/
		gb.printAllGrades();
		
		//If you wish to include additional tests for your code,
		//please put them below.
		
		
		
		
		
	}
}
