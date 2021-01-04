package com.bigdata.task08;

public class SuperTest {

    {
        System.out.println("SuperTest类中构造块...");
    }

    static {

        System.out.println("SuperTest类中静态代码块...");
    }

    public SuperTest() {
        System.out.println("SuperTest类中的无参构造方法...");
    }

    public static void main(String[] args) {
        // 使用无参构造方法构造对象
        SuperTest st = new SuperTest();
    }
}

