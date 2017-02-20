
public class Demo2 {

	public static void main(String[] args) {
		// what is 2-d array?
		int x[] = {10,20,30};
		String fruits[] = {"apple","orange"};
		for(String fruit:fruits){  // Java 1.5 (Enhance for loop)
			System.out.println(fruit);
		}
		String f[][]= {{"orange","litchi"},{"apple","banana"}};
		for(String t[] : f){
			for(String n : t){
				System.out.print(n+" ");
			}
			System.out.println();
		}
		//int y[][]= new int[3][3];
		//int []y[] = new int[3][3];
		//int [][]y = new int[3][3];
		//int y[][] = new int[3][];
		int y[][] = {{1,2,3,4,5},{10,20},{90}};
		//y[0] = new int[10];
		//y[1] = new int[20];
		//y[2] = new int [30];
		for(int i[]:y){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
//		for(int i =0; i<y.length;i++){
//			for(int j = 0; j<y[i].length; j++){
//				System.out.print(y[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("3-d");
		int z[][][] = {{{1,2,3,4,5},{6,7,8,9,10},{6,2,3},{4,2}},{{1,1},{66,77},{666},{777,88,66}},{{54},{666,77},{88},{43}}};
		for(int i [][]:z){
			for(int j[]:i){
				for(int k:j){
					System.out.print(k+" ");
				}
				System.out.println();
			}
		}
		//int z[][][]=new int[3][4][5];
//		for(int i = 0 ; i<z.length; i++){
//			for(int j = 0; j<z[i].length; j++){
//				for(int k = 0 ; k<z[i][j].length; k++){
//					System.out.print(z[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//		}
		
		

	}

}
