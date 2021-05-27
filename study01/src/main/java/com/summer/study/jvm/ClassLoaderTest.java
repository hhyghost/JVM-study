package com.summer.study.jvm;

public class ClassLoaderTest {

    public static void main(String[] args) {

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取上层加载器：ext加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        // 继续获取上层加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        // 获取用户自定义类加载器
        ClassLoader userClassloader = ClassLoaderTest.class.getClassLoader();
        System.out.println(userClassloader);

        // 获取String类加载器
        // java的核心类库都是使用引导类加载器进行加载的
        // String使用的是引导类加载器
        ClassLoader stringClassloader = String.class.getClassLoader();
        System.out.println(stringClassloader);
        
    }

}
