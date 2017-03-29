/*
 * Start with int
 * if no int then go for wideing (near by)
 * Same Wrapper Type
 * var args
 */
class OverloadingRule
{
//	void show(int ...x){
//		System.out.println("Var Args");
//	}
	void show(long ...x){
		System.out.println("Long VarArgs");
	}
//	void show(Integer x){
//		System.out.println("INteger Wrapper...");
//	}
	void show(Long x){
		System.out.println("Long Wrapper...");
	}
//	void show(int x){
//		System.out.println("int show");
//	}
//	void show(long x){
//		System.out.println("long show");
//	}
	void show(short x){
		System.out.println("short show");
	}
//	void show(float x){
//		System.out.println("float show");
//	}
//	void show(double x){
//		System.out.println("double show");
//	}
	void show(byte x){
		System.out.println("byte show");
	}
	
}
public class TypePromotionRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingRule rule = new OverloadingRule();
		rule.show(1); // Implicit Call
		//rule.show((byte)1);  // Explicit Call
		// Wrapper Demo 
		int p = 100;  // p is primitive type
		Integer pp = 100; 
		
		
	}

}
