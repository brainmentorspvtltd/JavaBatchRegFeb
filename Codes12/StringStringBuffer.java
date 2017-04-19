
public class StringStringBuffer {

	public static void main(String[] args) {
		String msg = "";
		Runtime r  = Runtime.getRuntime(); // get the Heap info
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory()- r.freeMemory());
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<100000; i++){
			msg = "Welcome User";
			//msg = new String("Welcome User "+i);
			//msg = "Welcome User"+i;
			//msg = new String("Welcome User");  // 2 or 1 
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory()- r.freeMemory());
		
		
		
		String a = "amit".intern(); // String Literal  1 or 0 
		String b  = "amit".intern();
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("not same ref");
		}
		a = a + " srivastava";
		System.out.println(a );
		System.out.println(b);
		if(a==b){
			System.out.println("Same ");
		}
		else
		{
			System.out.println("not same");
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("highhhgghdghdkfghjdfhgjhdfghdkjhgkgdjkfhgkjdhfgjkhjfdghkjdfgjkhd");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		/*
		 * 
		 */

	}

}
