package hust.soict.hedspi.aims.media;

import java.util.Comparator;
// 20225638 - Le Quang Khai
public class MediaComparatorByTitleCost implements Comparator<Media>{

    @Override
    public int compare(Media media1, Media media2) {
        // Compare by title in ascending order
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        // If titles are equal, compare by cost in descending order
        if (titleComparison == 0) {
            return Float.compare(media2.getCost(), media1.getCost());
        }

        return titleComparison;
    }

}
