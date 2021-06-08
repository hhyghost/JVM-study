package com.summer.study.jvm;

/**
 * 测试设置了 -Xss256k
 */
public class StackTest02 {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
