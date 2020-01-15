package School_management_sytem;

/**
 * 
 * @author DELL
 *creating thr Teacher class with
 *Teacher name,teacher id, teacher salary field
 *
 */
public class Teachers {

	private int t_id;
	private String t_name;
	private int salary;
	private static int salaryEarned;
	
	/**
	 * 
	 * @param t_id  is the Teacher id
	 * @param t_name Teacher name
	 * @param salary Teacher salary
	 */
	public Teachers(int t_id,String t_name,int salary)
	{
		this.t_id=t_id;
	    this.t_name=t_name;
	    this.salary=salary;
	    this.salaryEarned=0;
	}
	
	/**
	 * 
	 * @return teacher id
	 */
	public int getId(){
		return t_id;
	}
	
	/**
	 * 
	 * @return teacher name
	 */
	public String getName()
	{
		return t_name;
	}
	
	/**
	 * 
	 * @return teacher salary
	 */
	public int getSalary()
	{
		return salary;
	}
	/**
	 * 
	 * @param salary: setting the salary for the teacher
	 */
	public void updateSalary(int salary)
	{
		salaryEarned+=salary;
		School.TotalMoneySpent(salary);
	}
    
	public int getsalaryEarned()
	{
		return salaryEarned;
	}
}
