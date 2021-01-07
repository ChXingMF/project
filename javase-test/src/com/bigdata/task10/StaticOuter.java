package com.bigdata.task10;

/**
 * 实现静态内部类的定义和使用
 */
public class StaticOuter  {
    private int cnt = 1;
    private static int snt = 2;

    public /*static*/ void show() {
        System.out.println("show method in StaticOuter class.");
    }

    /**
     * 定义静态内部类   有static关键字修饰隶属于类层级
     */
    public static class StaticInner{
        private int ia = 3;
        private static int snt = 4;
        public StaticInner() {
            System.out.println("static inner class construct method.");
        }

        public  void show() {
            System.out.println("ia is " + ia);
            System.out.println("outer class snt is " + snt);
           // System.out.println("outer class cnt is " + cnt); // Error:静态上下文中不能访问非静态的成员，因此此时可能还没有创建对象
        }

        public void show2(int snt) {
            System.out.println("snt is " + snt +" in show2 method.");
            System.out.println("snt is " + StaticInner.snt + " in inner class.");
            System.out.println("snt is " + StaticOuter.snt + " in outer class.");
            //StaticOuter.show();
            StaticOuter so = new StaticOuter();
            so.show();
        }
    }


}
