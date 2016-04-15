package frag;

/**
 * Created by BAtmAN on 11.03.16.
 */


public class Calculator{
    double result;


    public void add(double first, double second){
        this.result = first + second;


    }

    public void substract(double first, double second){
        this.result = first - second;
    }

    public void div(double first, double second){
        this.result = first / second;
    }

    public void multiple(double first, double second){
        this.result = first * second;


    }

    public void showCalc(){
        System.out.println("Equals :" + result);
    }
}