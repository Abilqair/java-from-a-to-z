import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoTheFactorial {
    public static void main(String[] args) throws Exception {
        BufferedReader dance = new BufferedReader(new InputStreamReader(System.in));
        String n = dance.readLine();

        int f = Integer.parseInt(n);
        if(f > 0) {
            int fact = 1;
            for (int i = 1; i <= f; i++) {
                fact = fact * i;

            }
            System.out.println("factorial raven = " + fact);
        }
        else if (f == 0)
        {
            System.out.println("factorial raven = 1");
        }else if(f < 0)
            System.out.println("vvedennoe chislo otricatelnoe");


    }
}
//proged by B.W.