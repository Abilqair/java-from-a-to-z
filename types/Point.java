package types;
/** Класс расчитывает точку в системе координат
* @author B.W.
*@since 23.05.16
* @version 1.2
*/
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
//Метод расчитывает точку в системе координат по x и y
    public double distanceTo(Point point) {

        double n = this.x - point.x;
        double m = this.y - point.y;
        return Math.sqrt(n * n + m * m);
    }
}
