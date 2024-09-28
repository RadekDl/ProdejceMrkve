public class Main {
    public static void main(String[] args) {
        System.out.println("Podejce biomrkve");

        Dealers firstDealers = new Dealers();           // první prodejce
        firstDealers.setName("Karel Vála");
        System.out.println(firstDealers.getName());
        Dealers firstCity = new Dealers();
        firstCity.setCity("Brno");
        System.out.println(firstCity.getCity());

        Dealers secondDealers = new Dealers();          // druhý prodejce
        secondDealers.setName("Pavel Mrkva");
        System.out.println(secondDealers.getName());
        Dealers secondCity = new Dealers();
        secondCity.setCity("Praha");
        System.out.println(secondCity.getCity());

    }
}