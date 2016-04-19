public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point point) {

        double n = this.x - point.x;
        double m = this.y - point.y;
        return Math.sqrt(n * n + m * m);




    }
}