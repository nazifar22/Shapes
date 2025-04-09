/**
 * Package that contains the classes of the geometric shapes.
 */

/**
 * The Hexagon subclass (of Shape).
 */
public class Hexagon extends Shape{
    private final double centerX;
    private final double centerY;
    private final double sideLength;

    /**
     * Instantiates the new Hexagon object when called.
     * @param centerX The x coordinate of the center.
     * @param centerY The y coordinate of the center.
     * @param sideLength The length.
     */
    public Hexagon(double centerX, double centerY, double sideLength) {
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
        double halfSide = sideLength / 2.0;
        double apothem = halfSide * Math.sqrt(3) / 2.0;

        double x = point.x - centerX;
        double y = point.y - centerY;

        if (Math.abs(x) <= halfSide) {
            return Math.abs(y) <= apothem;
        } else {
            double dx = Math.abs(x) - halfSide;
            double dy = Math.abs(y) - apothem;
            return dx + dy * Math.sqrt(3) <= apothem;
        }
    }
}
