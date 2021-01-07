package com.bigdata.task10;

public class StaticOuterTest {
    public static void main(String[] args) {

        // 1.声明StaticInner类型的引用指向该类型的对象
        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.show();
        System.out.println("------------------------------------------");
        si.show2(5);
    }

}
