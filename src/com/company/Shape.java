package com.company;

public class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }
    public void printShapeDetails(){
            System.out.println("The shape's color is " + color + " and its is " + filled + "that it is filled.");
        }

    }

