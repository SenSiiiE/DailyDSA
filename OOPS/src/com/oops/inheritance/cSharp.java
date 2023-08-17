package com.oops.inheritance;

class cSharp {


    protected int a = 20;
}
    class derived extends cSharp
    {

        int a = 10;
        public void math()
        {
            System.out.println(super.a +" "+ a);
        }
    }


class Main3{
    public static void main(String[] args) {
        derived d = new derived();
        d.math();
    }
}
