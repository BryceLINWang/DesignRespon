package 单一职责原则;
class Animal1{
    public void breathe(String animal){
        if(animal.contains("鱼")){
            System.out.println(animal+"呼吸水");
        }else{
            System.out.println(animal+"呼吸空气");
        }
    }
}
public class Client2 {
    public static void main(String[] args) {
        Animal1 animal=new Animal1();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe("鲤鱼");
    }
}
//虽然开销小 操作简单但存在隐患
// 如果有天需要继续细分 产生职责扩散
// 会诞生更多的修改还会对原有代码功能带来风险
//还有一种修改方式