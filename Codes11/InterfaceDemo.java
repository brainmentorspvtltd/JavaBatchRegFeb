import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

// Standard (What to DO) 100% Abstract
interface IPlayer  // abstract interface IPlayer
{
	int NORM_POWER = 10; // public static final int NORM_POWER = 10;
	int MAX_POWER = 100;
	// all methods are public and abstract by default in interface
	void run();  //public abstract void run();
	void jump();
	void attack();  // declare
	
	
}
interface IStarPlayer{
	void lotOfPowers();
}
class GreenPlayer{
	void runHard(){
		System.out.println("Green Player Run Hard...");
	}
	void goUp(){
		
	}
}
class RedPlayerImpl implements IPlayer, IStarPlayer{
	public void lotOfPowers(){
		WindowListener l ;
		WindowAdapter w;
	}
	@Override
	public void run(){
		System.out.println("Red Player Run Fast...");
	}
	@Override
	public void jump(){
		System.out.println("Red Player Jump Average ");
	}
	@Override
	public void attack(){
		System.out.println("Red Player Attack Hard "+MAX_POWER);
	}
}
class YellowPlayerImpl implements IPlayer{
	@Override
	public void run(){
		System.out.println("Yello Player Run Average...");
	}
	@Override
	public void jump(){
		System.out.println("Red Player Jump Low ");
	}
	@Override
	public void attack(){
		System.out.println("Red Player Attack Medium "+MAX_POWER/2);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenPlayer red = new GreenPlayer();
		//red.jump();
		//red.attack();
		//red.run();

	}

}
