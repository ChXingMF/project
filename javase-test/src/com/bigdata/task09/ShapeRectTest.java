package com.bigdata.task09;

public class ShapeRectTest {
    public static void main(String[] args) {
        // 1.
        Shape s1 = new Shape(1,2);
        // 当Rect类中没有重写show方法时，下面调用Shape类中的show方法
        // 当Rect类中重写show方法后，下面调用Shape类中的show方法
        s1.show();
        System.out.println("-----------------------------------------------");

        Rect r1 = new Rect(3, 4, 5, 6);
        // 当Rect类中没有重写show方法时，下面调用Shape类中的show方法
        // 当Rect类中重写show方法后，下面调用Rect类中的show方法
        r1.show();

        System.out.println("-----------------------------------------------");
        // 相当于从Rect类型到Shape类型的转换  也就是子类到父类的转换   小到大的转换  自动类型转换
        Shape sr = new Rect(7, 8, 9,10);    // 披着羊皮的狼
        // 当Rect类中没有重写show方法时，下面调用Shape类中的show方法
        // 当Rect类中重写show方法后，下面的代码在编译阶段调用Shape类的方法，在运行阶段调用Rect类中的show方法
        sr.show();

        // 4.测试Shape类型的引用能否直接调用父类和子类独有的方法呢？？？
        int ia = sr.getX();
        System.out.println("getX is " + ia);
        //sr.getLen();  error  Shape类中找不到getLen方法，也就是还在Shape类中查找

        // 调用静态方法
        sr.test(); // 提示：不建议使用引用.的方式访问
        Shape.test(); // 推荐使用类名.的方式访问

        System.out.println("-----------------------------------------------");
        // 5.使用父类类型的引用调用子类独有方法的方式
        // 相当于从Shape类型到Rect类型的转换，也就是父类到子类的转换  大到小的转换   强制类型转换
        int ib = ((Rect) sr).getLength();
        System.out.println("getLength is " + ib);

        // 希望将Shape类型转换为String类型  强制类型转换要求必须拥有父子类关系
        //String str1 = (String)sr;  Error
        // 希望将Shape类型强制转换为Circle类型，下面没有报错
        //Circle c1 = (Circle)sr; // 编译ok，但运行阶段发生  ClassCastException类型转换异常

        // 在强制类型转换之前应该使用instanceof进行类型的判断
        // 判断sr指向堆区内存中的对象是否为Circle类型，若是则返回true，否则返回false
        if (sr instanceof Circle) {
            System.out.println("variable sr is class Circle.");
            Circle c1 = (Circle)sr;
        }else {
            System.out.println("variable sr is not class Circle, you can not cast sr to class Circle!");
        }
    }
}
