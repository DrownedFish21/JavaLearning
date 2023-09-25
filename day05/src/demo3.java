public class demo3 {
    public static void main(String[] args) {

        D d = new D("D");
        System.out.println(d.name);
        d.e.print();
        d.mi();
    }
}
interface E{
    public void print();
}
class C {
    public String name;
    public C(String name){
        this.name = name;
    }
    E e = new E() {
        @Override
        public void print() {
            System.out.println("匿名");
        }
    };

    public void mi(){
        class cl{

        }
        cl cl = new cl();
        E e = new E() {
            @Override
            public void print() {
                System.out.println("nnn");
            }
        };
        e.print();
    }

    public static class Inner{
        public String name;
    }

}
class D extends C{
    public D(String name){
        super(name);
    }
}
abstract class A{
     public String name;
     public abstract void Eat();
     public A(String name){
         this.name = name;
     }

     public void Drink(){
         System.out.println("喝水");
     }
}
class B extends A{

    public B(String name) {
        super(name);
    }

    @Override
    public void Eat() {
        System.out.println("吃粑粑");
    }
}
