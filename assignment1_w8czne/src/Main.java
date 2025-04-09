/**
 * Package that contains the classes of the geometric shapes.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ShapeCollection collection = new ShapeCollection();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        try {
            collection.loadShapesFromFile(fileName);
        } catch (FileNotFoundException e) {
            System.err.println("File not found"); return;
        }
          catch (IOException e) {
            System.err.println(e.getMessage()); return;
        }
          catch (NumberFormatException e) {
            System.err.println("Error parsing a numeric value"); return;
        }
        
        System.out.print("Enter x coordinate of the point: ");
        double xCoordinate = scanner.nextDouble();
        System.out.print("Enter y coordinate of the point: ");
        double yCoordinate = scanner.nextDouble();
          
        Point point = new Point(xCoordinate, yCoordinate);
        try{
        int count = collection.countShapesContainingPoint(point);
        System.out.println("Number of shapes containing the point: " + count);}
        catch (NullPointerException e) {
            System.err.println("NullPointerException" + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred" + e.getMessage());
        }
        finally {
            scanner.close();
        }
        
        collection.shapeName(point);

        //System.out.println("\nWhite Box Tests Below");

//        // Test 1: Point inside triangle
//        Triangle triangle = new Triangle(0, 0, 6);
//        Point point1 = new Point(0, 0);
//        System.out.println("Point inside Triangle: " + (triangle.containsPoint(point1) ? "Passed" : "Failed"));
//
//        // Test 2: Point inside square
//        Square square = new Square(0, 0, 4);
//        Point point2 = new Point(1, 1);
//        System.out.println("Point inside Square: " + (square.containsPoint(point2) ? "Passed" : "Failed"));
//
//        // Test 3: Point inside circle
//        Circle circle = new Circle(0, 0, 5);
//        Point point3 = new Point(2, 2);
//        System.out.println("Point inside Circle: " + (circle.containsPoint(point3) ? "Passed" : "Failed"));
//
//        // Test 4: Point inside hexagon
//        Hexagon hexagon = new Hexagon(0, 0, 4);
//        Point point4 = new Point(1, 1);
//        System.out.println("Point inside Hexagon: " + (hexagon.containsPoint(point4) ? "Passed" : "Failed"));

    }
}
