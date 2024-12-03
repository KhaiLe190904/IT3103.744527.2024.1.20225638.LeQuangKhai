package hust.soict.hedspi.aims;// Lê Quang Khải - 20225638

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aims {
    private static final Scanner scanner = new Scanner(System.in);
    private static int option;
    private static final Store store = new Store();
    private static final Cart cart = new Cart();

    public static void main(String[] args) {
        System.out.println("Lê Quang Khải 20225638");
        DigitalVideoDisc dvd = new
                DigitalVideoDisc("DVD title 1", "Action", 15.99F, 120);
        Book book = new
                Book(1, "Book title 1", "Fiction", 29.99f, Collections.singletonList("An"));
        store.addMedia(dvd);
        store.addMedia(book);
        handleShowMenu();
    }

    public static int optionReturn(int a, int b) {
        do {
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option < a | option > b);
        return option;
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void handleShowMenu() {
        while (true) {
            showMenu();
            switch (optionReturn(0, 3)) {
                case 1:
                    handleStoreMenu();
                    break;
                case 2:
                    handleUpdateStore();
                    break;
                case 3:
                    handleCartMenu();
                    break;
                default:
                    return;
            }
        }
    }

    //  after selecting showMenu - 1
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a medias details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void handleStoreMenu() {
        while (true) {
            System.out.println("---------------Items available in the store---------------");
            store.displayAllMedia();
            System.out.println("----------------------------------------------------------");
            storeMenu();
            switch (optionReturn(0, 4)) {
                case 1:
                    handleMediaDetailsMenu();
                    break;
                case 2:
                    handleAddMediaToCart();
                    break;
                case 3:
                    handlePlayMedia();
                    break;
                case 4:
                    handleCartMenu();
                    break;
                default:
                    return;
            }
        }
    }


    //  after selecting storeMenu - 1
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void handleMediaDetailsMenu() {
        System.out.print("Enter media's title: ");
        String itemName = scanner.nextLine();
        if (store.checkInStore(itemName)) System.out.println("Item found.");
        else {
            System.out.println("Item doesn't exist.");
            return;
        }
        Media item = store.searchItem(itemName);
        System.out.println(item.toString());
        mediaDetailsMenu();
        switch (optionReturn(0, 2)) {
            case 1:
                cart.addMedia(item);
                break;
            case 2:

                if (item instanceof CompactDisc itemTemp) {
                    itemTemp.play();
                    break;
                } else if (item instanceof DigitalVideoDisc itemTemp) {
                    itemTemp.play();
                    break;
                } else {
                    System.out.println("Cannot be played.");
                    break;
                }
            default:
        }
    }

    //    after selecting storeMenu - 2
    public static void handleAddMediaToCart() {
        System.out.print("Enter media's title: ");
        String itemName = scanner.nextLine();
        if (store.checkInStore(itemName)) System.out.println("Item found.");
        else {
            System.out.println("Item doesn't exist. Cannot add.");
            return;
        }
        Media item = store.searchItem(itemName);
        cart.addMedia(item);
    }

    //    after selecting storeMenu - 3
    public static void handlePlayMedia() {
        System.out.print("Enter media's title: ");
        String itemName = scanner.nextLine();
        if (store.checkInStore(itemName)) System.out.println("Item found.");
        else {
            System.out.println("Item doesn't exist. Cannot play.");
            return;
        }
        Media item = store.searchItem(itemName);
        if (item instanceof CompactDisc itemTemp) {
            itemTemp.play();
            return;
        }
        if (item instanceof DigitalVideoDisc itemTemp) {
            itemTemp.play();
            return;
        }
        System.out.println("Cannot be played.");
    }

    //    after selecting storeMenu - 4
    public static void handleViewCart() {
        cart.printAllMedia();
    }

    //after selecting showMenu - 2
    public static void handleUpdateStore() {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to store");
            System.out.println("2. Remove from store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            switch (optionReturn(0, 2)) {
                case 1:
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Add CD");
                    System.out.println("2. Add DVD");
                    System.out.println("3. Add Book");
                    System.out.println("0. Back");
                    System.out.println("--------------------------------");
                    System.out.println("Please choose a number: 0-1-2-3");
                    switch (optionReturn(0, 3)) {
                        case 1:
                            System.out.print("Enter CD's title: ");
                            String itemName = scanner.nextLine();
                            System.out.print("Enter CD's category: ");
                            String itemCategory = scanner.nextLine();
                            System.out.print("Enter CD's director: ");
                            String itemDirector = scanner.nextLine();
                            System.out.print("Enter CD's cost: ");
                            float itemCost = scanner.nextFloat();
                            System.out.print("Enter CD's length: ");
                            int length = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter CD's artist: ");
                            String artist = scanner.nextLine();

                            CompactDisc cd = new CompactDisc(itemCategory, itemName, itemCost, itemDirector, length, artist);
                            System.out.print("Enter CD's number of tracks: ");
                            int itemTrackNumber = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < itemTrackNumber; i++) {
                                System.out.format("Enter track %d name: ", i + 1);
                                String itemTrackName = scanner.nextLine();
                                System.out.format("Enter track %d length: ", i + 1);
                                int itemTrackLength = scanner.nextInt();
                                scanner.nextLine();
                                Track track = new Track(itemTrackName, itemTrackLength);
                                cd.addTrack(track);
                            }
                            store.addMedia(cd);
                            break;
                        case 2:
                            System.out.print("Enter DVD's title: ");
                            itemName = scanner.nextLine();
                            System.out.print("Enter DVD's category: ");
                            itemCategory = scanner.nextLine();
                            System.out.print("Enter DVD's director: ");
                            itemDirector = scanner.nextLine();
                            System.out.print("Enter DVD's length: ");
                            int itemLength = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter DVD's cost: ");
                            itemCost = scanner.nextFloat();
                            DigitalVideoDisc dvd = new DigitalVideoDisc(itemName, itemCategory, itemDirector, itemLength, itemCost);
                            store.addMedia(dvd);
                            break;
                        case 3:
                            System.out.print("Enter Book's title: ");
                            itemName = scanner.nextLine();
                            System.out.print("Enter Book's category: ");
                            itemCategory = scanner.nextLine();
                            System.out.print("Enter Book's cost: ");
                            itemCost = scanner.nextFloat();
                            Book book = new Book(itemName, itemCategory, itemCost);
                            System.out.print("Enter media's number of authors: ");
                            int itemAuthorNumber = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < itemAuthorNumber; i++) {
                                System.out.format("Enter author %d name: ", i + 1);
                                String itemAuthorName = scanner.nextLine();
                                book.addAuthor(itemAuthorName);
                            }
                            store.addMedia(book);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter media's name: ");
                    String itemName = scanner.nextLine();
                    if (store.checkInStore(itemName)) {
                        Media item = store.searchItem(itemName);
                        store.removeMedia(item);
                    } else {
                        System.out.println("Item doesn't exist. Cannot remove.");
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    //after selecting showMenu - 3
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void handleCartMenu() {
        cart.printAllMedia();
        cartMenu();
        switch (optionReturn(0, 5)) {
            case 1:
                System.out.println("Options: ");
                System.out.println("--------------------------------");
                System.out.println("1. Filter by id");
                System.out.println("2. Filter by title");
                System.out.println("0. Back");
                System.out.println("--------------------------------");
                System.out.println("Please choose a number: 0-1-2");
                switch (optionReturn(0, 2)) {
                    case 1:
                        System.out.println("Enter media's id: ");
                        int itemId = scanner.nextInt();
                        scanner.nextLine();
                        if (cart.checkInCart(itemId)) {
                            System.out.println("Item found.");
                            System.out.println(cart.searchByID(itemId).toString());
                        } else System.out.println("Item isn't in cart.");
                        break;
                    case 2:
                        System.out.println("Enter media's name: ");
                        String itemName = scanner.nextLine();
                        if (cart.checkInCart(itemName)) {
                            System.out.println("Item found.");
                            System.out.println(cart.searchByTitle(itemName).toString());
                        } else System.out.println("Item isn't in cart.");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Options: ");
                System.out.println("--------------------------------");
                System.out.println("1. Sort by title");
                System.out.println("2. Sort by cost");
                System.out.println("0. Back");
                System.out.println("--------------------------------");
                System.out.println("Please choose a number: 0-1-2");
                switch (optionReturn(0, 2)) {
                    case 1:
                        cart.sortTitle();
                        cart.printAllMedia();
                        break;
                    case 2:
                        cart.sortCost();
                        cart.printAllMedia();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("Enter media's name: ");
                String itemName = scanner.nextLine();
                if (cart.checkInCart(itemName)) {
                    System.out.println("Item found.");
                    Media md = cart.searchByTitle(itemName);
                    cart.removeMedia(md);
                } else System.out.println("Item isn't in cart. Cannot remove.");
                break;
            case 4:
                System.out.println("Enter media's name: ");
                itemName = scanner.nextLine();
                if (cart.checkInCart(itemName)) {
                    System.out.println("Item found.");
                    Media md = cart.searchByTitle(itemName);
                    if (md instanceof CompactDisc cdTemp) {
                        cdTemp.play();
                        break;
                    }
                    if (md instanceof DigitalVideoDisc dvdTemp) {
                        dvdTemp.play();
                        break;
                    }
                    System.out.println("Cannot be played.");
                    break;
                } else System.out.println("Item isn't in cart. Cannot play.");
                break;
            case 5:
                System.out.println("An order is created.");
                cart.cartEmpty();
                System.out.println("Current cart is: empty");
                cart.printAllMedia();
                break;
            default:
                break;
        }
    }
}


//        System.out.println("Lê Quang Khải - 20225638");

//        for(Media m: media){
//            System.out.println(m.toString());
//        }


//        Cart anOrder = new Cart();
//        // Create new dvd objects and add them to the cart
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
//                "Your Name", "Animation", "Roger Allers", 87, 19.95f);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
//                "Smile", "Science Fiction", "George Lucas", 87, 24.95f);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
//                "Animation", "Inside Out", 18.99f);
////        anOrder.addDigitalVideoDisc(dvd1, dvd2);
////        System.out.println("Id of dvd1: " +dvd1.getId());
////        System.out.println("Id of dvd2: " +dvd2.getId());
////        System.out.println("Id of dvd3: " +dvd3.getId());
//        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
//        anOrder.addDigitalVideoDisc(dvdList);
//        anOrder.printAllDisc();

