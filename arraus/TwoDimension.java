package arraus;
/** Класс поворачивает двумерный массив на 90 градусов
* @author B.W.
*@since 23.05.16
*/
public class TwoDimension {
    private final int[][] values;

public TwoDimension(final int[][] values) {
    this.values = values;
}

public void rotate() {
    int n =this.values.length;
    for(int i = n-1; i >= 0;i--){
    for(int j = 0; j < n;j++){
    System.out.print(this.values[j][i] + "\t");
}
    System.out.println("");
}
}

public static void main(String[] args) {
    new TwoDimension(new int[][] {{1, -9, 5},{4, 2, 3},{7, -5, 6}}).rotate();
}
}
