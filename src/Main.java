import figury.Circle;
import figury.Rectangle;
import figury.Triangle;
import interfejs.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner scanner = new Scanner(System.in);
        List<Figure> figura = new ArrayList<>();
        double dlr,dlt1,dlt2,dlp1,dlp2;


        System.out.println("wpisz dlugosc promienia kola");
        dlr=scanner.nextDouble();
        System.out.println("wpisz  1 dlugosc bokow trojkata prostokatnego");
        dlt1=scanner.nextDouble();
        System.out.println("wpisz  2 dlugosc bokow trojkata prostokatnego");
        dlt2=scanner.nextDouble();
        System.out.println("wpisz 1 dlugosc bokow prostokata");
        dlp1=scanner.nextDouble();
        System.out.println("wpisz 2 dlugosc bokow prostokata");
        dlp2=scanner.nextDouble();

        figura.add(new Circle(dlr));
        figura.add(new Triangle(dlt1,dlt2));
        figura.add(new Rectangle(dlp1,dlp2));



        for(Figure f: figura){
            System.out.println(f.getArea());
            System.out.println(f.getPerimeter());
        }




    }
}