package hust.soict.hedspi.aims.store;// Le Quang Khai 20225638

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> itemsInStore;

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>();
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd == null) {
            System.out.println("Cannot add a null DVD to the store.");
            return;
        }
        itemsInStore.add(dvd);
        System.out.println("Le Quang Khai - 20225638 - Added DVD: " + dvd.getTitle());
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        if (dvd == null || !itemsInStore.contains(dvd)) {
            System.out.println("DVD not found in the store.");
            return;
        }
        itemsInStore.remove(dvd);
        System.out.println("Le Quang Khai - 20225638 - Removed DVD: " + dvd.getTitle());
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("\nLe Quang Khai - 20225638 - Current DVDs in hust.soict.hedspi.aims.store.Store:");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd);
            }
        }
    }
}

