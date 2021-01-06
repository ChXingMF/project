package com.bigdata.task10;

/**
 * 实现静态内部类的定义和使用
 */
public class StaticOuter  {
    private int cnt = 1;
    private static int snt = 2;

    /**
     * 定义静态内部类   有static关键字修饰隶属于类层级
     */
    public static class StaticInner{
        private int ia = 3;
        public StaticInner() {
            System.out.println("static inner class construct method.");
        }

        public void show() {
            System.out.println("ia is " + ia);
            System.out.println("outer class snt is " + snt);
           // System.out.println("outer class cnt is " + cnt); // Error:静态上下文中不能访问非静态的成员，因此此时可能还没有创建对象

        }
    }


}
