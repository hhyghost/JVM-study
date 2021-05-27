package com.summer.study.jvm;

import java.net.URL;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        // 获取BootstrapClassLoader能够加载的api的路径
//        URL[] urls =sun.misc.Launcher.getBootstrapClassPath().getURLs();
//        for(URL url : urls) {
//            System.out.println(url.toExternalForm());
//        }


        // 获取扩展类加载器能够加载的api的路径
        String extUrls =System.getProperty("java.ext.dirs");
        for(String url : extUrls.split(";")) {
            System.out.println(url);
        }

    }
}
