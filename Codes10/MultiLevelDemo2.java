class GrandFather{
	int x =10;
	static int y;
}
class Father extends GrandFather{
	int x = 20;
	void show(){
		System.out.println("this is father show");
	}
}
class Son extends Father{
	int x = 30;
	Son(int x){
		int z = ((GrandFather)this).x + ((Father)this).x + this.x + x;
		System.out.println("Z is "+z);
	}
	@Override
	void show(){
		System.out.println("this is Son Show");
	}
	void print(){
		System.out.println("Son print..");
	}
}
public class MultiLevelDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GrandFather.y;
		// ParentType ref = new SubType();
		Father son = new Son(1);
		son.show();  // Object
		System.out.println(son.x);  // Type
		//son.print();
	}

}
