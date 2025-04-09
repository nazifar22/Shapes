/**
 * Package that contains the classes of the geometric shapes.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores the collection of different shapes.
 */
public class ShapeCollection {
    private final List<Shape> shapes = new ArrayList<>();

    /**
     * Adds shape to the List.
     * @param shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Loads shapes from the file.
     * @param filePath The location where the file is located.
     * @throws IOException It will be thrown if there is an error when reading the file.
     */
    public void loadShapesFromFile(String filePath) throws IOException {
        BufferedReader reader0 = new BufferedReader(new FileReader(filePath));
        if(reader0.readLine() == null) throw new IOException("Empty file.");
        reader0.close();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String firstLine = reader.readLine();
        int expectedShapes = Integer.parseInt(firstLine);
        int actualShapes = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 4) {
                String shapeType = parts[0].trim();
                double x = Double.parseDouble(parts[1].trim());
                double y = Double.parseDouble(parts[2].trim());
                double len = Double.parseDouble(parts[3].trim());
                if (len<0) throw new NumberFormatException();

                switch (shapeType) {
                    case "C":
                        shapes.add(new Circle(x, y, len));
                        break;
                    case "T":
          
                        shapes.add(new Triangle(x, y, len));
                        break;
                    case "S":
                        
                        shapes.add(new Square(x, y, len));
                        break;
                    case "H":
                        shapes.add(new Hexagon(x, y, len));
                        break;
                } actualShapes++;
            }
            else throw new IOException("Does not contain proper values.");
        }
        reader.close();
        if(actualShapes != expectedShapes) { throw new IOException("Mismatch between expected and atcual number"); }

    }

    /**
     * Counts the number of shapes containing the point.
     * @param point The point that the program will check.
     * @return The count of shapes containing the point.
     */
    public int countShapesContainingPoint(Point point) {
        int count = 0;
        for (Shape shape : shapes) {
            if (shape.containsPoint(point)) {
                count++;
            }
        }
        return count;
    }
    
    public void shapeName(Point point) {
        int count = 0;
        for (Shape shape : shapes) {
            if (shape.containsPoint(point)) {
                System.out.println(shape);
            }
        }
        //return count;
    }
}