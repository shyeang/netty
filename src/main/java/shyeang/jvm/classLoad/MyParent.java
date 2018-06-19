package shyeang.jvm.classLoad;

public class MyParent {
    public static String str  = "hello world";
    static{
        System.out.println("MyParent static block");
    }
}
