// 1. Weaker Access Rule
// 2. CoVaraint Return Type (1.5)
class X{ 
	int a,b;
}
class XPlus extends X{
	int c,d;
}

class Parent
{
	protected X show(){
		System.out.println("Parent Show");
		X obj = new X();
		obj.a = 10;
		obj.b = 20;
		return obj;
	}
}
class Child extends Parent
{
	public XPlus show(){
		System.out.println("Child Show");
		XPlus obj = new XPlus();
		obj.a = 10;
		obj.b = 20;
		obj.c = 30;
		obj.d = 40;
		return obj;
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child  = new Child();
		XPlus xplus = child.show();

	}

}
