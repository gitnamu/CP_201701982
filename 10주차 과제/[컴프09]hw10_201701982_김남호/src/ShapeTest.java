
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Rectangle();
		shape[2] = new Circle();
		
		
		 for(int i=0;i<shape.length;i++) {
			 shape[i].Shape(10, 10);
			 System.out.println(shape[i].area());
		 }
	}
}