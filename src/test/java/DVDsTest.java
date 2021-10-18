import com.company.ComputerDesk;
import com.company.DVDs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDsTest {

    @Test
    public void testUseMethod(){
        DVDs dvd1 = new DVDs("No Time To Die");
        assertEquals("The dvd was not the same","override with play for DVD",dvd1.use());
    }

    @Test
    public void testReserveMethod(){
        DVDs dvd1 = new DVDs("No Time To Die");
        assertEquals("The dvd was not the same","this DVD has been reserved",dvd1.reserve());
    }

    @Test
    public void testBorrowMethod(){
        DVDs dvd1 = new DVDs("No Time To Die");
        assertEquals("The dvd was not the same","DVD is loaned to you for a week.",dvd1.borrow());
    }

    @Test
    public void testgetLibraryItemNameMethod(){
        DVDs dvd1 = new DVDs("No Time To Die");
        assertEquals("The dvd was not the same","No Time To Die",dvd1.getLibraryItemName());
    }





}
