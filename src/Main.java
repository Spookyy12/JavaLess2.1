public class Main {
    public static void main(String[] args) {

        int Balance = 100;
        int Bonus = 0;
        int Repl = 200;

        if (Repl > 999) {
            Bonus = Repl/100;
        } else {
            Bonus = 0;
        }
        Balance = Balance + Repl + Bonus;
        System.out.println(Bonus);
        System.out.println(Balance);

    }
}