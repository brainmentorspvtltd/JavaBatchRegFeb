// Utility Class - private cons + static methods + final class
//final class MathOperations
import static java.lang.System.out;
interface MathOperations // Utility INterface
{
//	private MathOperations(){}
	public static double sin(){
		System.out.println("Sin Operation");
		return 0.0;
	}
}

class Employee
{
	int id;  // Instance Variable
	String name;
	int c;
	int fund2;
	static int fund = 10000;
	static int counter; // Class Variables
	Employee( String name){
		this.id = 1001;
		this.name = name;
		counter++;
		fund = fund - 1000;
		c++;
		System.out.println("I am Cons I Call When u Create Object C "+c+" Counter "+counter);
	}
	{
		System.out.println("this is init block, Pre Constructor");
	}
	{
		
	}
	{
		
	}
	static{
		//counter = 1000;
		System.out.println("I Call When Class is Load "+counter);
		
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		//System s = new System();
		// TODO Auto-generated method stub
		//MathOperations obj = new MathOperations();
		//obj.sin();
		MathOperations.sin();
		out.println(Employee.counter);
		Employee ram =new Employee("ram");
		out.println(ram.name);
		Employee shyam =new Employee("shyam");
		out.println(shyam.name);
		Employee mike =new Employee("mike");
		out.println(Employee.counter);
		
		
	}

}
