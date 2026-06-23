import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Setup the numbers list
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        // 2. Setup the students list
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));

        // 3. Define the custom comparator explicitly for Student objects
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;   // Swap if student 'i' is older
                else
                    return -1;  // Keep order if student 'i' is younger
            }
        };

        // FIX: We pass 'studs' here because 'com' belongs to the Student class type!
        Collections.sort(studs, com);

        // 4. Print the sorted student list
        System.out.println("Sorted Student List (By Age):");
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
