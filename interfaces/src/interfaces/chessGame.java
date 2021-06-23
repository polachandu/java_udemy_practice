package interfaces;

public class chessGame implements gamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("move forward");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("move backward");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move right");

	}

}
