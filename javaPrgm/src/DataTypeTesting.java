import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Customer {
  private String name;
  private int age;
  private long acc;
  private char gender;
  private float minbal;
  private float bal;
  private String pan;

  // default constructor
  public Customer() {}

  // constructor to initialize name, age, acc, gender, minbal, bal, and pan
  public Customer(String name, int age, long acc, char gender, float minbal, float bal, String pan) {
    this.name = name;
    this.age = age;
    this.acc = acc;
    this.gender = gender;
    this.minbal = minbal;
    this.bal = bal;
    this.pan = pan;
  }

  // constructor to initialize name, age, and acc
  public Customer(String name, int age, long acc) {
    this.name = name;
    this.age = age;
    this.acc = acc;
  }

  // method to read data for a customer
  public void readData() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = scan.nextLine();
    System.out.print("Enter age: ");
    age = Integer.parseInt(scan.nextLine());
    System.out.print("Enter account number: ");
    acc = Long.parseLong(scan.nextLine());
    System.out.print("Enter gender (M/F): ");
    gender = scan.nextLine().charAt(0);
    System.out.print("Enter minimum balance: ");
    minbal = Float.parseFloat(scan.nextLine());
    System.out.print("Enter current balance: ");
    bal = Float.parseFloat(scan.nextLine());
    System.out.print("Enter PAN number: ");
    pan = scan.nextLine();
  }

  // method to display data for a customer
  public void displayData() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Account number: " + acc);
    System.out.println("Gender: " + gender);
    System.out.println("Minimum balance: " + minbal);
    System.out.println("Current balance: " + bal);
    System.out.println("PAN number: " + pan);
  }

  // method to search for a customer by name
  public Customer searchByName(String name, Customer[] cust) {
    for (int i = 0; i < cust.length; i++) {
      if (cust[i].name.equals(name)) {
        return cust[i];
      }
    }
    return null;
  }

  // method to search for a customer by account number
  public Customer searchByAcc(long acc, Customer[] cust) {
    for (int i = 0; i < cust.length; i++) {
      if (cust[i].acc == acc) {
        return cust[i].getAcc();
}
}
}
return -1;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of customers: ");
    int n = Integer.parseInt(br.readLine());
    Customer[] cust = new Customer[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Enter customer details (Name, Age, Gender, Account Number, PAN, Minimum Balance, Balance): ");
        String line = br.readLine();
        String[] details = line.split(",");
        cust[i] = new Customer(details[0], Byte.parseByte(details[1]), details[2], Long.parseLong(details[3]), details[4], Float.parseFloat(details[5]), Float.parseFloat(details[6]));
    }

    System.out.println("Enter your choice: 1. Display all customer details 2. Search by name 3. Search by account number");
    int choice = Integer.parseInt(br.readLine());

    switch (choice) {
        case 1:
            displayAllCustomers(cust);
            break;
        case 2:
            System.out.println("Enter name: ");
            String name = br.readLine();
            int acc = searchByName(cust, name);
            if (acc != -1) {
                System.out.println("Account number of customer " + name + " is " + acc);
            } else {
                System.out.println("Customer not found.");
            }
            break;
        case 3:
            System.out.println("Enter account number: ");
            acc = Long.parseLong(br.readLine());
            name = searchByAcc(cust, acc);
            if (name != null) {
                System.out.println("Name of customer with account number " + acc + " is " + name);
            } else {
                System.out.println("Customer not found.");
            }
            break;
        default:
            System.out.println("Invalid choice.");
            break;
    }
}
}

