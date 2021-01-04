package com.bigdata.task08;

public class Dog extends Animal {
    private int teeth;

    public Dog() {
        super(); // 不写， 默认调用父类的无参构造方法
    }

    public Dog(String name, String color, int teeth) {
        super(name, color);     // 表示调用父类的有参构造方法
        setTeeth(teeth);
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        if (teeth > 0) {
            this.teeth = teeth;
        }
        else {
            System.out.println("Animal teeth is not reasonable!");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Teeth is " + getTeeth());
    }
}
