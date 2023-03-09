package figury;

import interfejs.Figure;

public class Triangle implements Figure {
    double a;
    double b;


    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }



    double h;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    @Override
    public double getPerimeter() {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        return a + b + Math.sqrt(c);
    }
    @Override
    public double getArea() {
        double P = (a*b)/2;
        return P;
    }
}
