package figury;
/*
Stwórz interfejs Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea
(zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs
Figure. Napisz program, który pobierze od użytkownika:
długość promienia koła,
2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
długość boków prostokąta.
Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl
pole oraz obwód aktualnego obiektu.
 */
import interfejs.Figure;

public class Circle implements Figure {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        double wynik = 2*3.14*r;
        return wynik;
    }

    @Override
    public double getArea() {
        double suma = 3.14*Math.pow(r,2);
        return suma;
    }
}
