package School_management_sytem;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Teachers kamal = new Teachers(1,"kamalaksha",30000);
		Teachers ramgopal=new Teachers(1,"ramgopal",40000);
		Teachers venkatesh =new Teachers(3,"venkatesh", 50000);
		
		ArrayList<Teachers> teachers=new ArrayList<Teachers>();
		teachers.add(kamal);
		teachers.add(ramgopal);
		teachers.add(venkatesh);
		
		Student ramesh = new Student(100,"ramesh",2);
		Student suresh = new Student(200,"suresh", 10);
		
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(ramesh);
		student.add(suresh);
		 
		
		School shs=new School(teachers, student);
		ramesh.Payfees(20000);
		suresh.Payfees(5000);
		
		kamal.updateSalary(10000);
		
	    ramesh.setGrade(5);
	    System.out.println(ramesh.getGrade()); 
		System.out.println("Sarvodaya high school as Earned -->"+shs.getTotalMoneyEarned());
		System.out.println("Sarvodaya high school as spent -->"+shs.getTotalMoneySpent());
		System.out.println("sarvodaya as paid salary to "+kamal.getName());
		System.out.println("sarvodaya high school as "+shs.gettotalMoneyleft());
	}

}
