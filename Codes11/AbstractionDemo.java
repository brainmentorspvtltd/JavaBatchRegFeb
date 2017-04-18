class C{
	
}
interface P
{
	void print();
}
class A implements P
{
	public void print(){
		System.out.println("A print...");
	}
	public void show(){
		System.out.println("A Show...");
	}
}
class B {
	void display(){
		P obj = new A();
		obj.print();
		//obj.show();
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
