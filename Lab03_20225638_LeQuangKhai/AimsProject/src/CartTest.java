// Lê Quang Khải 20225638
public class CartTest {

    public static void main(String[] args) {

        System.out.println("Lê Quang Khải - 20225638");
        Cart cart = new Cart();
        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "Your Name", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Smile", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Animation", "Inside Out", 18.99f);
//        cart.addDigitalVideoDisc(dvd1, dvd2);
//        System.out.println("Id of dvd1: " +dvd1.getId());
//        System.out.println("Id of dvd2: " +dvd2.getId());
//        System.out.println("Id of dvd3: " +dvd3.getId());
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        cart.addDigitalVideoDisc(dvdList);

        // print
        cart.printAllDisc();
//        // search by id
//        DigitalVideoDisc dvd4 = cart.searchById(4);
//        if(dvd4 == null){
//            System.out.println("Khong tim thay id cua dvd");
//        } else System.out.println("Search by id: " + dvd4.toString());
//
//        // search by title
//        DigitalVideoDisc dvd5 = cart.searchByTitle("Smile");
//        if(dvd5 == null){
//            System.out.println("Khong tim thay title nao phu hop");
//        } else System.out.println("Search by title: " + dvd5.toString());

    }
}
