import java.util.Scanner;

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
        System.out.println("\nI am a Teacher.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
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
        System.out.println("\nI am a Student.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Teacher Input
        System.out.println("Enter Teacher Details");
        System.out.print("Name: ");
        String tName = sc.nextLine();

        System.out.print("Age: ");
        int tAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Subject: ");
        String subject = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        // Student Input
        System.out.println("\nEnter Student Details");

        System.out.print("Name: ");
        String sName = sc.nextLine();

        System.out.print("Age: ");
        int sAge = sc.nextInt();

        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        Person[] people = {
            new Teacher(tName, tAge, subject, salary),
            new Student(sName, sAge, rollNumber, course)
        };

        System.out.println("\n===== SCHOOL MANAGEMENT SYSTEM =====");

        for (Person person : people) {
            person.showRole();
            System.out.println("----------------------------");
        }

        sc.close();
    }
}
