package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    public Cuboid(double width, double length, double height){
        super(width, length);
        if (length <0) {
            this.height = 0;
        } else {
            this.height = height;
        }


    }
}
