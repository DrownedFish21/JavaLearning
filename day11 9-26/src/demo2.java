import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Lambda表达式
 */
public class demo2 {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {jkl
                System.out.println("启动！！！！！");
            }
        }).start();*/

        //Lambda表达式
        new Thread(()->{
            System.out.println("啦啦啦");
        });

        Eat eat = food -> System.out.println("吃"+food);
        eat.eat("香蕉");

        //Calculate getSum = (m1,m2)->m1+m2;
        Calculate getSum = Integer::sum;
        System.out.println(getSum.cal(1, 2));

        Calculate getMultiply = (m1,m2)->m1*m2;
        System.out.println(getMultiply.cal(1,2));

        //useFly(m-> System.out.println(m));
        useFly(System.out::println);

        useAdd((m1,m2)->m1+m2);
        useAdd(Integer::sum);
    }
    static void useFly(Fly fly){
        fly.fly("I can fly");
    }
    static void comp(Calculate calculate){
         calculate.cal(0, 0);
    }
    static void useAdd(Addable addable){
        System.out.println(addable.add(10, 20));
    }
}
interface Calculate {
    Integer cal(Integer x,Integer y);
}
interface Eat{
    void eat(String food);
}
interface Fly{
    void fly(String s);
}
interface Addable{
    Integer add(Integer x,Integer y);
}
