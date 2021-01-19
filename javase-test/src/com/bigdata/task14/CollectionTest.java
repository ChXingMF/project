package com.bigdata.task14;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        // 1.准备一个Collection集合并打印
        //Collection c1 = new Collection();  // 接口不能实例化，也就是不能创建对象
        // 接口类型的引用指向实现类的对象，形成了多态
        Collection c1 = new ArrayList();
        // 自动调用toString方法，调用ArrayList类中的toString方法，默认打印格式为：[元素值1, 元素值2, ...]
        System.out.println("集合中的元素有：" + c1); // [啥也没有]

        System.out.println("--------------------------------------------------------");
        // 2.向集合中添加单个元素并打印
        boolean b1 = c1.add(new String("one"));
        System.out.println("b1 = " + b1); // true
        System.out.println("集合中的元素有：" + c1); // [one]

        b1 = c1.add(Integer.valueOf(2));
        System.out.println("b1 = " + b1); // true
        System.out.println("集合中的元素有：" + c1); // [one, 2]

        b1 = c1.add(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true
        // 打印集合中的所有元素时，本质上就是打印集合中的每个对象，也就是让每个对象调用对应类的toString方法
        System.out.println("集合中的元素有：" + c1); // [one, 2, Person{name='zhangfei', age=30}]

        System.out.println("--------------------------------------------------------");
        // 3.向集合中添加多个元素并打印
        Collection c2 = new ArrayList();
        c2.add("three");  // 常量池
        c2.add(4);        // 自动装箱机制
        System.out.println("c2 = " + c2); // [three, 4]
        // 将c2中的所有元素全部添加到集合c1中，也就是将集合c2中的元素一个一个依次添加到集合c1中
        b1 = c1.addAll(c2);
        // 表示将集合c2整体看做一个元素添加到集合c1中
        //b1 = c1.add(c2);
        System.out.println("b1 = " + b1);
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]    [one, 2, Person{name='zhangfei', age=30}, [three, 4]]
        System.out.println("c1 = " + c1);

        System.out.println("--------------------------------------------------------");
        // 4.判断集合中是否包含参数指定的单个元素
        b1 = c1.contains(new String("one"));
        System.out.println("b1 = " + b1); // true

        b1 = c1.contains(new String("two"));
        System.out.println("b1 = " + b1); // false

        b1 = c1.contains(Integer.valueOf(2));
        System.out.println("b1 = " + b1); // true

        b1 = c1.contains(Integer.valueOf(3));
        System.out.println("b1 = " + b1); // false
        // contains方法的工作原理是：Objects.equals(o, e)，其中o代表contains方法的形式参数，e代表集合中的每个元素
        // 也就是contains的工作原理就是 拿着参数对象与集合中已有的元素依次进行比较，比较的方式调用Objects中的equals方法
        // 而该方法equals的工作原理如下：
        /*
        public static boolean equals(Object a, Object b) {    其中a代表Person对象，b代表集合中已有的对象
            return (a == b) || (a != null && a.equals(b));
            元素包含的第一种方式就是：Person对象与集合中已有对象的地址相同
                     第二种方式就是：Person对象不为空，则Person对象调用equals方法与集合中已有元素相等
        }
        */
        // 当Person类中没有重写equals方法时，则调用从Object类中继承下来的equals方法，比较两个对象的地址  false
        // 当Person类中重写equals方法后，则调用重写以后的版本，比较两个对象的内容  true
        b1 = c1.contains(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true  false

        System.out.println("--------------------------------------------------------");
    }
}
