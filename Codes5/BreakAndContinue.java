import java.io.IOException;
import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) throws IOException {
		Scanner tt = new Scanner("hello how are you Hello i am fine Hello");
		int counter=0;
		while(tt.hasNext()){
			String temp = tt.next();
			if(temp.equalsIgnoreCase("Hello")){
				counter++;
			}
			//System.out.println(tt.next());
		
		}
		System.out.println("Hello Word Count "+counter);
		
		//String path = "/Users/amit/Documents/TestFileHandlingFeb/Testing/output.txt";
		Scanner scanner = new Scanner(System.in);
		//System.setOut(new PrintStream(path));
		//System.out.println("Hello Java");
		//byte b[] = new byte[10];
		System.out.println("Enter the Age ");
		int age = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		scanner.close();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Salary");
		double salary = s.nextDouble();
		System.out.println("Salary is "+salary);
		s.close();
		 //System.in.read(b);
		 //String s = new String(b);
		//System.out.println(s);
		//System.in;

	}

}
