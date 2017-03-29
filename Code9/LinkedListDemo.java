import java.util.LinkedList;

class Product
{
	int pid;
	String name;
	double  price;
	int quantity;
	Product (int pid, String name, double price, int quantity){
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
}
/*
 * Primitive - Keywords (int , float , double)
 * Wrapper Classes (Integer, Float , Double)
 * int Integer
 * long Long
 * float Float
 * double Double
 * Why Wrapper 
 * 1. Java Old D.S Supports only Objects (need of Boxing and UnBoxing)
   2. Near to OOPS 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		int w;
		float r;
		Integer rr ;
		// TODO Auto-generated method stub
		//LinkedList l = new LinkedList();  //It can take anything
		//LinkedList<String> strList = new LinkedList<String>();
		LinkedList<Integer> l = new LinkedList<Integer>();  // Java 1.5 (Generic)
		l.add(10); //AutoBoxing
		l.add(20);
		//l.add(10.20);
		int result = l.get(0) + l.get(1); //AUTOBOXING
		System.out.println("result "+result);
		//l.add(new Integer(10)); //Boxing // Object 
		//l.add(new Integer(20));
		// 1.5 Autoboxing
		//int result = ((Integer)l.get(0)).intValue() + ((Integer)l.get(1)).intValue(); //unboxing
		//l.add(10);
		//l.add(20);
		Product product = new Product(1001,"Mobile",9999,1);
		LinkedList<Product> productList  = new LinkedList<Product>();
		productList.add(product);
		Product product2 = new Product(1002,"Laptop",49999,1);
		productList.add(product2);
		double sum = 0;
		for(Product p : productList){
			sum = sum + p.price;
		}
		System.out.println("Total is "+sum);
	}

}
