package com.company;

public abstract class AnalogueItems extends LibraryItems implements Borrow, Read {
    //Attributes

    //Constructors

    public AnalogueItems(String libraryItemName){
        super(libraryItemName);

    }

    //Methods
    public abstract String flickThrough();

}
