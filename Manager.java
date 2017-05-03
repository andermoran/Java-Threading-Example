public class Manager extends Thread {
	static int previousTrophies;
	public Manager() {
		previousTrophies = 0;
	}
	
	public synchronized void awardBonus() {
		System.out.println("Bonus for " + (Main.trophies / 1000) * 1000 + " trophies!");
	}
	
	public void increaseLevel() {
	
	}
	
	public void run() {
		try {
			Thread.sleep(5);
			while (true) {
				//System.out.println(Main.trophies + " % 1000 = " + Main.trophies % 1000);
				//System.out.println("Manager thread ran with " + Main.trophies + " trophies");
				if (Main.trophies/1000 > previousTrophies / 1000) {
					awardBonus();
				}
				previousTrophies = Main.trophies;
				Thread.sleep(10);
				
			}
		} catch (InterruptedException exception) {
			// A sleeping thread may be interrupted to be
			// terminated.
		}
	}
}
