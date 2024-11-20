package ArrayList.StoringObject;

import java.util.*;

public class StudentMainClass {
    
    public static void main(String[] args) {
        
        Student s1=new Student("Tom",21,14);
        Student s2=new Student("Jerry",18,25);
        Student s3=new Student("Jack",19,20);

        ArrayList<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        /*Iterator<Student> itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.name+" "+st.age+" "+st.rollNo);
        }*/

        for (Student student : al) {
            System.out.println(student.name+" "+student.age+" "+student.rollNo);
        }
    }
}
