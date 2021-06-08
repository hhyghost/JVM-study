package com.summer.study.jvm;

public class StackTest {

    private void methodA() {
        int i = 10;
        int j = 20;
        this.methodB();
    }

    private void methodB(){
        int k = 30;
        int m = 40;
    }

    public static void main(String[] args) {
        StackTest test = new StackTest();
        test.methodA();
    }

}
