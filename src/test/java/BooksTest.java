

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
//        Books testBook = new Books("blurb blurb nice blurb");
//        assertEquals("The blurb was not the same","blurb blurb nice blurb",testBook.readBlurb());
//    }
//
//    @Test
//    public void testUseMethod(){
//        Books testBook = new Books("override this with read for books");
//        assertEquals("The book was not the same","override this with read for books",testBook.use());
//    }

//    @Test
//    public void testReserveMethod(){
//        Books testBook = new Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }
//
//    @Test
//    public void testFlickThroughMethod(){
//        Books testBook = new Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }
//
//    @Test
//    public void testBorrowMethod(){
//        Books testBook = new Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }
//
//    @Test
//    public void testReadMethod(){
//        Books testBook = new Books("Wolves Of The Plains");
//        assertEquals("The book was not the same","Wolves Of The Plains",testBook.getTitle());
//    }









}
