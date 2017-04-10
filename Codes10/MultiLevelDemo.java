class Parent
{
	int x ; // Instance Variable
//	Parent(){
//		System.out.println("this is parent default ");
//	}
	Parent(int x){
		this.x = x;   // Local Variable name and instance variable name is same
		// must use this to distguish
		//x = 100;
		System.out.println("Every Class Has Default Parent..."+this.x);
	}
}
class Child extends Parent
{
	int y ;
	int x = 90;
	Child(){
		super(100);  // Explicit Call 
		//super();
		//super(); // it is parent class cons call (Implicit Call)
		y = 20 + this.x + super.x;
		System.out.println("Every Class Has Default Child... "+y);
	}
	Child(int x){
		super(200);
		//super();
		int z = super.x + this.x + x;
		System.out.println("this is param Cons of Child class "+z);
	}
}

public class MultiLevelDemo {

	public static void main(String[] args) {
		Child child =new Child(1);

	}

}
