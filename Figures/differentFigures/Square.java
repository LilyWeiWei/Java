package Figures.differentFigures;

import Figures.parentClass.Figure;

public class Square extends Figure {

    public Square(int a, int b) {
        super(a, b);
    }


    public void getArea() {
        System.out.println("Площадь квадрата равна " + (a * a));
    }


    public void getPerimeter() {
        System.out.println("Периметр квадрата равен " + (a * 4));
    }
}

