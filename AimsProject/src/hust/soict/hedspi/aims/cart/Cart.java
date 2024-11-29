package hust.soict.hedspi.aims.cart;// Lê Quang Khải 20225638
// Le Quang Khai 20225638
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); // collection of Media objects

    // Method to add any type of Media to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The " + media.getClass().getSimpleName() + " " + media.getTitle() + " has been added");
            System.out.println("Number of Medias in current cart: "+itemsOrdered.size());
        } else {
            System.out.println("The cart is full!!!");
        }
    }

    // Method to remove any type of Media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The " + media.getClass().getSimpleName() + " " + media.getTitle() + " has been removed from the cart");
        } else {
            System.out.println("The " + media.getClass().getSimpleName() + " " + media.getTitle() + " doesn't exist in the cart");
        }
    }

    // Method to calculate the total cost of all items in the cart
    public float totalCost() {
        float cost = 0f;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }
        return cost;
    }

    // Method to print all information about items in the cart
    public void printAllMedia() {
        System.out.println("\n***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    public boolean checkInCart(int id){
        for(Media item : itemsOrdered)
            if(id==item.getId()) return true;
        return false;
    }

    public boolean checkInCart(String title){
        for(Media item : itemsOrdered)
            if(title.compareTo(item.getTitle())==0) return true;
        return false;
    }


    // Method to search for a Media item by ID
    public Media searchByID(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null;
    }

    // Method to search for a Media item by title
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void cartEmpty(){
        for(Media item:itemsOrdered)
            removeMedia(item);
    }

}
