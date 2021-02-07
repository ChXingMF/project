package com.bigdata.task18;

public class ThreadIdNameTest extends Thread{

    public ThreadIdNameTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("子线程的编号是：" + getId() + "，名称是：" + getName()); // 14  Thread-0 guanyu
        // 修改名称为"zhangfei"
        setName("zhangfei");
        System.out.println("修改后子线程的编号是：" + getId() + "，名称是：" + getName()); // 14  zhangfei
    }

    public static void main(String[] args) {

    }
}
