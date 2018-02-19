public class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p) {
        if (this == p) {
            return 0;
        } else {
            return Math.sqrt(sqr(this.x - p.x) + sqr(this.y - p.y));
        }
    }

    private double sqr(double arg) {
        return arg * arg;
    }
}
