import com.company.AudioBooks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AudioBooksTest {
    @Test
    public void testUseMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me");
        com.company.Books testBook = new com.company.Books("override with play for audiobook");
        assertEquals("The book was not the same","override with play for audiobook",testABook.use());
    }

    @Test
    public void testReserveMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me");
        assertEquals("The book was not the same","this audiobook has been reserved",testABook.reserve());
    }

    @Test
    public void testBookGetTitleMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me");
        assertEquals("The book was not the same","Can't hurt me",testABook.getTitle());
    }

    @Test
    public void testBorrowMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me");
        assertEquals("The book was not the same","audiobook sent to email.",testABook.borrow());
    }







}


