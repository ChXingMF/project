package com.bigdata.task09;

public class SubAbstractTest extends AbstractTest{
    @Override
    public void show() {
        System.out.println("SubAbstractTest method show override.");
    }

    public static void main(String[] args) {
        SubAbstractTest sat = new SubAbstractTest();
        sat.show();

        System.out.println("---------------------------------------");
        AbstractTest at = new SubAbstractTestSecond();
        // 编译阶段父类，运行阶段子类
        at.show();

        ((SubAbstractTestSecond) at).test();
    }
}
