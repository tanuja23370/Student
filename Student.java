package Student1;

public class Student {
    String name;
    int id;
    String course;
    long phoneNumber;
    
    

    // Constructor
    public Student(String name, int id, String course, long phoneNumber) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phoneNumber = phoneNumber;
        
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone Number: " + phoneNumber);
        
    }

    public static void main(String[] args) {
        Student student1 = new Student("Tanuja", 101, "Computer Science", 1234567890L);
        student1.displayDetails();
    }
}