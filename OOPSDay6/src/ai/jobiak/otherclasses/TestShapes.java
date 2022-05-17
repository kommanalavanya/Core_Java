package ai.jobiak.otherclasses;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cannot be done Shape s=new Shape();
		Shape sRef;
		sRef=new Circle(12.5);
		System.out.println("Circle");
		System.out.println();
		System.out.println("The area of circle is "+sRef.area());
		System.out.println("The Perimeter of circle is "+sRef.perimeter());
		System.out.println();
		sRef=new Cube(12,13,14);
		System.out.println("Cube");
		System.out.println();
		System.out.println("The area of cube is "+sRef.area());
		System.out.println("The volume of cube is "+sRef.volume());
		System.out.println("The total surface area of the cube is "+sRef.totalSurfaceArea());
		sRef=new Cuboid(10,13,14);
		System.out.println();
		System.out.println("Cuboid");
		System.out.println();
		System.out.println("The area of cuboid is "+sRef.area());
		System.out.println("The volume of cuboid is "+sRef.volume());
		System.out.println("The total surface area of the cuboid is "+sRef.totalSurfaceArea());
		System.out.println();
		sRef=new Cylinder(5,10);
		System.out.println("Cylinder");
		System.out.println();
		System.out.println("The area of cuboid is "+sRef.area());
		System.out.println("The volume of cuboid is "+sRef.volume());
		System.out.println("The total surface area of the cuboid is "+sRef.totalSurfaceArea());
		System.out.println();
		sRef=new Hexagon(4.1);
		System.out.println("Hexagon");
		System.out.println();
		System.out.println("The area of Hexagon is "+sRef.area());
		System.out.println("The Perimeter of Hexagon is "+sRef.perimeter());
		System.out.println();
		sRef=new Parallelogram(4,5);
		System.out.println("Parallelogram");
		System.out.println();
		System.out.println("The area of Parallelogram is "+sRef.area());
		System.out.println();
		sRef=new Parallelogram(10,5);
		System.out.println("Pentagon");
		System.out.println();
		System.out.println("The area of pentagon is "+sRef.area());
		System.out.println();
		sRef=new Rectangle(10,25);
		System.out.println("Rectangle");
		System.out.println();
		System.out.println("The area of Rectangle is "+sRef.area());
		System.out.println();
		sRef=new Rhombus(6,8);
		System.out.println("Rhombus");
		System.out.println();
		System.out.println("The area of Rhombus is "+sRef.area());
		System.out.println();
		sRef=new Sphere(9);
		System.out.println("Sphere");
		System.out.println();
		System.out.println("The area of Sphere is "+sRef.area());
		System.out.println("The volume of sphere is "+sRef.volume());
		System.out.println();
		sRef=new Square(5);
		System.out.println("Square");
		System.out.println();
		System.out.println("The area of Square is "+sRef.area());
		System.out.println("The Perimeter of Square is "+sRef.perimeter());
		System.out.println();
		sRef=new Trapezium(4,6,9);
		System.out.println("Trapezium");
		System.out.println();
		System.out.println("The area of Trapezium is "+sRef.area());
		System.out.println();
		sRef=new Triangle(4,6);
		System.out.println("Triangle");
		System.out.println();
		System.out.println("The area of Triangle is "+sRef.area());
		
	}

}
