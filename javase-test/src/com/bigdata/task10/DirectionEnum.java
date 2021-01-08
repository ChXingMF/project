package com.bigdata.task10;

/**
 * 编程实现所有方向的枚举，所有的方向：向上、向下、向左、向右
 * 枚举类型要求所有枚举值必须放在枚举类型的最前面
 */

public enum DirectionEnum {
    // 2.声明本类类型的引用指向本类类型的对象
    UP("向上"),DOWN("向下"),LEFT("向左"),RIGHT("向右");

    // 用于描述方向字符串的成员变量
    private final String desc;
    // 通过构造方法实现成员变量的初始化，更加灵活
    // 1.私有化构造方法，此时该构造方法只能在本类的内部使用
    private DirectionEnum(String desc) {
        this.desc = desc;
    }

    // 通过公有的get方法可以在本类的外部访问该类成员变量的数值
    public String getDesc() {
        return desc;
    }
}




