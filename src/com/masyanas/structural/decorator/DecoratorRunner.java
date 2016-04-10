package com.masyanas.structural.decorator;

public class DecoratorRunner {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape labeledCircle = new LabelShapeDecorator(new Circle());

        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape labeledRectangle = new LabelShapeDecorator(new Rectangle());

        System.out.println("A circle with a normal border");
        circle.draw();

        System.out.println("\nA circle with a red border");
        redCircle.draw();

        System.out.println("\nA circle with a label");
        labeledCircle.draw();

        System.out.println("\nA rectangle with a normal border");
        rectangle.draw();

        System.out.println("\nA rectangle with a red border");
        redRectangle.draw();

        System.out.println("\nA rectangle with a label");
        labeledRectangle.draw();

    }

}
