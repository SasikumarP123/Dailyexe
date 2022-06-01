
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Employee
{
	private int empno;
	private String empname;
	private int salary;
	 Employee(int empno,String empname,int salary)
	 {
		 this.empno=empno;
		 this.empname=empname;
		 this.salary=salary;
	 }
	 public int getEmpno()
	 {
		 return empno;
	 }
	 public int getSalary()
	 {
		 return salary;
	 }
	 public String getEmpname()
	 {
		 return empname;
	 }
	 public String toString()
	 {
		 return empno+" "+empname+" "+salary;
	 }


	public static void main(String[] args) {
		
		ArrayList<Employee> em=new ArrayList<Employee>();
		
		Scanner s = new Scanner(System.in); 
		{
			int ch;
				System.out.println("Enter Your Choice: ");
				System.out.println("1.Insert");
				System.out.println("2.Display");
				System.out.println("3.Search");
				System.out.println("4.Delete");
				System.out.println("5.Update");
				
				
				do {				
					ch=s.nextInt();	
					
				switch(ch)
				{
					
				case 1:
					System.out.println("Insert employee details");
					System.out.println("Enter the no of employee");
					int n=s.nextInt();	
					for(int i=0;i<n;i++)
					{						
					System.out.print("Enter empno: ");
					int empno=s.nextInt();
					System.out.print("Enter empname: ");
					String empname=s.next();
					System.out.print("Enter salary: ");
					int salary=s.nextInt();						
								
					em.add(new Employee(empno,empname,salary));						
					}
					break;
					
					
				case 2:
					
					System.out.println("2.Display employee details\n");
					System.out.println("---Employee Details---\n");
					
					Iterator<Employee> i=em.iterator();
					
					while(i.hasNext())
					{
						Employee e= i.next();
						System.out.println(e);
					}
					System.out.println("--------------------");
					break;
					
				case 3:
					
					System.out.println("3.Search employee details\n");
					boolean emp=false;
					System.out.println("Enter employee no to search:\n");
					int empno=s.nextInt();					
					i=em.iterator();
					
					while(i.hasNext())
					{
						Employee e=i.next();
						if(e.getEmpno()==empno)
						{
							System.out.println(e);
							emp=true;
						}
					}	
					if(!emp)
					{
						System.out.println("Record not found");
					}
					System.out.println("--------------------");
					break;
					
				case 4:
					
					System.out.println("4.Delete employee details\n");
					emp=false;
					System.out.println("Enter empno to Delete:\n");
					empno=s.nextInt();
					System.out.println("---Employee Delete---");
					i=em.iterator();
					while(i.hasNext())
					{
						Employee e= i.next();
						if(e.getEmpno()==empno)
						{
							i.remove();
							
							emp=true;
						}
					}	
					if(!emp)
					{
						System.out.println("Record not found");
					}else
					{
						System.out.println("Record is Deleted...");
					}
					System.out.println("--------------------");
					break;
					
				case 5:
					
					System.out.println("5.Update employee details\n");
					emp=false;
					System.out.println("Enter empno to Update:\n");
					empno=s.nextInt();				
					ListIterator<Employee> li = em.listIterator();
					
					while(li.hasNext())
					{
						Employee e= li.next();
						if(e.getEmpno()==empno)
						{
							System.out.println("Enter new name: ");
							 String empname=s.next();
							System.out.println("Enter new salary: ");
							int salary =s.nextInt();
							li.set(new Employee(empno,empname,salary));
							emp=true;
						}
					}
					
					if(!emp)
					{
						System.out.println("Record not found");
					}
					else
					{
						System.out.println("Update Successfully...");
					}
					System.out.println("--------------------");
					break;
				}
				System.out.println("Enter the choice ");
				
				}while(ch!=0);
			
		}

	}


}
