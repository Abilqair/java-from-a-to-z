package arraus;
public class TwoDimension {
    public static void main(String[] args) {
        int[][] values = {
                {1,-9,5},
                {4,2,3},
                {7,-5,6}
                 };      
        int n = values.length;
        for(int i = n-1;i >=0;i--){
            for(int j = 0;j < n;j++){
                System.out.print(values[j][i] + "\t");
           }
           System.out.println("");
        }
        }
}