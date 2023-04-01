package CircleSquareTriangle;

public class Triangle {
	private int sides;

    public Triangle(int sides) {
        this.sides = sides;
    }

    public double calculateArea() {
        double area = 0.433 * sides * sides;
        System.out.println("The area of the triangle is: " + area);
        return area;
    }

}
