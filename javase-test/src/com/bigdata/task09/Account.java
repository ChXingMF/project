package com.bigdata.task09;

public abstract  class Account {
    private int money;
//    private double interest;    // 利息

    public Account() {
    }

    public Account(int money) {
        setMoney(money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("money is unreasonable");
        }
    }

    public abstract double getInterest();
}
