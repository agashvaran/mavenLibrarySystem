package com.company;

import com.company.Borrow;

public abstract class DigitalItems extends LibraryItems implements Borrow {
    //Attributes
//    private String digitalItemType;


    //Constructors
    public DigitalItems(String libraryItemName){
        super(libraryItemName);
    }

    //Methods
    public String play(){
        return "Playing digital Item";
    };
}
