import java.io.*;
import java.util.Scanner;

class Customer {
   		// data members
   		String name;
   		byte age;
    	long acc;
    	char gender;
    	short minbal;
    	float bal;
   		boolean pan;
		// default constructor
		public Customer() {
			name = "";
        	age = 0;
        	acc = 0;
        	gender = ' ';
        	minbal = 0;
        	bal = 0;
        	pan = false;
    	}

    	public Customer(String name) {
        	this.name = name;
   	 	}

    	public Customer(String name, long acc) {
        	this(name);
        	this.acc = acc;
    	}

    	// member function
    	public void read() throws IOException {
        	InputStreamReader isr = new InputStreamReader(System.in);
        	BufferedReader br = new BufferedReader(isr);
       		try (Scanner scan = new Scanner(System.in)) {

        	System.out.println("Enter the customer name:");
        	name = br.readLine();
       		System.out.println("Enter the customer age:");
        	age = Byte.parseByte(br.readLine());
        	System.out.println("Enter the account number:");
        	acc = Long.parseLong(br.readLine());
        	System.out.println("Enter the minimum balance:");
        	minbal = Short.parseShort(br.readLine());
        	System.out.println("Enter the balance amount:");
        	bal = Float.parseFloat(br.readLine());
        	System.out.println("Enter the customer gender:");
        	gender = (char) br.read();
        	System.out.println("Do you have Pan Card:");
        	pan = Boolean.parseBoolean(br.readLine());
			}
    	}

    	public void disp() {
        	System.out.println("Customer Name: " + name);
        	System.out.println("Customer Age: " + age);
        	System.out.println("Account Number: " + acc);
        	System.out.println("Gender: " + gender);
        	System.out.println("PAN: " + pan);
    	}

    	public boolean search(String csname) {
        	boolean f = false;
        	if (name.equals(csname)) {
            	f = true;
       		}
        	return f;
    	}

    	public boolean search(long accNo) {
        	boolean f = false;
       	 	if (acc == accNo) {
            f = true;
        	}
        	return f;
    	}
}

public class DataTypeTesting {
	private static int res1;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        boolean ch = true;
        byte res, b1, temp = 0;
        String sname;
        Customer[] obj = new Customer[3];
    	while (ch) {
            	System.out.println("1. Read data");
            System.out.println("2. Display data");
            System.out.println("3. Search");
            System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			res = Byte.parseByte(br.readLine());
			switch (res) {
				case 1:
					for (byte i = 0; i < 3; i++) {
						obj[i] = new Customer();
						obj[i].read();
					}
					break;
				case 2:
					for (byte i = 0; i < 3; i++) {
						obj[i].disp(); // calling member function
					}
					break;
				case 3:
					System.out.println("1.Search by Name");
					System.out.println("2.Search by account no.");
					res1 = Byte.parseByte(br.readLine());
					switch (res1) {
						case 1:
							System.out.println("Enter the name to search:");
							sname = br.readLine();
							for (byte i = 0; i < 3; i++) {
								if (obj[i].search(sname) == true) {
									obj[i].disp();
									break;
								}
							}
							break;
						case 2:
							System.out.println("Enter the Account No. to search:");
							b1 = Byte.parseByte(br.readLine());
							for (byte i = 0; i < 3; i++) {
								if (obj[i].search(b1) == true) {
									obj[i].disp();
									break;
								}
							}
							break;
								case 3:
									System.out.println("1.Search by Name");
									System.out.println("2.Search by account no.");
									res1 = Byte.parseByte(br.readLine());
									switch (res1) {
										case 1:
											System.out.println("Enter the name to be searched:");
											sname = br.readLine();
											for (byte i = 0; i < 3; i++) {
												if (obj[i].search(sname) == true) {
													temp = 1;
													obj[i].disp();
												}
											}
											if (temp == 0) {
												extracted();
											}
											break;
										default:
											System.out.println("Invalid choice");
											break;
									}
				case 4:
						ch = false;
						break;
							}
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
	}
	private static void extracted() {
		System.out.println("Record doesn't exist");
	}
}

