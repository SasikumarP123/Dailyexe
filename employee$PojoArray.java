package sasikumar;
import java.util.ArrayList;

public class employee$PojoArray {
	private String name;
	private int rollno;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public employee$PojoArray(String name,int rollno,int age)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}

	public static void main(String[] args) {
		ArrayList<employee$PojoArray> e=new ArrayList<>();
		e.add(new employee$PojoArray("sasi",1,25));
		e.add(new employee$PojoArray("kumar",2,25));
		e.add(new employee$PojoArray("mano",3,23));
		e.add(new employee$PojoArray("sam",4,24));
		for(employee$PojoArray i:e)
		{
			System.out.println("enter name="+i.getName());
			System.out.println("enter rollno="+i.getRollno());
			System.out.println("enter age="+i.getAge());
		}
		
		// TODO Auto-generated method stub

	
}
	
	
	
}


