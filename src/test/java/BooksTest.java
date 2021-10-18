

import com.company.Books;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void testBookGetTitleMethod(){
        Books testBook = new Books("Wolves Of The Plains");
        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
    }

    @Test
    public void testReadBlurbMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The blurb was not the same","blurb blurb nice blurb",testBook.readBlurb());
    }

    @Test
    public void testUseMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The book was not the same","override this with read for books",testBook.use());
    }

    @Test
    public void testReserveMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The book was not the same","this book has been reserved",testBook.reserve());
    }

    @Test
    public void testFlickThroughMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The book was not the same","flicking through book...done.",testBook.flickThrough());
    }

    @Test
    public void testBorrowMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The book was not the same","book is loaned to you for a week",testBook.borrow());
    }

    @Test
    public void testReadMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The book was not the same","reading book...start.",testBook.read());
    }


    @Test
    public void testGetLibraryItemNameMethod(){
        com.company.Books testBook = new com.company.Books("catch 22");
        assertEquals("The book was not the same","Book: catch 22",testBook.getLibraryItemName());
    }

    @Test
    public void testGetAuthor(){
        com.company.Books testBook = new com.company.Books("catch 22", "mark");
        assertEquals("The book was not the same","mark",testBook.getAuthor());
    }

    @Test
    public void testGetType(){
        com.company.Books testBook = new com.company.Books("catch 22", "mark", "fiction");
        assertEquals("The book was not the same","fiction",testBook.getType());
    }













}
