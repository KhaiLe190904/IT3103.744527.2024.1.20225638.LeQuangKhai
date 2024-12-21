package hust.soict.hedspi.aims;

import java.util.Scanner;

import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.exception.DuplicatedItemException;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.screen.CartScreen;
import hust.soict.hedspi.aims.screen.StoreScreen;
import hust.soict.hedspi.aims.store.Store;
public class Aims {

	private static Scanner sc;
	private static Store store;
	private static Cart cart;
	private static StoreScreen storeScreen;
	private static CartScreen cartScreen;

	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();

		Media[] sampleMedia = new Media[] {
				new DigitalVideoDisc("Hoàng Hôn Tháng Tám", "Pop", "Hà Anh Tuấn", 125, 31.5f),
				new DigitalVideoDisc("Cơn Mưa Tình Yêu", "Romance", "Hà Anh Tuấn", 91, 94.63f),
				new DigitalVideoDisc("Gửi Anh Và Cô Ấy", "Drama", "Hương Tràm", 96, 47.38f),
				new CompactDisc("Chúng Ta Của Hiện Tại", "Pop", "Sơn Tùng M-TP", "M-TP Entertainment", 70.18f) {{
					addTrack(new Track("Muộn Rồi Mà Sao Còn", 5));
					addTrack(new Track("Chúng Ta Của Hiện Tại", 5));
					addTrack(new Track("Chúng Ta Của Tương Lai", 5));
				}},
				new CompactDisc("See Tình", "Pop", "Hoàng Thùy Linh", "DTAP", 93.03f) {{
					addTrack(new Track("See Tình", 3));
					addTrack(new Track("Gieo Quẻ", 4));
					addTrack(new Track("Để Mị Nói Cho Mà Nghe", 4));
				}},
				new Book("Ngày Trôi Về Phía Cũ", "Romance", 26.07f) {{
					addAuthor("Anh Khang");
				}},
				new Book("Mắt Biếc", "Drama", 37.82f) {{
					addAuthor("Nguyễn Nhật Ánh");
				}},
				new CompactDisc("Motomami", "Pop", "Rosalía", "Columbia Records", 22.22f) {{
					addTrack(new Track("Saoko", 2));
					addTrack(new Track("La Fama", 3));
					addTrack(new Track("Candy", 4));
				}},
				new Book("Những Người Khốn Khổ", "Literature", 69.96f) {{
					addAuthor("Victor Hugo");
				}}
		};
		 // Lê Quang Khải 20225638
		for (Media m : sampleMedia) {
			try {
				store.addMedia(m);
			} catch (DuplicatedItemException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		openStoreScreen();
	}

	public static Store getStore() {
		return store;
	}

	public static Cart getCart() {
		return cart;
	}

	public static StoreScreen getStoreScreen() {
		return storeScreen;
	}

	public static CartScreen getCartScreen() {
		return cartScreen;
	}
	
	public static void openStoreScreen() {
		storeScreen = new StoreScreen(store);
	}
	
	public static void closeStoreScreen() {
		storeScreen.setVisible(false);
		storeScreen = null;
	}
	
	public static void openCartScreen() {
		cartScreen = new CartScreen(cart);
	}
	
	public static void closeCartScreen() {
		cartScreen.setVisible(false);
		cartScreen = null;
	}
	
}
