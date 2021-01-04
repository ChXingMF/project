package com.bigdata.task09;

public class Rect extends Shape {
    private int length;
    private int wind;

    public Rect() {
    }

    public Rect(int x, int y, int length, int wind) {
        super(x, y);
        setLength(length);
        setWind(wind);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= length) {
            this.length = length;
        }else {
            System.out.println("length is not reasonable!");
        }
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        if (wind >= 0) {
            this.wind = wind;
        }else {
            System.out.println("wind is not reasonable!");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("length is " + getLength() + " and wind is " + getWind());
    }

    // 自定义静态方法
    //@Override Error: 历史原因、不是真正意义上的重写
    public static void test() {
        System.out.println("printf static method in rect class!");
    }
}
