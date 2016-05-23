
package types;
/** Класс определяет максимальную длину треугольника
* @author B.W.
*@since 23.05.16
*/ 
public class Maximum {

    public Point a;
    public Point b;
    public Point c;

/**Определение максимальной длины сторон
*@param first первый аргумент
*@param second второй аргумент
*@return результат
*/
    public double max(double first, double second){


        max(a.distanceTo(b),max(a.distanceTo(c),b.distanceTo(c)));
        return (first > second )? first : second;
}
