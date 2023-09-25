import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class demo7 {
    public static void main(String[] args){
       Student[] students = new Student[3];
       students[0] = new Student("na");
       students[1] = new Student("va");
       students[2] = new Student("na");
        HashSet hashSet = new HashSet();
        for (Student student : students) {
            hashSet.add(student);
        }
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}
class Student{
    private String name;
    public String getName(){
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || getClass()!=obj.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return student.getName().equals(this.name);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
