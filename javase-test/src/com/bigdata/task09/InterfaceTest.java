package com.bigdata.task09;

public interface InterfaceTest {
    /*public static final*/ int CNT = 10; // 只能有常量  public static final 可省略 默认存在
    //private void show(){}  // 从Java9开始允许接口中出现私有方法
    /*public abstract */void show();         // 里面只能有抽象方法（新特性除外），注释中的关键字可以省略，但建议写上
}
