package 依赖倒置原则;

class Book{
    public String getContent(){
        return "很久很久以前有一个阿拉伯的故事……";
    }
}

class Mother{
    public void narrate(Book book){
        System.out.println("妈妈开始讲故事");
        System.out.println(book.getContent());
    }
}
//假如有一天，需求是去读一份报纸
// 但母亲却办不到 因为她只会读书这太荒唐了，
// 只是将书换成报纸，居然必须要修改Mother才能读。
// 假如以后需求换成杂志呢？换成网页呢？
// 还要不断地修改Mother，这显然不是好的设计。
// 原因就是Mother与Book之间的耦合性太高了，
// 必须降低他们之间的耦合度才行。于是我们引入一个接口
class Newspaper{
    public String getContent(){
        return "林书豪38+7领导尼克斯击败湖人……";
    }
}
public class Client{
    public static void main(String[] args){
        Mother mother = new Mother();
        mother.narrate(new Book());
    }
}
