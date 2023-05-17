public abstract class Person {
    private static FullName fullName;
    private int age;

    public int getAge() {
        return age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String info() {
        return "First Name: " + fullName.getFirstName() +
                " Last Name: " + fullName.getLastName() +
                ", age: " + age + ", course: ";

    }

    public String activity() {
        return "I study at university";
    }
}
      class FullName {
        private String firstName;
        private  String lastName;

        public String getFirstName() {
            return firstName;
        }

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
}

 class Student extends Person implements Clonable {
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + this.course;
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("test1", "test11"), 21, 1);
        Student student2 = new Student(new FullName("test2", "test22"), 22, 2);

        System.out.println("Student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("\nStudent 2:");
        System.out.println(student2.info());
        System.out.println(student2.activity());

         
        Student clonedStudent = new Student(student1.getFullName(), student1.getAge(), student1.getCourse());
        clonedStudent.setCourse(3);  
        System.out.println("\nCloned Student:");
        System.out.println(clonedStudent.info());
        System.out.println(clonedStudent.activity());
    }
}
