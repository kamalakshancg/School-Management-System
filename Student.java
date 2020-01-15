package School_management_sytem;

/**
 * 
 * @author DELL
 *class containing all the field of student
 */
/**
 * @author DELL
 *
 */
public class Student {
	
	private int stu_id;
	private String stu_name;
	private int  grade;
	private int feespaid;
	private int totalfees;
	
	/**
	 * 
	 * @param stu_id student id which is unique
	 * @param stu_name student name 
	 * @param grade student grade
	 * 
	 * Initially fees paid is 0
	 * Total fee for Every student is $30000
	 */
	Student(int stu_id,String stu_name,int grade)
	{
		this.stu_id=stu_id;
		this.stu_name=stu_name;
		this.grade=grade;
		this.feespaid=0;
	    this.totalfees=30000;
	}
	
	//  we are not going to alter the student name and student id
	
	/**
	 * 
	 * @param grade is new grade of the student
	 * setGrade is used to update the grade of the student
	 */
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	
	/**
	 * keep adding the fees to feespaid 
	 * 
	 * add the amount paid by student to feespaid field
	 * @param feespaid is the fees paid by student
	 */
	public void Payfees(int fees)
	{
		feespaid+=fees;
		School.updateTotalMoneyEarned(feespaid);
	}

	/**
	 * 
	 * @return: student id,student name,student grade, student feespaid
	 */
	public int getStu_id() {
		return stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeespaid() {
		return feespaid;
	}

	public int getTotalfees() {
		return totalfees;
	}
	
   public int getremainingfees()
   {
	   return totalfees-feespaid;
   }


}

