abstract class W
{
	int x;  // Instance Variables
	W(){  // To Initialize the Instance Variables
		x = 20;
		System.out.println("Parent Cons Call");
	}
	void show(){
		
	}
}
class W1 extends W{
	int y ;
	W1(){
		//super(); // Implicit Call
		y = 10;
		System.out.println("Child Cons Call "+(x+y));
		
	}
}
public class AbstractConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W1 obj = new W1();

	}

}
