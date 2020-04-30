
public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height){
		setWidth(width);
		setHeight(height);
	}

	public Rectangle(){
		setWidth(0.1);
		setHeight(0.1);
	}

	public Rectangle(double width){
		setWidth(width);
		this.height = 10;
	}

	public Rectangle(double height){
		setHeight(height);
		this.width = 10;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width >= 0.1 && width <= 20)
			this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height >= 0.1 && height <= 20)
			this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}
