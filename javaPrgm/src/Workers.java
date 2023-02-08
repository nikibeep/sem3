import java.util.Scanner;
class Worker {
    private String name;
    private int hoursWorked;
    private int wagePerHour;

    public void read() {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter worker name: ");
          name = sc.nextLine();
          System.out.print("Enter hours worked per day: ");
          hoursWorked = sc.nextInt();
          System.out.print("Enter wage per hour: ");
          wagePerHour = sc.nextInt();
        }
    }

    public int calcWage() {
        return hoursWorked * wagePerHour;
    }

    public int extraWage() {
        int wage = calcWage();
        if (wage < 200) {
            return 150;
        } else {
            return 50;
        }
    }

    public int totalWage() {
        return calcWage() + extraWage();
    }

    public void display() {
        System.out.println("Worker Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Wage Per Hour: " + wagePerHour);
        System.out.println("Total Wage: " + totalWage());
    }
}

public class Workers {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.read();
        worker.display();
    }
}

