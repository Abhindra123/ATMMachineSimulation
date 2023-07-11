import java.io.*;
import java.util.*;

class getBalance{
    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    private int amt=10000;
    public void display(int amt){
        System.out.println("the balance is "+amt);
    }

}

public class Atm {


    public static void main(String[] args) {
  try {

      Scanner sc = new Scanner(System.in);

          System.out.println("Enter choice 1 to deposit and 2 to withdraw and 3 to checkbalance :");
          int choice;
          int fin;
          int b1;
          int f;
      getBalance gb = new getBalance();

do {
choice=sc.nextInt();
    if (choice == 1) {
        System.out.println("Enter an amount to deposit:");
        int deposit = sc.nextInt();
        f=gb.getAmt();
         b1 = gb.getAmt();
         fin = b1 + deposit;
        gb.setAmt(fin);
        gb.display(fin);
        System.out.println("Amount deposited successfully");
    }
     else if(choice==2){
        System.out.println("Enter an amount to withdrawal:");
        int balance = sc.nextInt();
      f=gb.getAmt();
        checkAmount(balance,f);
    }
     else if(choice==3){
        f=gb.getAmt();
    checkBalance(f);
    }
    else{
        break;
    }
}while (true);

  }
  catch (InvalidAmountException exception){
      System.out.println(exception.getMessage());
  }
  catch (InsufficientFundsException e){
      System.out.println(e.getMessage());
  }
    }
    public static void checkAmount(int balance,int camt) throws InsufficientFundsException,InvalidAmountException {

        if (balance>camt){
    throw new InsufficientFundsException("Insufficient funds");
        }
         if(balance<0){
            System.out.println("invalid entry ");
        }
else {

            System.out.println("you can proceed and uour current balance is :"+(camt-balance));

        }

    }
    public static void checkBalance(int cc){
        System.out.println("the current balance is:"+cc);
    }

//    public static void verifyAmount(int balance) throws InvalidAmountException{
//        if(balance<0){
//            throw new InvalidAmountException("Invalid entry");
//        }
//        else{
//            System.out.println("Valid amount");
//        }
//    }



}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String str){
        super(str);
    }
}
class InvalidAmountException extends Exception{
    public  InvalidAmountException (String str){
        super(str);
    }
}