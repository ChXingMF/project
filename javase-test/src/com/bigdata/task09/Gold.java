package com.bigdata.task09;

// 使用implements关键字表达实现的关系，支持多实现
public class Gold implements Metal, Money {
    @Override
    public void shine() {
        System.out.println("shine bling bling...");
    }

    @Override
    public void buy() {
        System.out.println("buy a lot something...");
    }

    public static void main(String[] args) {
        // 1.声明接口类型的引用指向实现类的对象，形成了多态
        Metal mt = new Gold();
        mt.shine();

        Money mn = new Gold();
        mn.buy();
    }
}
