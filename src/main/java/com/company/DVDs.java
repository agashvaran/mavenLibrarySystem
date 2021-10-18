package com.company;

public class DVDs extends DigitalItems {
    //Attributes
    private String title;


    //Constructors
    public DVDs(String title, String libraryItemName){
        super(libraryItemName);
        this.title = title;
    }

    public DVDs(String title){
        super("com.company.DVDs");
        this.title = title;
    }

    //Methods


    @Override
    public String toString() {
        return "DVDs{" +
                "title='" + title + '\'' +
                '}';
    }

    public String use(){
        return "override with play for DVD";
    }

    public String reserve(){
        return "this DVD has been reserved";
    }

//    public String play(){
//        return "playing DVD...";
//    }

    public String borrow(){
        return "DVD is loaned to you for a week.";
    }

    public String getLibraryItemName() {
        return title;
    }
}
