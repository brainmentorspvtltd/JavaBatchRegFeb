
public class LabeledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prince:  // define a label
		for(int i = 1; i<=3;i++){
			for(int j= 1; j<=3; j++){
				if(i==j){
					//break;
					break prince;
					//continue prince;
				}
				else
				{
					System.out.println("I is "+i+" and j is "+j);
				}
			}
		}

	}

}
