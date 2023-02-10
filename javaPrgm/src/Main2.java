class DataTypeTesting {
  String name;
  byte age;
  Long accNo;
  char gender;
  short minBal;
  float bal;
  long custID;
  boolean pan;

  public DataTypeTesting() {
    // default constructor
  }
  
  public DataTypeTesting(String name, byte age, Long accNo, char gender, short minBal, float bal, long custID, boolean pan) {
    this.name = name;
    this.age = age;
    this.accNo = accNo;
    this.gender = gender;
    this.minBal = minBal;
    this.bal = bal;
    this.custID = custID;
    this.pan = pan;
  }
  
  public void read() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner scan = new Scanner(System.in);
    try {
      System.out.println("Enter the customer name:");
      name = br.readLine();

      System.out.println("Enter the customer age:");
      age = Byte.parseByte(br.readLine());

      System.out.println("Enter the customer bank account number:");
      accNo = Long.parseLong(br.readLine());

      System.out.println("Enter the gender:");
      gender = scan.next().charAt(0);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } finally {
      scan.close();
    }

    System.out.println("Enter the Minimum balance:");
    minBal = Short.parseShort(br.readLine());

    System.out.println("Enter the Balance amount:");
    bal = Float.parseFloat(br.readLine());

    System.out.println("Enter the customer ID:");
    custID = Long.parseLong(br.readLine());

    System.out.println("Enter PAN:");
    pan = Boolean.parseBoolean(br.readLine());
  }

  public void read(String name, byte age, Long accNo, char gender, short minBal, float bal, long custID, boolean pan) {
    this.name = name;
    this.age = age;
    this.accNo = accNo;
    this.gender = gender;
    this.minBal = minBal;
    this.bal = bal;
    this.custID = custID;
    this.pan = pan;
  }

  public void display() {
    System.out.println("Customer name = " + name);
    System.out.println("Customer age = " + age);
    System.out.println("Customer Account number = " + accNo);
    System.out.println("Customer gender = " + gender);
    System.out.println("Customer Minimum balance = " + minBal);
    System.out.println("Customer Account Balance = " + bal);
    System.out.println("Customer Customer ID = " + custID);


  public void display() {
    System.out.println("Customer name = " + name);
    System.out.println("Customer age = " + age);
    System.out.println("Customer Account number = " + accNo);
    System.out.println("Customer gender = " + gender);
    System.out.println("Customer Minimum balance = " + minBal);
    System.out.println("Customer Account Balance = " + bal);
    System.out.println("Customer Customer ID = " + custID);
    System.out.println("Customer PAN = " + pan);
  }
}

public class Main2 {
  static DataTypeTesting dtt = new DataTypeTesting();

  public static void main(String[] args) throws IOException {
    int choice;
    try (Scanner scan = new Scanner(System.in)) {
        do {
          System.out.println("\nMenu:");
          System.out.println("1. Read data");
          System.out.println("2. Display data");
          System.out.println("3. Exit");
          System.out.println("Enter your choice:");
          choice = scan.nextInt();

          switch(choice) {
            case 1:
              dtt.read();
              break;
            case 2:
              dtt.display();
              break;
            case 3:
              System.exit(0);
              break;
            default:
              System.out.println("Invalid choice. Please try again.");
          }
        } while(choice != 3);
    }
  }
}
