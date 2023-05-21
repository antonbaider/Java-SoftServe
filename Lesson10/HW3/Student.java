import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int course;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public Student(String name, int course) {
         this.name = name;
         this.course = course;
     }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, int course){

    Iterator<Student> iterator = students.iterator();
    while (iterator.hasNext()) {
        Student student = iterator.next();
        if (student.getCourse() == course) {
            System.out.println("In such course there are " + student.getName());
        }
    }

    }
     public static void main(String[] args) {

         List<Student> students = new ArrayList<>();
         students.add(new Student("Alice", 1));
         students.add(new Student("Bob", 2));
         students.add(new Student("Mike", 3));
         Collections.sort(students);
         System.out.println(students);
         int course = 2;
         System.out.println("Students enrolled in course " + course + ":");
         Student.printStudents(students, course);
         System.out.println("Sorted by name:");

         for (Student student : students) {
             System.out.println(student.getName());
         }

         System.out.println("\nSorted by course:");
         students.sort(Comparator.comparingInt(Student::getCourse));
         for (Student student : students) {
             System.out.println(student.getName() + " (Course: " + student.getCourse() + ")");
         }
    }
}
