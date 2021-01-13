package com.bigdata.task11;

public class IntegerTest {
    public static void main(String[] args) {
        // 1.打印Integer类中常用的常量数值
        System.out.println("最大值是：" + Integer.MAX_VALUE); // 2^31-1
        System.out.println("最小值是：" + Integer.MIN_VALUE); // -2^31
        System.out.println("所表示二进制的位数是：" + Integer.SIZE); // 32
        System.out.println("所占字节的个数是：" + Integer.BYTES); // 4
        System.out.println("对应int类型的Class实例是：" + Integer.TYPE); // int

        System.out.println("------------------------------------------------------");
        // 2.使用构造方法来构造Integer类型的对象并打印
        //Integer it1 = new Integer(123);
        //System.out.println("it1 = " + it1); // 自动调用toString方法   123
        //Integer it2 = new Integer("456");
        //System.out.println("it2 = " + it2); // 456
        // 上述方法已过时，建议使用valueOf方法取代之，相当于从int类型到Integer类型的转换，叫做装箱
        Integer it3 = Integer.valueOf(123);
        System.out.println("it3 = " + it3); // 123
        // 相当于从String类型到Integer类型的转换
        Integer it4 = Integer.valueOf("456");
        System.out.println("it4 = " + it4); // 456   自动调用toString方法得到的是String类型
        // 获取调用对象中的整数数值，相当于从Integer类型到int类型的转换，叫做拆箱
        int ia = it4.intValue();
        System.out.println("获取到的整数数据是：" + ia); // 456  得到的是int类型

        System.out.println("------------------------------------------------------");
    }
}
