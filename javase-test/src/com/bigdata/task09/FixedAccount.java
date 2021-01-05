package com.bigdata.task09;

public class FixedAccount extends Account {
    public FixedAccount() {
    }

    public FixedAccount(int i) {
        super(i);
        // or
        //setMoney(i);
    }

    @Override
    public double  getInterest() {
        // 利息 = 本金 * 利率 * 时间
        return (getMoney() * 0.03 *5);
    }

    public static void main(String[] args) {

        Account at = new FixedAccount(1000);
        //Account at = new FixedAccount();
        //at.setMoney(1000);
        double interest = at.getInterest();
        System.out.println("Account interest is " + interest);
    }
}
