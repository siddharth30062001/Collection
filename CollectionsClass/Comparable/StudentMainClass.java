package CollectionsClass.Comparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student obj){
        return Integer.compare(age, obj.age);
    }

    public String toString(){
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class StudentMainClass {
    public static void main(String[] args) {
        List<Student> l=new ArrayList<>();

        l.add(new Student("Alice",22));
        l.add(new Student("Bob",21));
        l.add(new Student("Charlie",20));
        l.add(new Student("David",19));

        Collections.sort(l);

        System.out.println(l);
    }
}
