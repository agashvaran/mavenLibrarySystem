

import java.util.ArrayList;

public abstract class LibraryItems{
    //Attributes
    private String libraryItemName;


    //Constructors

    public LibraryItems(String libraryItemName){

        this.libraryItemName = libraryItemName;
    }

//    public LibraryItems(String libraryItemName, ArrayList<LibraryItems> allItems){
//        super(allItems);
//        this.libraryItemName = libraryItemName;
//    }

    //Methods
    public abstract String use();

    public abstract String reserve();

    public abstract String getLibraryItemName();

}
