package com.bigdata.task09;

public abstract  class AbstractTest {
    private  int count;

    public AbstractTest() {
    }

    public AbstractTest(int count) {
        setCount(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    // 自定义抽象方法
    public abstract void show();

    public static void main(String[] args) {
        //AbstractTest at = new AbstractTest();

    }
}
