package hust.soict.hedspi.aims.media;

import java.util.Comparator;
// Lê Quang Khải 20225638
public class MediaComparatorByTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
