public class Main {
    public static void main(String[] args) {
        System.out.println("Podejce biomrkve");

        Dealer firstDealer = new Dealer();           // první prodejce
        firstDealer.setName("Karel Vála");
        System.out.println(firstDealer.getName());
        Dealer firstCity = new Dealer();
        firstCity.setCity("Brno");
        System.out.println(firstCity.getCity());

        Dealer secondDealer = new Dealer();          // druhý prodejce
        secondDealer.setName("Pavel Mrkva");
        System.out.println(secondDealer.getName());
        Dealer secondCity = new Dealer();
        secondCity.setCity("Praha");
        System.out.println(secondCity.getCity());

    }
}