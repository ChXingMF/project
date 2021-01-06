package com.bigdata.task09;

// 接口只能继承接口，不能继承类
public interface Hunter extends Runner {
    public abstract void hunt();

    // 增加一个抽象方法
    //public abstract void show1();

    // 将两个默认方法中重复的代码可以提取出来打包成一个方法在下面的两个方法中分别调用即可
    private void show() {
        System.out.println("as far as possible to reduce duplication of code.");
    }
    // 增加非抽象方法
    public default void show1() {
        show();
        //System.out.println("as far as possible to reduce duplication of code.");
        System.out.println("in show1:just default function in interface, The implementation class can choose to override or not.");
    }

    public default void show2() {
        show();
        //System.out.println("as far as possible to reduce duplication of code.");
        System.out.println("in show2:just default function in interface, The implementation class can choose to override or not.");
    }
    // 增加静态方法 隶属于类层级，也就是接口层级
    public static void test() {
        System.out.println("static test method in Hunter interface...");
    }
}
