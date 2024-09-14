package Bank_Application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please create a user account");
        System.out.println("please provide username , initial Balance and password");

        String name = sc.nextLine();
        String password = sc.next();
        int initialBalance = sc.nextInt();
        SBIUser user1 = new SBIUser(name ,password ,initialBalance);
        System.out.println("Congratulations , account created successfully your account Number is: "+ user1.getAccountNumber());
        System.out.println("Enter the money that you want to addd ");
        int money = sc.nextInt();
         user1.addMoney(money);
        System.out.println("Your net balance is"+ user1.checkBalance());
        System.out.println("To withdraw money user have to enter password");
        String confirmPassword = sc.next();
        String netBalance =   user1.withDrawMoney(200 ,confirmPassword);
        System.out.println(netBalance);

    }
}
