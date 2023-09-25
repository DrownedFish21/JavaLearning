public class demo1 {

    public static void main(String[] args) {
        Student student = new Student();
        student.name="无敌暴龙战士";
        student.age=18;
        student.learning = "战士";
        System.out.println(student.name);


    }
}
class Student{
    String name;
    int age;
    String learning;
    public void Study(){
        System.out.println("Learn to make enemies' heads fly");
    }
    public void doSports(){
        System.out.println("Find a girl to do it");
    }
    public void WatchFilm(){
        System.out.println("Watching sexual Movies");
    }
}
