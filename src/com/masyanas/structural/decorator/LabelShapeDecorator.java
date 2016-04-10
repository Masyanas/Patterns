package com.masyanas.structural.decorator;

public class LabelShapeDecorator extends ShapeDecorator {

    public LabelShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        drawLabel(decoratedShape);
    }

    private void drawLabel(Shape decoratedShape) {
        System.out.println("Draw a label");
    }

}