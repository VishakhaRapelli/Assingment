package CircleSquareTriangle;

public class Square {
	private int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public int calculateArea() {
        int area = sides * sides;
        System.out.println("The area of the square is: " + area);
        return area;
    }

}
