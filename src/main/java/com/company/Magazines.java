package com.company;

import com.company.AnalogueItems;

public class Magazines extends AnalogueItems {
    //Attributes
    private String title;

    //Constructors
    public Magazines(String title, String libraryItemName){
        super("Magazine");
        this.title = title;
    }

    public Magazines(String title){
        super("Magazine");
        this.title = title;
    }

    //Methods


    @Override
    public String toString() {
        return "com.company.Magazines{" +
                "title='" + title + '\'' +
                '}';
    }

    public String use(){
        return "override to read magazine";
    }

    public String reserve(){
        return "reserved magazine";
    }

    public String getLibraryItemName() {
        return title;
    }

    public String flickThrough(){
        return "flicking through magazine";
    }

    public String borrow(){
        return "magazine loaned to you for a week";
    }

    public String read(){
        return "reading magazine...";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
