/**
 * Package that contains the classes of the geometric shapes.
 */

/**
 * The Circle subclass (of Shape).
 */
public class Circle extends Shape{
    private final double centerX;
    private final double centerY;
    private final double radius;

    /**
     * Instantiates the new Circle object when called.
     * @param centerX The x coordinate of the center.
     * @param centerY The y coordinate of the center.
     * @param radius The radius.
     */
    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    /**
     * Checks if a point is contained in the shape.
     *
     * @param point The point.
     * @return If the point is in the shape, true, if not, false.
     */
    @Override
    boolean containsPoint(Point point) {
        double distance = Math.sqrt(Math.pow(point.x - centerX, 2) + Math.pow(point.y - centerY, 2));
        return distance <= radius;
    }
}