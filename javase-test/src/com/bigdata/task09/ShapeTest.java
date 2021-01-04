package com.bigdata.task09;

public class ShapeTest {

    // 自定义成员方法实现将参数指定矩形对象特征打印出来的行为，也就是绘制图形的行为
//    public static  void draw(Rect rt) {
//        rt.show();
//    }

    // 自定义成员方法实现将参数指定圆形对象特征打印出来的行为
//    public static void draw(Circle c) {
//        c.show();
//    }

    // 自定义成员方法实现既能打印矩形对象又能打印圆形对象的特征，对象由参数传入  子类 is a 父类
    public  static void draw(Shape s) {
        s.show();
    }
    public static void main(String[] args) {
        ShapeTest.draw(new Rect(1, 2, 3,4));
        ShapeTest.draw(new Circle(5, 6, 7));
    }
}
