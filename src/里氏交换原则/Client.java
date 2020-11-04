package 里氏交换原则;
class A{
    public int func1(int a,int b){
        return a-b;
    }
}
public class Client {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("100-50="+a.func1(100,50));
        System.out.println("100-80="+a.func1(100,80));
    }
}
//后来，我们需要增加一个新的功能：完成两数相加，然后再与100求和，由类B来负责。即类B需要完成两个功能：
//
//两数相减。
//两数相加，然后再加100。
