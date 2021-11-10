class Employee{
   void sal(){
       }
       }
class Manager extends Employee
      {
	int managerSalary;
	int incentive;
	Manager(int managerSalary,int incentive)
	{
		this.managerSalary=managerSalary;
		this.incentive=incentive;
		
	}
	public void salary()
	{
		System.out.println("the salary of manager is: "+(managerSalary+incentive));
	}
       }
class Labour extends Employee
      {
	int labourSalary;
	int overtime;
	Labour(int labourSalary,int overtime)
	{
		this.labourSalary=labourSalary;
		this.overtime=overtime;
		
	}
	public void salary()
	{
		System.out.println("the salary of labour is: "+(labourSalary+overtime));
	}
      }
public class  EmployeeMain
      {
	public static void main(String[] args)
	{
		Manager manager = new Manager(15000,5000);
		Labour labour = new Labour(1000,500);
		manager.salary();
		labour.salary();
	}
      }
