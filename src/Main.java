public class Main {
    public static void main(String[] args) {
        int amount = 15_036;
        int mile = 1;
        int waste = 20;

        int bonus = amount / waste * mile;
        System.out.println("Бесплатные мили: "+ bonus);

    }
}