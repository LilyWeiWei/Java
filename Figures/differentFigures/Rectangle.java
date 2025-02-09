package Figures.differentFigures;

import Figures.parentClass.Figure;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super(a, b);
    }


    public void getArea() {
        System.out.println("Площадь прямоугольника равна " + (a * b));
    }


    public void getPerimeter() {
        System.out.println("Периметр прямоугольника равен " + (a + b) * 2);
    }
}
