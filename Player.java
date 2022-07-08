//declaring Player class

public class Player {

	//declaring Player variables
	
	public static String image;
	public static int width;
	public static int height;
	public static double x;
	public static double y;

	//start method with Player graphics info

	public static void start() {
		image = "assets/player.png";
		width = 42;
		height = 100;
		x = 50;
		y = 50;
	}

	//draw method to draw Player on the game area

	public static void draw() {
		StdDraw.picture(x + width / 2, y + height / 2, image);
	}

	//move method to define Player movement

	public static void move() {
		if (StdDraw.hasNextKeyTyped()) {
      		char choice = StdDraw.nextKeyTyped();
      		if (choice == 'w') {
				y = y - 50;
			}
			else if (choice == 's') {
				y = y + 50;
			}
			else if (choice == 'a') {
				x = x - 50;
			}
			else if (choice == 'd') {
				x = x + 50;
			}
      	}
    
      	//containing Player to the game area
      	//less than game area size to prevent clipping off the screen

      	if (x > 750) {
			x = 750;
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
	}

	//update method to update Player position after the move method

	public static void update() {
		move();
	}

	//obtaining Player position for collision detection with Enemy and Door
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