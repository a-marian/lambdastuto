package ar.com.lambdastuto.exercises;

import java.awt.*;

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle(){
        origin = new Point(0,0);
    }

    public Rectangle(Point point){
        origin = point;
    }

    public Rectangle(int w, int h){
        this(new Point(0, 0), w, h);
    }

    public Rectangle(Point point, int w, int h) {
        origin = point;
        width = w;
        height = h;
    }

    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    public int area(){
        return  width * height;
    }
}
