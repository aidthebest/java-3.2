public class Main {
    public static void main(String[] args) {

        int initialBalanceInKopecks = 200_74;
        int depositAmountInKopecks = 1380_17;

        double bonusInKopecks = depositAmountInKopecks > 1000_00 ? ((depositAmountInKopecks / 100_00) * 1_00) : 0;

        System.out.print("Текущий баланс - " + (initialBalanceInKopecks + depositAmountInKopecks + bonusInKopecks) / 1_00 + " рублей");


    }
}