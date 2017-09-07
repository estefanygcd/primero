
public class TestGeometricObject {
	/** Main method */
	public static void main(String[] args) {
		// Declare and initialize two circle objects
		GeometricObject geoObject1 = new Circle(5);
		GeometricObject geoObject2 = new Circle(15);
		
		// Declare and initialize two rectangle objects
		GeometricObject geoObject3 = new Rectangle(5, 3);
		GeometricObject geoObject4 = new Rectangle(1, 13);

		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

		// Display circle
		displayGeometricObject(geoObject1);

		// Display rectangle
		displayGeometricObject(geoObject2);
		//max of circles
		maxCircle(geoObject1,geoObject2);
		//max of rectangles
		maxRectangle(geoObject3,geoObject4);
	}

	/** A method for comparing the areas of two geometric objects */
	public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

	/** A method for displaying a geometric object */
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
	
	public static void maxCircle(GeometricObject geoObject1, GeometricObject geoObject2){
		int result=geoObject1.compareTo(geoObject2);
		if (result >0)
			System.out.println( "Object 1 is bigger than Object 2");
		else if (result < 0)
			System.out.println("Object 2 is bigger than Object 1");
		else
			System.out.println("Object 1 is equal in size to Object 2");
	}
	public static void maxRectangle(GeometricObject geoObject3, GeometricObject geoObject4){
		int result=geoObject3.compareTo(geoObject4);
		if (result >0)
			System.out.println( "Object 3 is bigger than Object 4");
		else if (result < 0)
			System.out.println("Object 4 is bigger than Object 3");
		else
			System.out.println("Object 3 is equal in size to Object 4");
	}

}
