
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[] = new int[10];  // 0 
		int g[] = {10,20,30,40,50};
		int []k1 = {10,20,30,40,50};
		int pp[] =new int[]{10,20,30,40,50};
		for(int i = 0 ; i<pp.length; i++){
			System.out.println(pp[i]);
		}
		System.out.println("Enhance Loop");
		// enhance for loop Java 1.5
		for(int l : pp){
			System.out.println(l);
		}

	}

}
