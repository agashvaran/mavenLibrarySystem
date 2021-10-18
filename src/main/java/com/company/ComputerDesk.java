package com.company;

public class ComputerDesk extends LibraryItems {
    //Attributes
    private String computerDeskNumber;

    //Constructors
    public ComputerDesk(String computerDeskNumber, String libraryItemName){
        super(libraryItemName);
        this.computerDeskNumber = computerDeskNumber;
    }

    public ComputerDesk(String computerDeskNumber){
        super("com.company.EmptyDesk");
        this.computerDeskNumber = computerDeskNumber;
    }

    //Methods


    @Override
    public String toString() {
        return "ComputerDesk{" +
                "computerDeskNumber='" + computerDeskNumber + '\'' +
                '}';
    }

    public String use(){
        return "sitting down in front of the computer desk";
    }

    public String reserve(){
        return "computer desk has been reserved.";
    }

    public String logIn(){
        return "logging in to library computer";
    }

    public String logOut(){
        return "logging out of library computer";
    }

    public String getLibraryItemName() {
        return "Computer " + computerDeskNumber;
    }
}
