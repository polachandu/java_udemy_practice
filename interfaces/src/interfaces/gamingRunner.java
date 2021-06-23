package interfaces;

public class gamingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gamingConsole game = new marioGame();
		gamingConsole game = new chessGame();
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
