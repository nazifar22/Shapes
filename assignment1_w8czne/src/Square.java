/**
 * Package that contains the classes of the geometric shapes.
 */

/**
 * The Square subclass (of Shape).
 */
public class Square extends Shape{
    private final double centerX;
    private final double centerY;
    private final double sideLength;

    /**
     * Instantiates the new Square object when called.
     * @param centerX The x coordinate of the center.
     * @param centerY The y coordinate of the center.
     * @param sideLength The length.
     */
    public Square(double centerX, double centerY, double sideLength) {
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

        double halfSideLength = sideLength / 2.0;

        double minX = centerX - halfSideLength;
        double maxX = centerX + halfSideLength;
        double minY = centerY - halfSideLength;
        double maxY = centerY + halfSideLength;

        return point.x >= minX && point.x <= maxX && point.y >= minY && point.y <= maxY;
    }
}