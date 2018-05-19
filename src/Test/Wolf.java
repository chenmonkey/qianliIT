package Test;


public class Wolf extends Animal
{
    public Wolf()
    {
        //显式调用父类有两个参数的构造器
        super("大灰狼", 3);
        System.out.println("Wolf 无参数的构造器");
    }
    public static void main(String[] args)
    {
        new Wolf();
    }
}
