import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Student {
    private String name;
    private int group;
    private int course;
    private int grades;

    public Student(String name, int group, int course, int grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public int getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setGrades(int grades) {
        this.grades = grades;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
    static Collection<Object> Students = new ArrayList<>();
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1, 1, 5);
        Student student2 = new Student("Bob", 2, 2, 3);
        Student student3 = new Student("Petro", 3, 1, 4);
        Students.add(student1);
        Students.add(student2);
        Students.add(student3);
        for (Object student : Students) {
            System.out.println(student);
        }
        System.out.println("\nAfter checking of grades we rise up course\n");
        Iterator<Object> iterator = Students.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            int g = student.getGrades();
            if (g < 3) {
                iterator.remove();
            } else {
                 student.setCourse(Integer.parseInt(String.valueOf(student.getCourse()+1)));
            }
            System.out.println(student);
        }
    }
}


