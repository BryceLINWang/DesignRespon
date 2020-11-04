package 单一职责原则;
//陆生动物
class Terrestrial{
    public void breathe(String animal){
        System.out.println(animal+"呼吸空气");
    }
}
//水生动物
class Aquatic{
    public void breathe(String animal){
        System.out.println(animal+"呼吸水");
    }
}
public class Client1 {
    public static void main(String[] args) {
        Terrestrial terrestrial=new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("羊");
        terrestrial.breathe("猪");
        Aquatic aquatic=new Aquatic();
        aquatic.breathe("鱼");
    }
}
//产生问题
//按照单一职责进行了修改
//但花销变大
//除了将类分解之外还要修改客户端 直接修改类虽然违背单一职责但花销小