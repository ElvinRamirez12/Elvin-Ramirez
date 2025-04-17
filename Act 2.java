
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


class Student extends Person {
    String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}


class Teacher extends Person {
    String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}


class Staff extends Person {
    String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}


public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "Grade 10");
        Teacher teacher = new Teacher("Mr. Smith", 202, "Mathematics");
        Staff staff = new Staff("Mrs. Johnson", 303, "Administration");

        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println();

        System.out.println("Teacher Information:");
        teacher.displayInfo();
        System.out.println();

        System.out.println("Staff Information:");
        staff.displayInfo();
    }
}
