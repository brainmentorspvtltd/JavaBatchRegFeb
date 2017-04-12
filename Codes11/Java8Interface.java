interface P
{
	int X = 10;
	void print();
	
	default void show(){
		System.out.println("P Show");
	}
}
interface P2 {
	int X = 20;  // public static final int X = 20;
	public default void show(){
		System.out.println("P2 Show");
	}
}
interface P3 extends P, P2{
	@Override
	public default void show(){
		P.super.show();
		P2.super.show();
		System.out.println(P.X + P2.X);
	}
}
class P4 implements P3{
	public void print(){
		System.out.println("P4 Print...");
	}
}
public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4 obj= new P4();
		obj.show();
	}

}
