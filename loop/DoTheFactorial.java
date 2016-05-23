package loop;
/** Класс вычисляет факториал
* @author B.W.
*@since 23.05.16
*/
public class DoTheFactorial {
    private int n;

    public DoTheFactorial(int n){
        this.n = n;
    }
    public long calculate(){
        if (n > 0){
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
		  
            System.out.println("факториал равен = " + fact);
		  
        }
        else if (n == 0)
        {
            System.out.println("факториал равен = 1");
        }
        else if(n < 0){
            System.out.println("введенное число отрицательное");
        }
        return n;
    }

    public static void main(String[] args) {
        DoTheFactorial crew = new DoTheFactorial(6);
        crew.calculate();
    }
}
