public class Main {

    public static void main(String[] args) {
        int ticketPrice = 145678;
        int priceOfOneMile = 20;

        int bonusMiles = ticketPrice / priceOfOneMile;

        System.out.println("Количество начисленных миль:" + bonusMiles);

    }
}
