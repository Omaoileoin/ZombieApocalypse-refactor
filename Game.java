//declaring Game class

public class Game {

	//declaring Game variables

	public static boolean gameOver = false;

	//Game class has a main method to get other class methods

	public static void main(String[] args) {

		start();

		//while loop to continue getting methods until gameOver == true

		while (gameOver == false) {
			update();
			render();
		}
	}

	//render method to get all of the draw methods from each class to draw the entire game

	public static void render() {
		Scene.draw();
		Door.draw();
		Enemy.draw();
		Player.draw();
		StdDraw.show(100);
	}

	//start method to get all of the start methods from each class to get graphics info

	public static void start() {
		Scene.start();
		Door.start();
		Enemy.start();
		Player.start();
	}

	//update method to get all of the update methods from each class to update movements and compare collision detection

	public static void update() {
		Enemy.update();
		Player.update();
		Door.update();
	}	
}