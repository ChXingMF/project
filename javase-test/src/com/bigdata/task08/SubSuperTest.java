package com.bigdata.task08;

public class SubSuperTest extends SuperTest {

    {
        System.out.println("SubSuperTest类中构造块...");
    }

    static {

        System.out.println("SubSuperTest类中静态代码块...");
    }

    public SubSuperTest() {
        System.out.println("SubSuperTest类中的无参构造方法...");
    }

    public static void main(String[] args) {
        // 使用无参构造方法构造子类对象
        SubSuperTest sst = new SubSuperTest();
    }
}
