package interfaces;

public class marioGame implements gamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("move up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("move down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move back");

		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move forward");

	}

}
