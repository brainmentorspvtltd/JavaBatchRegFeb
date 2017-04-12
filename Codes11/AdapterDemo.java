interface A
{
	void show();
	void print();
	
}
interface A2 {
	int X = 100;
	void disp();
	void add();
}
interface A3{
	int X = 200;
	void output();
	void add();
}
interface A4 extends A2, A3{
}	
abstract class A1 implements A, A4
{
	public void show(){}
	public void print(){}
	//public void disp(){}
	//public void output(){}
}
//class B extends A1 implements A2, A3
//class B extends A1
//{
//	
//}
//class C extends A1 implements A2,A3{
//class C extends A1	
//}
public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pp = 100;
		Integer ee = 100;
		ee++;
		System.out.println(ee);

	}

}
