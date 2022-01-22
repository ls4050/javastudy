package prob6;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}
	@Override
	double getArea() {
		double area = (width * height);
		return area;
	}
	@Override
	double getPerimeter() {
		return (width+height)*2;
	}
}
