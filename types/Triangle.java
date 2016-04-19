public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double area() {


            double r = a.distanceTo(b);
            double s = b.distanceTo(c);
            double h = a.distanceTo(c);
            double p = (r + s + h) / 2;
            return Math.sqrt(p * (p - r ) * (p - s) * (p - h));




    }

}