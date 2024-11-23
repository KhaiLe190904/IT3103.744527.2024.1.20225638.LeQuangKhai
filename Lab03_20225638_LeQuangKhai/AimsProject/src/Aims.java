// Lê Quang Khải - 20225638

public class Aims {
    public static void main(String[] args) {
        System.out.println("Lê Quang Khải - 20225638");
        Cart anOrder = new Cart();
        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "Your Name", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Smile", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Animation", "Inside Out", 18.99f);
//        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
//        anOrder.addDigitalVideoDisc(dvdList);
//        anOrder.addDigitalVideoDisc(dvd1, dvd2);
//        anOrder.printAllDisc();
        System.out.println("Id of dvd1: " +dvd1.getId());
        System.out.println("Id of dvd2: " +dvd2.getId());
        System.out.println("Id of dvd3: " +dvd3.getId());
    }
}
