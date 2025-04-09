/**
 * Package that contains the classes of the geometric shapes.
 */
/**
 * Abstract class. This is the superclass (of the other subclass shapes).
 */
abstract class Shape {
    /**
     * Checks if a point is contained in the shape.
     *
     * @param point The point.
     * @return If the point is in the shape, true, if not, false.
     */
    abstract boolean containsPoint(Point point);
}