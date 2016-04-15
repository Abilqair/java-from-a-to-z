package frag;


/**
 * Created by BAtmAN on 15.04.16.
 */


public class Calculator{
    double result;
    double result2;
    double result3;
    double result4;



    public void add(double first, double second){
        this.result = first + second;



    }

    public void substract(double first, double second){
        this.result2 = first - second;
    }

    public void div(double first, double second){
        this.result3 = first / second;
    }

    public void multiple(double first, double second){
        this.result4 = first * second;


    }

    public void showCalc(){
        System.out.println("Equals :" + result);
        System.out.println("Equals :" + result2);
        System.out.println("Equals :" + result3);
        System.out.println("Equals :" + result4);

    }
}
