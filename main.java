// Main.java
// School Administration Management System using Inheritance and Polymorphism

class Person {
    // Common attributes
    protected String name;
    protected int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // General method
    void showRole() {
        System.out.println("I am a Person.");
    }

    // Display common details
    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Teacher class inherits Person
class Teacher extends Person {
    private String subject;
    private double salary;

    // Constructor
    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    // Overriding method
    @Override
    void showRole() {
        System.out.println("I am a Teacher. I teach students.");
    }

    // Display teacher details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject : " + subject);
        System.out.println("Salary  : " + salary);
    }
}

// Student class inherits Person
class Student extends Person {
    private int rollNumber;
    private String course;

    // Constructor
    Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Overriding method
    @Override
    void showRole() {
        System.out.println("I am a Student. I study subjects.");
    }

    // Display student details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll No : " + rollNumber);
        System.out.println("Course  : " + course);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism using Person array
        Person[] people = new Person[2];

        people[0] = new Teacher(
                "Rahul Sharma",
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

            p.showRole();      // Calls overridden method
            p.displayInfo();   // Calls respective displayInfo()

            System.out.println("----------------------------\n");
        }
    }
}
