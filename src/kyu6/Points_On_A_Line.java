package kyu6;

public class Points_On_A_Line {

    public static void main(String[] args) {
        System.out.println(Points_On_A_Line.middle_point(-1,0,2, -2,4,-1, -3,8,-4));
    }


    public static int middle_point(double x1, double y1, double z1,
                                   double x2, double y2, double z2,
                                   double x3, double y3, double z3)
    {
        int a = (int) Distance(x1,y1,z1,x2,y2,z2);
        int b = (int) Distance(x1,y1,z1,x3,y3,z3);
        int c = (int) Distance(x2,y2,z2,x3,y3,z3);
        if(a > b && a > c){ return 3;}
        else if (b >= a && b >= c){ return 2;}
        else {return 1;}

    }
    public static double Distance(double a1, double b1, double c1,
                               double a2, double b2, double c2)
    {
        double distance;
        return distance= Math.sqrt(Math.abs((Math.pow((a2-a1),2) + Math.pow((b2-b1),2) + Math.pow((c2-c1),2))));
    }
}
