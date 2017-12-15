
class Shape {
	public int width, height;
	public void Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	int area() {
		return area();
	}
}

class Triangle extends Shape{
	int area() {
		return width*height/2;
	}
}
class Rectangle extends Shape{
	int area() {
		return width*height;
	}
}
class Circle extends Shape{
	int area() {
		return (int)(width/2*height/2*3.14);
	}
}