import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) throws Exception {
		Robot r2d2 = new Robot("batman");

		r2d2.setSpeed(100);
		r2d2.move(25);
		r2d2.penDown();
		r2d2.turn(90);
		r2d2.move(50);
		r2d2.turn(180);
		r2d2.move(25);
		r2d2.turn(270);
		r2d2.move(50);
		r2d2.turn(40);
		r2d2.move(10);
		r2d2.turn(50);
		r2d2.move(10);
		r2d2.turn(10);
		r2d2.move(7);
		r2d2.penUp();
		r2d2.turn(80);
		r2d2.move(50);
		r2d2.turn(90);
		r2d2.move(75);
		r2d2.penDown();
		for (int i = 0; i < 36; i++) {

			r2d2.move(5);
			r2d2.turn(10);
		}
		r2d2.penUp();
		r2d2.move(75);
		r2d2.turn(270);
		r2d2.turn(180);
		r2d2.penDown();
		r2d2.move(50);
	}
}
