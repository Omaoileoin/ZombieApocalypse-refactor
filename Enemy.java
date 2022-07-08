//declaring Enemy class

public class Enemy {

	//declaring Enemy variables
	
	public static String image;
	public static int width;
	public static int height;
	public static double x;
	public static double y;
	public static long time;
	public static boolean gameOver;

	//start method with Enemy graphics info

	public static void start() {
		image = "assets/Zombie.png";
		width = 100;
		height = 100;
		x = 400;
		y = 300;
	}

	//draw method to draw Enemy on the game area

	public static void draw() {
		StdDraw.picture(x + width / 2, y + height / 2, image);
	}

	//move method to define Enemy movement

	public static void move() {
		int zombieOneChoice = (int) (Math.random() * 4);
			if (zombieOneChoice == 0) {
				x = (x + 50);
			}
			else if (zombieOneChoice == 1) {
				x = (x - 50);				
			}
			else if (zombieOneChoice == 2) {
				y = (y - 50);
			}
			else if (zombieOneChoice == 3) {
				y = (y + 50);
			}

		//containing Enemy to the game area
		//less than game area size to prevent clipping off the screen

		if (x > 700) {
			x = 700;
		}
		if (x < 1) {
			x = 1;
		}
		if (y > 490) {
			y = 490;
		}
		if (y < 1) {
			y = 1;
		}

		time = System.currentTimeMillis();
	}

	//update method to update Enemy position after the move method
	
	public static void update() {
		long now = System.currentTimeMillis();

		//using if statement to move Enemy every 500 milliseconds

		if (now - time > 500) {
			Enemy.move();
		}

		//gameOver boolean if Enemy and Player are touching
		//not working

		if (Enemy.isTouching() && Player.isTouching()) {
			gameOver = true;
		}
	}

	//obtaining Enemy position for collision detection with Player
	//not working

	public static double getLeft() {
		return x;
	}

	public static double getTop() {
		return y;
	}

	public static double getBottom() {
		return y + height;
	}

	public static double getRight() {
		return x + width;
	}

	public static boolean isTouchingX() {
		return Player.getLeft() <= Enemy.getRight() || Enemy.getLeft() <= Player.getRight();
	}

	public static boolean isTouchingY() {
		return Player.getTop() <= Enemy.getBottom() || Enemy.getTop() <= Player.getBottom();
	}

	public static boolean isTouching() {
		return isTouchingX() && isTouchingY();
	}
}