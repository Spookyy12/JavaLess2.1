public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int bonus = 0;
        int repl = 200;

        if (repl > 999) {
            bonus = repl/100;
        } else {
            bonus = 0;
        }
        balance = balance + repl + bonus;
        System.out.println(Bonus);
        System.out.println(Balance);

    }
}
