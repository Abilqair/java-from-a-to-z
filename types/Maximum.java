
public class Maximum {

    public Point a;
    public Point b;
    public Point c;


    double maximumm;


    public double max(){

        double r = a.distanceTo(b);
        double s = b.distanceTo(c);
        double h = a.distanceTo(c);



        if (r > s && r > h)
        {
            maximumm = r;


        }
        else if(s > r && s > h){
            maximumm = s;
        }
        else if (h > s && h > r){
            maximumm = h;
        }




return maximumm;
    }
}
