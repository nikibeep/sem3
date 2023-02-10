import java.io.*;
import java.util.Scanner;

class DataTypeTesting {
  String name;
  byte age;
  Long accNo;
  char gender;
  short minBal;
  float bal;
  long custID;
  boolean pan;

  public void read() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try (Scanner scan = new Scanner(System.in)) {
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

public class Main1 {
  public static void main(String[] args) throws IOException {
    DataTypeTesting dtt = new DataTypeTesting();
    dtt.read();
    dtt.display();
  }
}
