/**
 * Created by Дима on 21.12.2015.
 */
public class Area {

    public static int triangle (int a, int b){
        int area = (a * b) / 2;
        return area;
    }
    public static int rectangle (int a, int b){
        int area = a * b;
        return area;
    }
    public static double circle (int a){
        double area = a * a * 3.14;
        return area;
    }
}
