import java.util.Scanner;
class Student {
        int rollNo;
        String name;
        String course;
        int marks1; 
        int marks2;
        int marks3;
        int marks4; 
        int marks5;
        double percentage;
        public void calculate() {
        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        percentage = (total / 500.0) * 100;
        }
    
        public void read() {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Enter Roll number: ");
                rollNo = scan.nextInt();
                System.out.print("Enter Name: ");
                name = scan.next();
                System.out.print("Enter Course: ");
                course = scan.next();
                System.out.print("Enter marks in subject 1: ");
                marks1 = scan.nextInt();
                System.out.print("Enter marks in subject 2: ");
                marks2 = scan.nextInt();
                System.out.print("Enter marks in subject 3: ");
                marks3 = scan.nextInt();
                System.out.print("Enter marks in subject 4: ");
                marks4 = scan.nextInt();
                System.out.print("Enter marks in subject 5: ");
                marks5 = scan.nextInt();
            }
        }
    
        public void display() {
            System.out.println("Roll number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);
            System.out.println("Marks in subject 1: " + marks1);
            System.out.println("Marks in subject 2: " + marks2);
            System.out.println("Marks in subject 3: " + marks3);
            System.out.println("Marks in subject 4: " + marks4);
            System.out.println("Marks in subject 5: " + marks5);
            System.out.println("Percentage: " + percentage);
        }
    }
    
class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.read();
        s.calculate();
        s.display();
    }
}