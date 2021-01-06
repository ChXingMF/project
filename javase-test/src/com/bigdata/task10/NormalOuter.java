package com.bigdata.task10;

/**
 * 编程实现普通内部类的定义和使用       -  文档注释
 */
public class NormalOuter {
    private int cnt = 1;

    // 定义普通内部类，隶属于外部类的成员，并且是对象层级
    /*private*/ public /*final*/  class NormalInner {
        private int ia = 2;
        private int cnt = 3;

        public NormalInner() {
            System.out.println("construct method in normal inner class.");
        }

        public void show() {
            System.out.println("normal method in normal inner class. And outer class cnt is " + cnt);
            System.out.println("normal method in normal inner class. And inner class ia is " + ia);
        }

        public void show2(int cnt) {
            System.out.println("formal parameter cnt is " + cnt);       // 局部优先原则
            System.out.println("inner class cnt is " + this.cnt);       //
            System.out.println("outer class cnt is " + NormalOuter.this.cnt);       //

        }
    }
}
