package hust.soict.hedspi.aims.media;
import java.util.Comparator;
// 20225638 - Le Quang Khai

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        // Compare by cost in descending order
        int costComparison = Float.compare(media2.getCost(), media1.getCost());

        // If costs are equal, compare by title in ascending order
        if (costComparison == 0) {
            return media1.getTitle().compareTo(media2.getTitle());
        }

        return costComparison;
    }

}
