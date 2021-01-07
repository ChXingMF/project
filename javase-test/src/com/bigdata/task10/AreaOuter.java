package com.bigdata.task10;

/**
 * 编程实现局部内部类的定义和使用
 */
public class AreaOuter {
    private int cnt = 1;

    public void show() {
        // 定义一个局部变量进行测试，从Java8开始默认理解为final关键字修饰的变量
        // 虽然可以省略final关键字，但建议还是加上
        final int ic = 4;

        // 定义局部内部类，只在当前方法体的内部好使    局部变量（ic）拷贝一份到内部类中使用
        class AreaInner {
            private int ia = 2;

            public AreaInner() {
                System.out.println("construct in AreaInner class.");
            }

            public void test () {
                System.out.println("ia is " + ia);
                System.out.println("cnt is " + cnt);
                System.out.println("ic is " + ic);
            }
        }

        // 声明局部内部类的引用指向局部内部类的对象
        AreaInner ai = new AreaInner();
        ai.test();
    }
}
