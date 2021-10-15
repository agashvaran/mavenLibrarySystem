

import com.company.Books;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void testBookGetTitleMethod(){
        Books testBook = new Books("Wolves Of The Plains");
        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
    }

//    @Test
//    public void testReadBlurbMethod(){
//        com.company.Books testBook = new com.company.Books("blurb blurb nice blurb");
//        assertEquals("The blurb was not the same","blurb blurb nice blurb",testBook.readBlurb());
//    }
//
//    @Test
//    public void testUseMethod(){
//        com.company.Books testBook = new com.company.Books("override this with read for books");
//        assertEquals("The book was not the same","override this with read for books",testBook.use());
//    }

//    @Test
//    public void testReserveMethod(){
//        com.company.Books testBook = new com.company.Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }
//
//    @Test
//    public void testFlickThroughMethod(){
//        com.company.Books testBook = new com.company.Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }
//
//    @Test
//    public void testBorrowMethod(){
//        com.company.Books testBook = new com.company.Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }
//
//    @Test
//    public void testReadMethod(){
//        com.company.Books testBook = new com.company.Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }









}
