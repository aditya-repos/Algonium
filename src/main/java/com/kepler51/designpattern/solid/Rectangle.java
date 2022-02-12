package com.kepler51.designpattern.solid;

public class Rectangle {

    int height;
    int width;
    public int sample = 4;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int computeArea () {
        return this.height * this.width;
    }

    public int getSample() {
        return this.sample + 4;
    }
}
