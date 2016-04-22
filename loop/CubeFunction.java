public class CubeFunction {
    public static void main(String[] args) {
        CubeFunction giveStats = new CubeFunction(1, 2, 3);
        giveStats.calculate(2);
    }

        int a;
        int b;
        int c;

    public CubeFunction(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }



    float calculate(int x) {
        for(x = 1; x <= 2; x++) {
            int y = a * x ^ 2 + b * x + c;


            System.out.println(y);
        }


        return x;
    }


}