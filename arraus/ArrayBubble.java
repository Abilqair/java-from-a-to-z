package arraus;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ArrayBubble{
	
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] values = new int[10];
        int a, b, c;

        int glavniirazmer = values.length;

        for (int i = 0; i < glavniirazmer; i++)
        {
            values[i] = Integer.parseInt(reader.readLine());
        }
        for (a = 1; a < glavniirazmer; a++)
            for (b = glavniirazmer - 1; b >= a; b--) {
                if (values[b - 1] > values[b]) {
                    c = values[b - 1];
                    values[b - 1] = values[b];
                    values[b] = c;
                }
            }
        for (int i = 0; i < glavniirazmer; i++)
            System.out.println(" " + values[i]);
    }
}
