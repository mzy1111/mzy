package com.ma.demo01;

public class StaticTest {

    public static void main(String[] args) {
        B.f();
        System.out.println(B.i);

        B b = new B();
        b.f();
        System.out.println(b.i);
    }

}

class B{
    public static int i = 11;

    public static void f(){
        System.out.println("aaaaa");
    }

}
