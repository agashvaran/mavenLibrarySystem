package unitTests;

import com.company.AudioBooks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AudioBooksTest {
    @Test
    public void testUseMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me");
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

    @Test
    public void testGetTitleMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me");
        assertEquals("The book was not the same","Can't hurt me",testABook.getTitle());
    }

    @Test
    public void testGetAuthorMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me", "me", "AudioBook");
        assertEquals("The book was not the same","me",testABook.getAuthor());
    }

    @Test
    public void testGetLibraryItemNameMethod(){
        AudioBooks testABook = new AudioBooks("Can't hurt me", "me");
        assertEquals("The book was not the same","Can't hurt me",testABook.getLibraryItemName());
    }








}


