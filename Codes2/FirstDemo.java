import java.util.Scanner;

//public class name must be same as File Name

public class FirstDemo {

	public static void main(String[] args) { //throws Exception {
		// Loops
		
		//System.out.println("Hello Java ");
		//System.out.println("Enter Single Byte");
		// Scanner is Acting as a Buffer
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the Number");
		int number = scanner.nextInt();
		for(int i = 1 ; i<=10; i++){
			System.out.println(number + "*"+i+"="+ number*i);
		}
		//System.out.println("Now range is "+n);
		
		scanner.close(); // Buffer close
		//int singleByte = System.in.read();  // It is used to read
		//System.out.println((char)singleByte);
//		int a = 10;
//		int b = 20;
//		int c =  a + b;
//		System.out.println("sum is "+c);

	}

}
