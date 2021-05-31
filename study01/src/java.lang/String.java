package java.lang;

// 双亲委派机制
public class String {

    static {
        System.out.println("加载自定义String");
    }

    // 错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
    //   public static void main(String[] args)
    public static void main(String[] args) {
        System.out.println("hello");
    }

}