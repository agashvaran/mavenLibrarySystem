

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
        com.company.Books testBook = new com.company.Books("blurb blurb nice blurb");
        assertEquals("The blurb was not the same","blurb blurb nice blurb",testBook.readBlurb());
    }

    @Test
    public void testUseMethod(){
        com.company.Books testBook = new com.company.Books("override this with read for books");
        assertEquals("The book was not the same","override this with read for books",testBook.use());
    }

    @Test
    public void testReserveMethod(){
        com.company.Books testBook = new com.company.Books("this book has been reserved");
        assertEquals("The book was not the same","this book has been reserved",testBook.reserve());
    }

    @Test
    public void testFlickThroughMethod(){
        com.company.Books testBook = new com.company.Books("flicking through book...done.");
        assertEquals("The book was not the same","flicking through book...done.",testBook.flickThrough());
    }

    @Test
    public void testBorrowMethod(){
        com.company.Books testBook = new com.company.Books("book is loaned to you for a week");
        assertEquals("The book was not the same","book is loaned to you for a week",testBook.borrow());
    }

    @Test
    public void testReadMethod(){
        com.company.Books testBook = new com.company.Books("reading book...start.");
        assertEquals("The book was not the same","reading book...start.",testBook.read());
    }
    









}
