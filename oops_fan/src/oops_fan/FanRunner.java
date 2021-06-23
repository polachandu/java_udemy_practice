package oops_fan;

public class FanRunner {
	
	public static void main(String[] args) {
		Fan fan = new Fan("aluminuium",5.0,"green");
		fan.switchOn();
		System.out.println(fan.toString());
		fan.setSpeed((byte)3);
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());

	}
	
}
