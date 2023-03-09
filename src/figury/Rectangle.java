package figury;

import interfejs.Figure;

public class Rectangle implements Figure {
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

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
        double obwp=a+a+b+b;
        return obwp;
    }

    @Override
    public double getArea() {
        double PW = a * b;
        return PW;
    }
}
