package Bank_Application;

import java.util.UUID;

public class SBIUser implements BankInterface{

    private  String name;
    private String password;
    private int balance;
    private String accountNumber;
    private static float rateOfInterest;
     SBIUser(String name , String password , int balance){
              this.name = name;
              this.password = password;
              this.balance = balance;
              this.accountNumber =  String.valueOf(UUID.randomUUID());
     }
  public String getAccountNumber(){
         return accountNumber;
  }
    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
         balance = balance + money;
        return ("Money Added Successfully"+money +"is credited to your account and the total balance is"+ balance);
    }

    @Override
    public String withDrawMoney(int money, String password) {
         if(password.equals(this.password)){
             if(balance>money){
                 balance = balance - money;
                 return ("Money withdraw Successfully"+money +"is debited from your account and the total balance is"+ balance);

             }
             else{
                 return "Insufficient Balance";
             }

         }
         else {
             return "Invalid User";
         }

    }

    @Override
    public float calculateInterest(int years) {
        float interest = balance*years*rateOfInterest/100;

        return interest;    }


}
