package com.bigdata.task10;

/**
 * 编程实现局部内部类的定义和使用
 */
public class AreaOuter {
    private int cnt = 1;

    public void show() {
        // 定义局部内部类，只在当前方法体的内部好使    拷贝一份
        class AreaInner {
            private int ia = 2;

            public AreaInner() {
                System.out.println("construct in AreaInner class.");
            }

            public void test () {
                System.out.println("ia is " + ia);
                System.out.println("cnt is " + cnt);
            }
        }

        // 声明局部内部类的引用指向局部内部类的对象
        AreaInner ai = new AreaInner();
        ai.test();
    }
}
