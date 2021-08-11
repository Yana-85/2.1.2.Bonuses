public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int accountReplenishment = 1500;
        int clientBonus = 100;
        int accruedBonuses = accountReplenishment / clientBonus;

        if (accountReplenishment < 1000) {
            System.out.println("Итоговый счет:" + (currentAccount + accountReplenishment));

        } else {
            System.out.println("Итоговый счет:" + (currentAccount + accountReplenishment + accruedBonuses));
        }
    }

}