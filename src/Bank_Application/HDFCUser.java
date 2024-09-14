package Bank_Application;

public class HDFCUser implements BankInterface{
    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public String addMoney(int money) {
        return "";
    }

    @Override
    public String withDrawMoney(int money, String password) {
        return "";
    }

    @Override
    public float calculateInterest(int years) {
        return 0;
    }
}
