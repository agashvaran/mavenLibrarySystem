package com.company;

import com.company.AnalogueItems;

public class Books extends AnalogueItems {
    //Attributes
    private String title;
    private String author;
    private String type;

    //Constructors
    public Books(String title, String author, String type,String libraryItemName){
        super(libraryItemName);
        this.title = title;
        this.author = author;
        this.type = type;
    }

//    public Books(String title, String author, String type){
//        super("Book");
//        this.title = title;
//        this.author = author;
//        this.type = type;
//
//    }
//
//    public Books(String title, String author){
//        super("Book");
//        this.title = title;
//        this.author = author;
//    }
//
//    public Books(String title){
//        super("Book");
//        this.title = title;
//        this.author = "Unknown";
//    }

    //Methods

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String readBlurb(){
        return "blurb blurb nice blurb";
    }

    public String use(){
        return "override this with read for books";
    }

    public String reserve(){
        return "this book has been reserved";
    }

    public String flickThrough(){
        return "flicking through book...done.";
    }

    public String borrow(){
        return "book is loaned to you for a week";
    }


    public String read(){
        return "reading book...start.";
    }

    public String getLibraryItemName() {
        return "Book: " + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
