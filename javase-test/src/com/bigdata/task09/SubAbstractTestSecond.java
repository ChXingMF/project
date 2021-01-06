package com.bigdata.task09;

public class SubAbstractTestSecond extends AbstractTest {

    @Override
    public void show() {
        System.out.println("SubAbstractTestSecond method show override.");
    }

    public void test() {
        System.out.println("SubAbstractTestSecond test method!");
    }
//    public static void main(String[] args) {
//        AbstractTest at = new SubAbstractTestSecond();
//        // 编译阶段父类，运行阶段子类
//        at.show();
//    }
}
