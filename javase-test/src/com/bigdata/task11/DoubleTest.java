package com.bigdata.task11;

public class DoubleTest {
    public static void main(String[] args) {
        // 1.在Java5之前装箱和拆箱的实现
        // 实现了从double类型到Double类型的转换，装箱
        Double db1 = Double.valueOf(3.14);
        System.out.println("db1 = " + db1); // 3.14
        // 实现了从Double类型到double类型的转换，拆箱
        double d1  = db1.doubleValue();
        System.out.println("d1 = " + d1); // 3.14

        System.out.println("---------------------------------------------");
        // 2.从Java5开始实现自动装箱和自动拆箱
        Double db2 = 3.14;
        double d2 = db2;
    }
}
