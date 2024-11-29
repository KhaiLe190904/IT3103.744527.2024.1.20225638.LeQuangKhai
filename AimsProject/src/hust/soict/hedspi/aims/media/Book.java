package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

// Le Quang Khai 20225638
public class Book extends Media{

     private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    // Method to add an author
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println(authorName + " added as an author.");
        } else {
            System.out.println(authorName + " is already in the list.");
        }
    }

    // Method to remove an author
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println(authorName + " removed as an author.");
        } else {
            System.out.println(authorName + " is absent in the list.");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: "+ getId()+"Book: " + getTitle() + " - " + getCategory() + " - $" + getCost() + " - Authors: " + authors;
    }
}
