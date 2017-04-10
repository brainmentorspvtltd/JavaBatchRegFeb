abstract class Product
{
	double price;
	int id;
	String name;
	void qualityCheck(){
		System.out.println("10 Step Quality Check");
	}
abstract void delievery();
}
abstract class Shoes extends Product{

}
class Mobile extends Product
{
	void thirtyDayReplacement(){
		
	}
void delievery(){
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
