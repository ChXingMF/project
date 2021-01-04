package com.bigdata.task08;

public class FinalMemberTest  {
    //private final int count = 10;
    private  final  int count;

/*    {
        count = 12;

    }*/

    public FinalMemberTest() {
        count = 15;
    }

    public static void main(String[] args) {
        FinalMemberTest fmt = new FinalMemberTest();
        System.out.println("fmt.count is " + fmt.count);
    }
}
