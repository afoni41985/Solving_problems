package javarush.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        students.sort(new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
