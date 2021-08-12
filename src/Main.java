public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int accountReplenishment = 1500;
        int clientBonus = 100;

        int accruedBonuses = 0;
        if (accountReplenishment > 1000) {
            accruedBonuses = accountReplenishment / clientBonus;
        }
        System.out.println("Бонус:" + accruedBonuses);
        System.out.println("Итоговый счет:" + (currentAccount + accountReplenishment + accruedBonuses));
    }
}
