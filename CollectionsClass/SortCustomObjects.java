package CollectionsClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student obj){
        return Integer.compare(age, obj.age);
    }

    public String toString(){
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class SortCustomObjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice",22));
        students.add(new Student("Bob",25));
        students.add(new Student("Charlie",20));

        Collections.sort(students);
        System.out.println("Sorted list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
        //(OR)
        //System.out.println(students);
    }
}
