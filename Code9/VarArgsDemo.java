
public class VarArgsDemo {
	// int x[]
	public int add(int ...x){
		int sum = 0;
//			for(int i = 0 ; i<x.length; i++){
//				sum = sum + x[i];
//			}
		// Enhance for Loop (1.5)
		for(int xCurrentValue : x){
			sum = sum + xCurrentValue;
		}
			return sum;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo var = new VarArgsDemo();
		System.out.println(var.add());
		System.out.println(var.add(10));
		System.out.println(var.add(10,20));
		System.out.println(var.add(10,20,30));
		System.out.println(var.add(10,20,30,40));

	}

}
