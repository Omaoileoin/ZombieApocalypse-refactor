//declaring Door class

public class Door {

	//declaring Door variables

	public static String image;
	public static int width;
	public static int height;
	public static double x;
	public static double y;
	public static boolean gameOver;

	//start method with Door graphics info

	public static void start() {
		image = "assets/door.png";
		width = 79;
		height = 150;
		x = 720;
		y = 225;
	}

	//draw method to draw Door on the game area

	public static void draw() {
		StdDraw.picture(x + width / 2, y + height / 2, image);
	}

	//obtaining Door position for collision detection with Player

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
		return Door.getLeft() <= Player.getRight() || Player.getLeft() <= Door.getRight();
	}

	public static boolean isTouchingY() {
		return Door.getTop() <= Player.getBottom() || Player.getTop() <= Door.getBottom();
	}

	public static boolean isTouching() {
		return isTouchingX() && isTouchingY();
	}

	//update method to return if Player and Door are touching

	public static void update() {

		//gameOver boolean if Player and Door are touching
		//not working

		if (Door.isTouching() && Player.isTouching()) {
			gameOver = true;
		}
	}
}
