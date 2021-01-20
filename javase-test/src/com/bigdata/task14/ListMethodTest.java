package com.bigdata.task14;

import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {
    public static void main(String[] args) {
        // 1.准备一个List集合并打印
        List lt1 = new LinkedList();
        System.out.println("lt1 = " + lt1); // [啥也没有]

        System.out.println("------------------------------------------");
        // 2.向集合中添加元素并打印
        // 向集合中的开头位置添加元素
        lt1.add(0, "one");
        System.out.println("lt1 = " + lt1); // [one]
        // 向集合中的末尾位置添加元素
        lt1.add(1, 3);
        System.out.println("lt1 = " + lt1); // [one, 3]
        // 向集合中的中间位置添加元素
        lt1.add(1, "two");
        System.out.println("lt1 = " + lt1); // [one, two, 3]

        System.out.println("------------------------------------------");
        // 3.根据参数指定的下标来获取元素
        String str1 = (String) lt1.get(0);
        System.out.println("获取到的元素是：" + str1); // one

        // 注意：获取元素并进行强制类型转换时一定要慎重，因为容易发生类型转换异常
        //String str2 = (String)lt1.get(2); // 编译ok，运行发生ClassCastException类型转换异常
        //System.out.println("获取到的元素是：" + str2); // 3

        System.out.println("------------------------------------------");
        // 4.使用get方法获取集合中的所有元素并打印
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        for (int i = 0; i < lt1.size(); i++) {
            //Object obj = lt1.get(i);
            //System.out.println("获取到的元素是：" + obj);
            Object obj = lt1.get(i);
            // 若取出的元素是最后一个元素，则拼接元素值和]
            if (lt1.size()-1 == i) {
                sb1.append(obj).append("]");
            }
            // 否则拼接元素和逗号以及空格
            else {
                sb1.append(obj).append(",").append(" ");
            }
        }
        System.out.println("lt1 = " + sb1); // [one, two, 3]

        System.out.println("------------------------------------------");
        // 5.查找指定元素出现的索引位置
        System.out.println("one第一次出现的索引位置为：" + lt1.indexOf("one")); // 0
        lt1.add("one");
        System.out.println("lt1 = " + lt1); // [one, two, 3, one]
        System.out.println("one反向查找第一次出现的索引位置是：" + lt1.lastIndexOf("one")); // 3

        System.out.println("------------------------------------------");
        System.out.println("lt1 = " + lt1); // [one, two, 3, one]
        // 6.实现集合中元素的修改
        Integer it1 = (Integer) lt1.set(2, "three");
        System.out.println("被修改的元素是：" + it1); // 3
        System.out.println("修改后集合中的元素有：" + lt1); // [one, two, three, one]

        String str2 = (String) lt1.set(3, "four");
        System.out.println("被修改的元素是：" + str2); // one
        System.out.println("修改后集合中的元素有：" + lt1); // [one, two, three, four]

        System.out.println("------------------------------------------");
    }
}
