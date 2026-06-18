class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showRole() {
        System.out.println("I am a Person.");
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void showRole() {
        System.out.println("I am a Teacher.");
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: ₹" + salary);
    }
}

class Student extends Person {
    int rollNumber;
    String course;

    Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    @Override
    void showRole() {
        System.out.println("I am a Student.");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {

        Person[] people = {
            new Teacher("Rahul Sharma", 35, "Mathematics", 50000),
            new Student("Shristy Kumari", 18, 101, "Computer Science")
        };

        System.out.println("===== SCHOOL MANAGEMENT SYSTEM =====\n");

        for (Person person : people) {
            person.showRole();
            System.out.println("----------------------------");
        }
    }
}
