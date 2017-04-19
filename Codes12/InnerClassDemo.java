class C11
{
	int dd= 200;
	void show(){
		int bb =100;  // local var (stack)
		class B{
			void show(){
				dd++;
				//System.out.println(bb);
		//bb++;
			}
		}
		bb++;
		B obj = new B();
		obj.show();
	}
}
class Emp
{
	interface Travel{
		
	}
	class BusTravel implements Travel{
		
	}
	class AirTravel extends BusTravel{
		
	}
	
}
class Outer // Inner class
{
	private int x;
	Outer(){
		 x= 10;
		System.out.println("Outer Class Cons Call");
	}
	void show(){
		System.out.println("Outer Show...");
	}
	class Inner
	{
		private int x;
		Inner(int x){
			this.x = x;
			int z = this.x + x + Outer.this.x ;
			System.out.println("Inner Class Cons Call "+z);
		}
	}
}
// Nested Class
class P1
{
	static class Q
	{
		static void print(){
			System.out.println("this is print..");
		}
	}
	
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.show();
		Outer.Inner inner = outer.new Inner(20);
		P1.Q.print();
		
	}

}
