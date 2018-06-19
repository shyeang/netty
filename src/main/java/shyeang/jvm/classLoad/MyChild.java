package shyeang.jvm.classLoad;


public class MyChild extends MyParent {
    public static String str2 = "welcome";
    static{
        System.out.println("MyChild static bloack");
    }
}
