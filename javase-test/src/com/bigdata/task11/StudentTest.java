package com.bigdata.task11;

public class StudentTest {
    public static void main(String[] args) {
        // 1.使用有参方式构造Student类型的两个对象并判断是否相等
        Student s1 = new Student(1001, "tom");
        //Student s2 = new Student(1002, "jerry");
        Student s2 = new Student(1001, "tom");
        //Student s2 = s1;  // 表示s2和s1都指向了同一个对象，地址相同了
        // 下面调用从Object类中继承下来的equals方法，该方法默认比较两个对象的地址，可以查看源码验证
        // 当Student类中重写equals方法后，则调用重写以后的版本，比较内容
        //boolean b1 = s1.equals(s2);
        //Student s3 = null;
        //boolean b1 = s1.equals(s3);
        //Student s3 = s1;
        boolean b1 = s1.equals(s2);
        System.out.println("b1 = " + b1);   // false true
        System.out.println(s1 == s2);       // 比较地址  false
    }
}
