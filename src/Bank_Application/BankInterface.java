package Bank_Application;

public interface BankInterface {
    int checkBalance();
    String addMoney(int money);
    String withDrawMoney(int money, String password);
    float calculateInterest(int years);

}
