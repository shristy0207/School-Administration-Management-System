class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showRole() {
        System.out.println("I am a Person.");
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    void showRole() {
        System.out.println("I am a Teacher. I teach students.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject : " + subject);
        System.out.println("Salary  : " + salary);
    }
}

class Student extends Person {
    private int rollNumber;
    private String course;

    Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    void showRole() {
        System.out.println("I am a Student. I study subjects.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Course  : " + course);
    }
}

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new Teacher(
                "shristy kumari",
                40,
                "Computer Science",
                50000
        );

        people[1] = new Student(
                "Anjali Verma",
                20,
                101,
                "BCA"
        );

        for (Person p : people) {

            System.out.println("----------------------------");

            p.showRole();   
            p.displayInfo();

            System.out.println("----------------------------\n");
        }
    }
}
