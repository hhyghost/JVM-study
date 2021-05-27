package com.summer.study.jvm;

import org.omg.SendingContext.RunTime;

/**
 * 使用javap命令反编译class文件查看
 */
public class StackStruTest {
    public static void main(String[] args) {
//        int i = 2 + 3;
        int i = 2;
        int j = 3;
        int k = i + j;
    }
}
