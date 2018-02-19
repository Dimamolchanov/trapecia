

public class Trapecia {
    public final Point A;
    public final Point B;
    public final Point C;
    public final Point D;

    private double distAB;
    private double distBC;
    private double distCD;
    private double distAD;
    //private final double perimeter;
    //private final double area;

    Trapecia(Point a, Point b, Point c, Point d){
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        distAB = A.distanceTo(B);
        distBC = B.distanceTo(C);
        distCD = C.distanceTo(D);
        distAD = a.distanceTo(D);

    }

    public  boolean isIsoscelesTrapezoid(Trapecia trapeciaToCheck) {
        return (trapeciaToCheck.A.distanceTo(trapeciaToCheck.B) == trapeciaToCheck.C.distanceTo(trapeciaToCheck.C)
                || trapeciaToCheck.B.distanceTo(trapeciaToCheck.C) == trapeciaToCheck.A.distanceTo(trapeciaToCheck.D));
    }

    public  boolean isIsoscelesTrapezoid() {
        if ((A.distanceTo(B) == C.distanceTo(D)
                || B.distanceTo(C) == A.distanceTo(D))){
            System.out.println(this.getClass().getSimpleName()+" is Isosceles Trapezoid");
            return true;
        }
        else{
            System.out.println(this.getClass().getSimpleName()+" is not Isosceles Trapezoid");
            return false;
        }
    }

    public double calculatePerimeter() {
        return (distAB + distBC + distCD + distAD);
    }
    public double calculateArea() {
        double a,b,c;

        if (distAB == distCD) {
            c = distAB;
            if (distBC < distAD) {
                b = distAD;
                a = distBC;
            } else {
                a = distAD;
                b = distBC;
            }
        } else {
            c = distBC;
            if (distAB < distCD) {
                b = distCD;
                a = distAB;
            } else {
                a = distCD;
                b = distAB;
            }
        }

        return (a + b) / 2 * Math.sqrt(c * c - 1/4 * (b - a) * (b - a));
    }

}
