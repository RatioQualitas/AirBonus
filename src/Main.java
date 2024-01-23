public class Main {

    public static void main(String[] args) {
        int ticket_price = 145678;
        int price_of_one_mile = 20;

        int bonus_miles = ticket_price / price_of_one_mile;

        System.out.println("Количество начисленных миль:" + bonus_miles);

    }
}
