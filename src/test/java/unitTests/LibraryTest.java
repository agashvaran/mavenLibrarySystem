package unitTests;

import com.company.AudioBooks;
import com.company.Library;
import com.company.LibraryItems;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testGetPostcodeMethod(){
        ArrayList<LibraryItems> libraryStock = new ArrayList<>();
        Library myLibrary = new Library("LE11 3UG", libraryStock);
        assertEquals("The library was not the same","LE11 3UG",myLibrary.getPostCode());
    }

    @Test
    public void testGetItemsMethod(){
        ArrayList<LibraryItems> libraryStock = new ArrayList<>();
        Library myLibrary = new Library("LE11 3UG", libraryStock);
        assertEquals("The library was not the same",libraryStock,myLibrary.getItems());
    }



}
