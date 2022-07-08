//declaring Scene class

public class Scene {

	//declaring Scene variables

	private static String image;
	private static int width = 800;
	private static int height = 600;

	//start method with Scene graphics info

	public static void start() {
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0.0, width);
		StdDraw.setYscale(height, 0.0);
		image = "assets/house.png";
	}

	//draw method to draw Scene to the game area

	public static void draw() {
		StdDraw.picture(width / 2, height / 2, image);
	}



	//public static int getWidth() {
	//	return width;
	//}

	//public static int getHeight() {
	//	return height;
	//}
}