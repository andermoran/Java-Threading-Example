import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.*;

public class Player {
	// Some attributes, constructors, methods, etc. defined here
	private boolean alive;
	
	Player() {
		alive = true;
	}
	public boolean isAlive() {
		//... This returns true if the player is alive
		return alive;
	}
	public Move getMove() {
		//... This gets a move from a user
		Move m = new Move();
		return m;
	}
	public int getResult(Move nextmove) {
		//... This returns the number of trophies the move resulted in
		return 200;
	}
	public synchronized void awardTrophies(int numtrophies) {
		System.out.println("Thread id -> " + Thread.currentThread().getId() + " called method awardTrophies");
		Main.trophies += numtrophies;
	}
}