import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.*;

public class Main {
	// These can be accessed from other functions as Main.mylock,
	// Main.cond, Main.trophies
	final public static Lock mylock = new ReentrantLock();
	final public static Condition cond = mylock.newCondition();
	public static int trophies;
	
	public static void main(String[] args) {
		// This is a 2-player situation
		Player p1 = new Player();
		Player p2 = new Player();
		// Stuff here to initialize players
		Manager m = new Manager();
		// Stuff here to initialize game manager
		PlayerRunnable pr1 = new PlayerRunnable(p1);
		PlayerRunnable pr2 = new PlayerRunnable(p2);
		Thread t1 = new Thread(pr1);
		Thread t2 = new Thread(pr2);

		t1.start();
		t2.start();
		m.start();
	}
}