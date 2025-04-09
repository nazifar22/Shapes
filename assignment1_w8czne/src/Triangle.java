/**
 * Package that contains the classes of the geometric shapes.
 */

/**
 * The Triangle subclass (of Shape).
 */
public class Triangle extends Shape {
    private final double centerX;
    private final double centerY;
    private final double sideLength;

    /**
     * Instantiates the new Hexagon object when called.
     * @param centerX The x coordinate of the center.
     * @param centerY The y coordinate of the center.
     * @param sideLength The length.
     */
    public Triangle(double centerX, double centerY, double sideLength) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.sideLength = sideLength;
    }

    /**
     * Checks if a point is contained in the shape.
     *
     * @param point The point.
     * @return If the point is in the shape, true, if not, false.
     */
    @Override
    boolean containsPoint(Point point) {
        //half of height
        double halfHeight = (Math.sqrt(3) / 2.0) * sideLength;

        //coordinates of three vertices
        double x1 = centerX - sideLength / 2.0;
        double y1 = centerY + halfHeight;
        double x2 = centerX + sideLength / 2.0;
        double y2 = centerY + halfHeight;
        double x3 = centerX;
        double y3 = centerY - halfHeight;

        //areas of sub-triangles formed by the point and the vertices
        double area = 0.5 * Math.abs(
            x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)
        );

        double area1 = 0.5 * Math.abs(
            point.x * (y1 - y2) + x1 * (y2 - point.y) + x2 * (point.y - y1)
        );

        double area2 = 0.5 * Math.abs(
            x1 * (point.y - y3) + point.x * (y3 - y1) + x3 * (y1 - point.y)
        );

        double area3 = 0.5 * Math.abs(
            x3 * (point.y - y2) + x2 * (y3 - point.y) + point.x * (y2 - y3)
        );
        
        //comparing with epsilon(ε= 1e-6)
        return Math.abs(area1 + area2 + area3 - area) < 1e-6;
    }
}