package hust.soict.hedspi.aims.media;
// Le Quang Khai - 20225638
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    // Constructor
    public CompactDisc( String title, String category, float cost, String director, int length, String artist) {
        super(title, category, cost, director, length);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    // Method to add a track
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println(track.getTitle() + " added to the CD.");
        } else {
            System.out.println(track.getTitle() + " is already in the CD.");
        }
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle() + " removed from the CD.");
        } else {
            System.out.println(track.getTitle() + " is not in the CD.");
        }
    }

    // Method to get the total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }


    @Override
    public void play() {
        System.out.println("Information of Compact Disc : \n");
        System.out.println("CD artist: " + getArtist());
        for (Track track : tracks) {
            track.play();
        }

    }
}
