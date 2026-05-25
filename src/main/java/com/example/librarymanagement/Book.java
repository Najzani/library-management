package com.example.librarymanagement;
import jakarta.persistence.*;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String title;
    private String author;
    @Column(name ="publish_year" )
    private int year;

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
}
