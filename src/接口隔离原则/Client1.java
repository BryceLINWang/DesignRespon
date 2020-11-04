package 接口隔离原则;
interface I1 {
    public void method1();
}

interface I2 {
    public void method2();
    public void method3();
}

interface I3 {
    public void method4();
    public void method5();
}

class A1{
    public void depend1(I1 i){
        i.method1();
    }
    public void depend2(I2 i){
        i.method2();
    }
    public void depend3(I2 i){
        i.method3();
    }
}

class B1 implements I1, I2{
    public void method1() {
        System.out.println("类B实现接口I1的方法1");
    }
    public void method2() {
        System.out.println("类B实现接口I2的方法2");
    }
    public void method3() {
        System.out.println("类B实现接口I2的方法3");
    }
}
    class C1{
public void depend1(I1 i){
        i.method1();
        }
public void depend2(I3 i){
        i.method4();
        }
public void depend3(I3 i){
        i.method5();
        }
        }

class D1 implements I1, I3{
    public void method1() {
        System.out.println("类D实现接口I1的方法1");
    }
    public void method4() {
        System.out.println("类D实现接口I3的方法4");
    }
    public void method5() {
        System.out.println("类D实现接口I3的方法5");
    }
}
public class Client1 {
    public static void main(String[] args){
        A1 a = new A1();
        a.depend1(new B1());
        a.depend2(new B1());
        a.depend3(new B1());

        C1 c = new C1();
        c.depend1(new D1());
        c.depend2(new D1());
        c.depend3(new D1());
    }
}
