package phanbietHashMapvaHashSet;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,new Student("Nam",20,"hanoi"));
        studentMap.put(2,new Student("hung",21,"hanoi"));
        studentMap.put(3,new Student("ha",22,"hanoi"));

    for (Map.Entry<Integer,Student> studentEntry : studentMap.entrySet()){
        System.out.println(studentEntry.toString());
    }

        System.out.println("......Set");
        Set<Student> students = new HashSet<>();
        students.add(new Student("Nam",20,"hanoi"));
        students.add(new Student("hung",21,"hanoi"));
        students.add(new Student("ha",22,"hanoi"));
//        for (Student student: students)
//            System.out.println(student.toString());
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
