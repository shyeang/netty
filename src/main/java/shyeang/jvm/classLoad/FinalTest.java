package shyeang.jvm.classLoad;

public class FinalTest {
    public static final String  str =  "hello world ";
    static {
        System.out.println("MyParent2 static block");
    }
    public static void main(String[] args) {
        //输出的结果就是 ： hello world
        System.out.println(FinalTest.str);
    }
}
