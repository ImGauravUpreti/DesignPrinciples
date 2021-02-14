package shapes;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	private Shape triangle;

	public ShapeMaker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
		this.triangle = new Triangle();
	}

	public void drawCircle() {
		circle.draw();

	}

	public void drawRectangle() {
		rectangle.draw();

	}

	public void drawSquare() {
		square.draw();

	}

	public void drawTriangle() {
		triangle.draw();
	}
}
