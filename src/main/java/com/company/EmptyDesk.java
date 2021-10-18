package com.company;

public class EmptyDesk extends LibraryItems {
    //Attributes
    private String deskNumber;

    //Constructors
    public EmptyDesk(String deskNumber, String libraryItemName){
        super(libraryItemName);
        this.deskNumber = deskNumber;
    }

    public EmptyDesk(String deskNumber){
        super("com.company.EmptyDesk");
        this.deskNumber = deskNumber;
    }

    //Methods


    @Override
    public String toString() {
        return "EmptyDesk{" +
                "deskNumber='" + deskNumber + '\'' +
                '}';
    }

    public String use(){
        return "setting up my stuff on the emptydesk...";
    }

    public String reserve(){
        return "emptydesk reserved";
    }

    public String usePersonalDevice(){
        return "using my personal laptop...";
    }

    public String getLibraryItemName() {
        return "Desk " + deskNumber;
    }
}
