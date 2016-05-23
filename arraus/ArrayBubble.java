package arraus;
/** Класс сортирует данные массива методом пузырька
* @author B.W.
*@since 23.05.16
*/
public class ArrayBubble{
	private int[] values;
	
public ArrayBubble(int[] values){
	this.values = values;
}
		
public void rotate() {
        int a, b, c;
	int glavniirazmer = values.length;
		
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
		
public static void main(String[] args) {
new ArrayBubble(new int[] {1, -9, 5,4, 2, 3,7, -5, 6}).rotate();
}
}
