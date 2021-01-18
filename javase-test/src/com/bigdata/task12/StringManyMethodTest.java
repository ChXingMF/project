package com.bigdata.task12;

public class StringManyMethodTest {
    public static void main(String[] args) {
        // 1.构造String类型的对象并打印
        String str1 = new String("     Let Me Give You Some Color To See See!");
        System.out.println("str1 = " + str1); //      Let Me Give You Some Color To See See!

        // 2.实现各种成员方法的调用和测试
        boolean b1 = str1.contains("some");
        System.out.println("b1 = " + b1); // false  区分大小写
        b1 = str1.contains("Some");
        System.out.println("b1 = " + b1); // true

        System.out.println("----------------------------------------------");
        // 将所有字符串转换为大写  小写  以及去除两边的空白字符
        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); //    LET ME GIVE YOU SOME COLOR TO SEE SEE!
        System.out.println("str1 = " + str1); //    Let Me Give You Some Color To See See!   常量

        String str3 = str1.toLowerCase();
        System.out.println("str3 = " + str3); //    let me give you some color to see see!
        System.out.println("str1 = " + str1); //    Let Me Give You Some Color To See See!

        String str4 = str1.trim();
        System.out.println("str4 = " + str4); //Let Me Give You Some Color To See See!     奇点

        System.out.println("----------------------------------------------");
    }
}
