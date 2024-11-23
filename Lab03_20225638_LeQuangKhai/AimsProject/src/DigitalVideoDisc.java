// Lê Quang Khải 20225638

public class DigitalVideoDisc {

    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public boolean equals(DigitalVideoDisc disc) {
        return this.getTitle() == disc.getTitle();
    }

    //Method toString
    public String toString(){
        return String.format("DVD - %s - %s - %s - %d minutes : %.2f $",title, category, director, length, cost);
    }

    public boolean isMatch(String title) {
        if (title == null || this.title == null) {
            return false; // Prevent null pointer exceptions
        }
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}
