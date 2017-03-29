/*
 * What is Overloading?
 * Same Name Method with 
 * Different Type of Arguments or Different Number of Arguments
 * Overloading never depends on return type, order of arguments can be 
 * change
 * Why u do overloading?
 * When logic is same but arguments are different
 * e.g FlipKart Search
 * Search By Price  , Search By Brand, Search by Price and Brand
 * search(double price), search(String brand), search(double price, String brand)
 */
class Calc{
	public int add(int x, int y ){
		return x + y;
	}
	// No of Arguments
	public int add(int x, int y , int z){
		return x + y + z;
	}
	// Type of Arguments
	public double add(double x , double y){
		return x + y;
	}
	// Order of Arguments
	public long add(int x , long y){
		return x + y;
	}
	public long add(long x , int y){
		return x + y;
	}
	
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new Calc();
		long result = calc.add(10l, 20);
		
		System.out.println("Result is "+result);
		

	}

}
