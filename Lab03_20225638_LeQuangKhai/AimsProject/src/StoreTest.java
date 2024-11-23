// Le Quang Khai - 20225638
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "Your Name", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Smile", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Inside Out" , "Animation", "Le Quang Khai", 100, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(
                "Inception", "Action", "Christopher Nolan", 148, 29.95f);
        // Test addDVD
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        // Display store items
        store.displayStore();
        // Test removeDVD
        store.removeDVD(dvd2);
        // Display store items again
        store.displayStore();
        // Test removing a DVD not in store
        store.removeDVD(dvd2);
    }
}
