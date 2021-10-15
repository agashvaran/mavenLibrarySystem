package com.company;

public abstract class AnalogueItems extends LibraryItems implements Borrow, Read {
    //Attributes
//    private String analogueItemType;

    //Constructors

    public AnalogueItems(String libraryItemName){
        super(libraryItemName);

    }

    //Methods
    public abstract String flickThrough();

}
