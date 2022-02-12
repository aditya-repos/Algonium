package com.kepler51.designpattern.solid;

public class Square extends Rectangle{

    public int sample  = 5;

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSample() {
        return this.sample + 5;
    }
}
