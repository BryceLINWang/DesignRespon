package 单一职责原则;
class Animal{
    public void breathe(String animal){
        System.out.println(animal+"呼吸空气");
    }
}
public class Client {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
    }
}
//有隐含问题 不是所有动物都呼吸空气
//鱼呼吸水
//下一代码按照单一职责进行拆分
