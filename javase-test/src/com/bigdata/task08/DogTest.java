package com.bigdata.task08;

public class DogTest {

    public static void main(String[] args) {
        // 1.使用无参方式构造Dog类型的对象并打印特征
        Dog d1 = new Dog();
        d1.show();          // null null 0

        // 2.使用有参的方式构造Dog类型的对象并打印特种
        Dog d2 = new Dog("Tom", "white", 10);
        d2.show();          // Tom white 10
    }
}
