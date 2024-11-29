package hust.soict.hedspi.aims.media;// Lê Quang Khải 20225638

public class DigitalVideoDisc extends Disc implements Playable{

    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }


    public DigitalVideoDisc(String title) {
        super(title);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        super(category, title, cost);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(category, title, cost, director);
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(category, title, cost, director, length);
        this.setId(++nbDigitalVideoDiscs);
    }

    public boolean equals(DigitalVideoDisc disc) {
        return this.getTitle() == disc.getTitle();
    }

    //Method toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID:"+ getId()+" DigitalVideoDisc: " + getTitle() + " - " + getCategory() + " - $" + getCost() + " - Length: " + getLength() + " minutes";
    }

    public boolean isMatch(String title) {
        if (title == null || this.getTitle() == null) {
            return false; // Prevent null pointer exceptions
        }
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
