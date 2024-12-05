package figures;

public class Square {
    private int length;

    public Square() {}

    public Square(int length) {
        this.length = length;
    }

    public void drawSquare() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public int calculatePerimeter() {
        return 4 * length;
    }

    public int calculateArea() {
        return length * length;
    }

    public void PrintSquare() {
        System.out.println("Drawing a Square with length: " + length + "\n");
        drawSquare();
        System.out.println("Perimeter: " + length + " * 4 = " + calculatePerimeter());
        System.out.println("Area: " + length + " * " + length + " = " + calculateArea());
    }

    public int CalculatePerimeter() {
        return length * 4;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
