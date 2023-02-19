import java.util.Scanner;
public class Account 
{
    String custName;
    public int accno;
    private float balance;
    Account()
    {
        custName="";
        accno=-1;
    }
    Account(String custName)
    {
        this.custName=custName;
    }
    Account(String custName,int accno)
    {
        this(custName);
        this.accno=accno;
    }  
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        custName=sc.nextLine();
        System.out.println("Enter Number:");
        accno=sc.nextInt();
    }
    public static void main(String args[])
    {
        Account obj1=new Account();
        obj1.read();
        Account obj4=new Account();
        Account obj2=new Account(obj1.custName);
        Account obj3=new Account(obj1.custName,obj1.accno);
        LoanAccount la1=new LoanAccount();
        la1.read();
        LoanAccount la2=new LoanAccount();
        LoanAccount la3=new LoanAccount(la1.custName,la1.accno,la1.intRate,la1.amountSanc);

        CarLoan cl1=new CarLoan();
        cl1.read();
        CarLoan cl2=new CarLoan(cl1.custName, cl1.accno, cl1.intRate, cl1.amountSanc, cl1.carCompany, cl1.carModel, cl1.carCost);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\n\nNo parameter:\nname:\t"+obj4.custName+"\nAcc No:\t"+obj4.accno);
        System.out.println("\n\nOne parameter:\nname:\t"+obj2.custName+"\nAcc No:\t"+obj2.accno);
        System.out.println("\n\nTwo parameter:\nname:\t"+obj3.custName+"\nAcc No:\t"+obj3.accno);
        System.out.println("\n\nLoan details:");
        System.out.println("Loan account default parameter:\nname:\t"+la2.custName+"\nAcc No:\t"+la2.accno+"\nInterest:\t"+la2.intRate+"\nAmount Sanctioned:\t"+la2.amountSanc);
        System.out.println("\n4 parameter:\nname:\t"+la3.custName+"\nAcc No:\t"+la3.accno+"\nInterest:\t"+la3.intRate+"\nAmount Sanctioned:\t"+la3.amountSanc);
        System.out.println("\n\nCar loan Details:");
        System.out.println("\nname:\t"+cl2.custName+"\nAcc No:\t"+cl2.accno+"\nInterest:\t"+cl2.intRate+"\nAmount Sanctioned:\t"+cl2.amountSanc+"\nCar Model:\t"+cl2.carModel+"\nCar Company:\t"+cl2.carCompany+"\nCar Cost:\t"+cl2.carCost);
    }
    
}

class LoanAccount extends Account
{
    float intRate;
    int amountSanc;
    public LoanAccount()
    {
        super();
        intRate=(float)0.0;
        amountSanc=0;
    }
    public LoanAccount(String custName,int accno,float intRate,int amount)
    {
        super(custName,accno);
        this.intRate=intRate;
        amountSanc=amount;
    }
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter the Interest rate:");
        intRate=sc.nextFloat();
        System.out.println("enter the maximum amount sanctioned:");
        amountSanc=sc.nextInt();
    }
}
class CarLoan extends LoanAccount
{
    String carCompany;
    String carModel;
    int carCost;
    CarLoan()
    {}

    CarLoan(String custName,int accno,float intRate,int amount,String comp, String model,int cost)
    {
        super(custName,accno,intRate,amount);
        carCompany=comp;
        carModel=model;
        carCost=cost;

    }

    public void read()
    {
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter the Company:");
        carCompany=sc.next();
        System.out.println("enter the Car Model:");
        carModel=sc.next();
        System.out.println("Enter the cost");
        carCost=sc.nextInt();
    }
}