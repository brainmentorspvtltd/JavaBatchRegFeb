class RR
{
	RR(int x){
		System.out.println("I am a Param cons");
	}
	RR(){
		System.out.println(" i am a  default constructor");
	}
	void RR(){
		System.out.println(" i am a method");
	}
}
public class QQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RR obj = new RR(100);
		obj.RR();
	}

}
