package hust.soict.hedspi.aims.store;// Le Quang Khai 20225638
// Le Quang Khai 20225638
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final int MAX_CAPACITY = 1000;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>(MAX_CAPACITY);

    public void addMedia(Media media) {
        if (itemsInStore.size() < MAX_CAPACITY) {
            itemsInStore.add(media);
            System.out.println("The " + media.getClass().getSimpleName() + " " + media.getTitle() + " has been added to store");
        } else {
            System.out.println("The store is full!!!");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The " + media.getClass().getSimpleName() + " " + media.getTitle() + " has been removed from the store");
        } else {
            System.out.println("The " + media.getClass().getSimpleName() + " " + media.getTitle() + " doesn't exist in the store");
        }
    }
    public boolean checkInStore(String title){
        for(Media item : itemsInStore){
            if (title.compareTo(item.getTitle())==0)
                return true;
        }
        return false;
    }
    public Media searchItem(String title){

        for(Media item : itemsInStore){
            if(title.compareTo(item.getTitle())==0) return item;
        }
        return null;
    }

    public void displayAllMedia() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            System.out.println("Items in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                Media media = itemsInStore.get(i);
                System.out.println((i + 1) + ". " + media.getClass().getSimpleName() + ": " + media.getTitle());
            }
        }
    }

}

