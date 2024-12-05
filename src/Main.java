import figures.Line;
import figures.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        Line line = new Line();
        Square square = new Square();
        do {
            System.out.println("------ Figures System ------");
            System.out.println("1. Create Line");
            System.out.println("2. Create Square");
            System.out.println("3. Print Line");
            System.out.println("4. Print Square");
            System.out.println("5. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter Line length: ");
                    int lineLength = scanner.nextInt();
                    line.setLength(lineLength);
                    break;
                case 2:
                    System.out.println("Please enter Square length");
                    int SquareLength = scanner.nextInt();
                    square.setLength(SquareLength);
                    break;
                case 3:
                    line.drawLine();
                    break;
                case 4:
                    square.PrintSquare();
                case 5:
                    System.out.println("------ Exiting System -------");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }while (option != 5);
    }
}