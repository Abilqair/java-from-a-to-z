package loop;
/** Класс вычисляет значение функции y = a * x ^ 2 + b * x + c
* @author B.W.
*@since 23.05.16
*/
public class CubeFunction {
        private int a;
        private int b;
        private int c;

    public CubeFunction(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
/**вычисление функции
*@param х первый аргумент
*@return результат
*/
    float calculate(int x) {
            int y = a * x ^ 2 + b * x + c;
            System.out.println(y);
        return x;
    }
    public static void main(String[] args) {
        CubeFunction giveStats = new CubeFunction(1, 2, 3);
        giveStats.calculate(1);
        giveStats.calculate(2);
    }
}
