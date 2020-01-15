package School_management_sytem;

import java.awt.List;
import java.util.ArrayList;

public class School {
	
	private ArrayList<Teachers> teachers;
	private ArrayList<Student> students;
	
	private  static int totalMoneyEarned;
	private static int totalMoneySpent;
	private static int totalmoneyleft;
	
	/**
	 * 
	 * @param teacher list of teachers in a school
	 * @param student  list of student in a school
	 */
	public School(ArrayList<Teachers> teacher, ArrayList<Student> student) {
		this.teachers = teacher;
		this.students= student;
		this.totalMoneyEarned=0;
		this.totalMoneySpent=0;
		this.totalmoneyleft=0;
		
	}

 /**
  * 
  * @param teacher adding  the teacher for a school
  */
	public void AddTeacher(ArrayList<Teachers> teacher) {
		teachers.addAll(teacher);
	}
	
	/**
	 * 
	 * @return no of teacher object
	 */
	public ArrayList<Teachers> getTeacher() {
		return teachers;
	}

	/**
	 * 
	 * @param student setting a student for a school
	 */
	
	public void updateStudent(ArrayList<Student> student) {
	    students.addAll(student);
	}
	
	/**
	 * 
	 * @return no of student in school
	 */
	public ArrayList<Student> getStudent() {
		return students;
	}

	//setting the money which is earned by school
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		
		totalMoneyEarned+=MoneyEarned;
		totalmoneyleft+=MoneyEarned;
	}
	
	//getting the amount eraned by school
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void TotalMoneySpent(int MoneySpent) {
		totalMoneySpent=totalMoneySpent+MoneySpent;
		totalmoneyleft-=MoneySpent;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public int gettotalMoneyleft()
	{
		return totalmoneyleft;
	}
	
}
