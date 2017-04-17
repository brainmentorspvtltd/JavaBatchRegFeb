@FunctionalInterface 
interface Calc
{
	
	public abstract int calculate(int x, int y);
}
//1st Way
// Create a class implement a interface
class MyCalc implements Calc
{
	// override the method
		@Override
		public int calculate(int x, int y){
			return x + y;
		}
}

class Test{
	void print(){
		System.out.println("this is print....");
	}
	void show(){
		System.out.println("this is show");
	}
}
class Test2 extends Test{
	
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(){
			@Override
			void print(){
				super.print();
				System.out.println("this is anonymous class print..");
			}
		};
		test.print();
		MyCalc calc = new MyCalc();
		MyCalc calc2 = new MyCalc();
		System.out.println(calc.calculate(100, 200));
		
		// During Object creation we create a  class
		// Anonymous Class
		Calc obj = new Calc(){
			// override the method
			@Override
			public int calculate(int x, int y){
				return x + y;
			}
		};
		Calc obj3 = new Calc(){
			// override the method
			@Override
			public int calculate(int x, int y){
				return x + y;
			}
		};
		System.out.println(obj.calculate(1000, 2000));
		
		// 3rd Lambda Expression (SAM (Single Abstract method) Interface)
		Calc obj2 = (x,y)->x+y;
		System.out.println(obj2.calculate(100, 200));
		Calc obj4 = (x,y)->{
			System.out.println("X is "+x);
			System.out.println("Y is "+y);
			return  x + y;
		};
		System.out.println(obj4.calculate(90, 90));
		
	}

}
