This Java program is designed to analyze geometric shapes and determine how many of them contain a specific point on a 2D plane. The shapes—circle, regular triangle, square, and regular hexagon—are all represented by a center point and a side length or radius. The program reads shape data from a text file where the first line indicates the number of shapes, followed by lines specifying each shape's type, center coordinates, and size. Each shape is represented by a subclass derived from a common abstract superclass Shape, ensuring consistent handling. After loading the shapes, the program prompts the user to input the coordinates of a point and calculates how many of the shapes contain that point using each shape’s containsPoint() method. The results are then displayed, showing the count of shapes that contain the point and optionally their types.

Prerequisites:
Java Development Kit (JDK) installed.
Input file containing shapes (in the specified format).

First line: Number of shapes (e.g., 4)
Each following line:
Shape type: C = Circle, T = Triangle, S = Square, H = Hexagon
Center X, Center Y, Radius/Side Length

How to Run
Compile the code
  javac *.java
Run the program
  java Main
Enter the file name when prompted (e.g., shapes.txt).
Enter the x and y coordinates of the point to test (e.g., 1 and 1).
The program will display the number of shapes that contain the point.
