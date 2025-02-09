package Figures.differentFigures;

import Figures.parentClass.Figure;

public class Ellipse extends Figure {

    public Ellipse(int a, int b) {
        super(a, b);
    }


    public void getArea() {
        System.out.println("Площадь эллипса равна " + (Math.PI * a * b));
    }


    public void getPerimeter() {
        if (a == b) {
            System.out.println("Периметр эллипса примерно равен " + Math.PI * (a + b));
        } else {
            System.out.println("Периметр эллипса примерно равен " + (Math.PI * Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)))));
        }
    }
}