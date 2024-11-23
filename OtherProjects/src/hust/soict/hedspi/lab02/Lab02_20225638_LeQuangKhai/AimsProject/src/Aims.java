public class Aims {
    public static void main(String[] args) {
        System.out.println("Le Quang Khai - 20225638");
        Cart newOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Your Name", "Animation",
                "Shinkai Makoto", 110, 19.95f);
        newOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Avengers: End Game", "Science Fiction",
                "Joe Russo", 180, 24.95f);
        newOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Inside Out 2",
                "Animation", "Kelsey Mann", 19.99f);
        newOrder.addDigitalVideoDisc(dvd3);

        // print cart after add 3 disc
        System.out.println("LQK - 20225638 - Print cart after add 3 disc");
        newOrder.printAllDisc();
        // Remove the Disc "Your Name"
        newOrder.removeDigitalVideoDisc(dvd1);
        //  print cart after remove disc "Your Name"
        System.out.println("LQK - 20225638 - Print cart after remove disc Your Name");
        newOrder.printAllDisc();
    }
}
