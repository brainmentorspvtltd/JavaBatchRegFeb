class SMSSingleton
{
	private static SMSSingleton object = new SMSSingleton(); // Eager
	//private static SMSSingleton object = null;
	private SMSSingleton(){
		
	}
	public static SMSSingleton getInstance(){
//		if(object==null){   // Lazy
//			object = new SMSSingleton();
//		}
		return object;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime(); // singleton
		SMSSingleton obj = SMSSingleton.getInstance();
		SMSSingleton obj2 = SMSSingleton.getInstance();
		if(obj==obj2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
