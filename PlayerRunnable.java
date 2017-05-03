public class PlayerRunnable implements Runnable {
	Player player;
	public PlayerRunnable(Player p) {
		player = p;
	}	

	public void run() {
		try {
			while (player.isAlive()) {
				Move theMove = player.getMove();
				int result = player.getResult(theMove);
				player.awardTrophies(result);
				Thread.sleep(10);
			}
		} catch (InterruptedException exception) {
			// A sleeping thread may be interrupted to be
			// terminated.
		}
	}
}