import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class demo3 {
    public static void main(String[] args) {
        Student[] students = {new Student("张三",3),
                new Student("张四",4),
                new Student("张五",5),
                new Student("张六",6),
                new Student("张七",7),
        };
        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
        for (Student student : students) {
            System.out.println("name= " + student.getName());
        }
        A a = ()-> System.out.println("函数式接口");
        a.print();


    }

}
class Student{
    private String name;
    private Integer age;
    public Student(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}
@FunctionalInterface
interface A{
    void print();
}

