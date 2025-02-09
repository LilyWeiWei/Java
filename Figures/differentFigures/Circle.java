package Figures.differentFigures;

import Figures.parentClass.Figure;

public class Circle extends Figure {

    private int radius;

    public Circle(int a, int b, int radius) {
        super(a, b);
        this.radius = radius;
    }


    public void getArea() {
        System.out.println("Площадь окружности равна " + (radius * Math.PI));
    }


    public void getPerimeter() {
        System.out.println("Длина окружности равна " + 2 * (radius * Math.PI));
    }
}