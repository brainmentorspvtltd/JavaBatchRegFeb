import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="amit";
		System.out.println(a.toUpperCase());
		a.toLowerCase();
		int len = a.length();
		char t = a.charAt(0);
		String t1 = String.valueOf(10.20);
		String t2 = String.valueOf(true);
		String t3 = a.substring(2);
		String t4 = a.substring(2, 4); //index, position
		System.out.println(a.compareToIgnoreCase("ANIL"));
		System.out.println(a.equals("amit"));
		System.out.println("Ram Kumar".endsWith("Kumar"));
		System.out.println("Ram Kumar".startsWith("Ram"));
		System.out.println("Hello How are You".contains("How"));
		System.out.println("Hello".indexOf("l"));
		System.out.println("Hello".lastIndexOf("l"));
		a= a.concat("srivastava").concat("hello").concat("hi");
		a= a + "srivastava" +"hello"+"hi";
		byte w [] = a.getBytes();
		char ee [] = a.toCharArray();
		Arrays.sort(ee);
		String bb1 = new String(ee);
		System.out.println(bb1);
		String address = "A-10, Shakti Nagar, Delhi-7";
		String arr [] = address.split(",");
		for(String ar : arr){
			System.out.println(ar);
		}
		a.isEmpty();
		"Hello".replace("l", "w");
		String temp = "        Hello    How         ";
		System.out.println("["+temp+"]");
		System.out.println("["+temp.trim()+"]");

	}

}
