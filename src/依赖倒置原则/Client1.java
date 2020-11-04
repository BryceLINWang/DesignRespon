package 依赖倒置原则;
interface IReader{
    public String getContent();
}
//Mother类与接口IReader发生依赖关系，
// 而Book和Newspaper都属于读物的范畴，他们各自都去实现IReader接口，
// 这样就符合依赖倒置原则了，代码修改为：
class Newspaper1 implements IReader {
    public String getContent(){
        return "林书豪17+9助尼克斯击败老鹰……";
    }
}
class Book1 implements IReader{
    public String getContent(){
        return "很久很久以前有一个阿拉伯的故事……";
    }
}

class Mother1{
    public void narrate(IReader reader){
        System.out.println("妈妈开始讲故事");
        System.out.println(reader.getContent());
    }
}

public class Client1 {
    public static void main(String[] args){
        Mother1 mother = new Mother1();
        mother.narrate(new Book1());
        mother.narrate(new Newspaper1());
    }
}
//这样修改后，无论以后怎样扩展Client类，
// 都不需要再修改Mother类了。
// 这只是一个简单的例子，实际情况中，代表高层模块的Mother类将负责完成主要的业务逻辑，一旦需要对它进行修改，引入错误的风险极大。所以遵循依赖倒置原则可以降低类之间的耦合性，
// 提高系统的稳定性，降低修改程序造成的风险。