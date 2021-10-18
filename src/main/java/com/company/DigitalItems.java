package com.company;

public abstract class DigitalItems extends LibraryItems implements Borrow {
    //Attributes


    //Constructors
    public DigitalItems(String libraryItemName){
        super(libraryItemName);
    }

    //Methods
    public String play(){
        return "Playing digital Item";
    };
}
