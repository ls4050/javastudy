package prob6;

public class RectTriangle extends Shape{
	private Double width;
	private Double height;
	RectTriangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	
	@Override
	double getArea() {
		double area = (width * height)/2;
		return area;
	}

	@Override
	double getPerimeter() {
		return width+height+Math.sqrt(width*width+height*height);
	}
	
}
