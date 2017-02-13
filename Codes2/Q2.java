import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//File file =new File("e:\\xyz.txt");
		//file.createNewFile();
		//int p [] = new int[10];
		//p[11]=1000;
		Scanner in = new Scanner(System.in);
        int t=in.nextInt(); //no of times repeat
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt(); //range
            
            
            for(int j = 1; j<=n ; j++){
            	int sum = 0;
            	for(int k = 0 ; k<j; k++){
            sum = sum +  (int)Math.pow(2,k) * b;	
            //sum = sum + a;
            	}
            	sum = sum +a;
            	System.out.print(sum+" ");
            	
            	//sum = sum + a + (int)Math.pow(2, j) * b;
            	//System.out.println(sum);
            }
            System.out.println();
        }
        in.close();

	}

}
