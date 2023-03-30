package Assignment;

public class Square {
	 private double side;
	    public Square(double side) {
	        this.side = side;
	    }
	    public double calculateArea() {
	        return side * side;
	    }

	    public double calculatePerimeter() {
	        return 4 * side;
	    }
	
	public class Main {
	    public static void main(String[] args) {
	        Square square = new Square(5);
	        double area = square.calculateArea();
	        double perimeter = square.calculatePerimeter();
	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);
	    }
	}

}
