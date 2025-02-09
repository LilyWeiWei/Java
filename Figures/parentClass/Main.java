package Figures.parentClass;

import Figures.differentFigures.Circle;
import Figures.differentFigures.Ellipse;
import Figures.differentFigures.Rectangle;
import Figures.differentFigures.Square;

public class Main {
    public static void main(String[] args) {

        Figure figure;
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(3, 5,4);
        Square square = new Square(6, 6);
        Ellipse ellipse = new Ellipse(2, 5);

        Figure[] figures = {rectangle, circle, square, ellipse};


        for (int i = 0; i < figures.length; i++) {
            figure = figures[i];
            figure.getArea();
        }

        for (int i = 0; i < figures.length; i++) {
            figure = figures[i];
            figure.getPerimeter();
        }
    }
}
