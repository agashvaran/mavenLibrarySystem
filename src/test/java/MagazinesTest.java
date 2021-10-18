import com.company.EmptyDesk;
import com.company.Magazines;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagazinesTest {

    @Test
    public void testUseMethod(){
        Magazines mag1 = new Magazines("Wired", "Magazines");
        assertEquals("The desk was not the same","override to read magazine",mag1.use());
    }

    @Test
    public void testReserveMethod(){
        Magazines mag1 = new Magazines("Wired");
        assertEquals("The desk was not the same","reserved magazine",mag1.reserve());
    }

    @Test
    public void testFlickThroughMethod(){
        Magazines mag1 = new Magazines("Wired");
        assertEquals("The desk was not the same","flicking through magazine",mag1.flickThrough());
    }

    @Test
    public void testBorrowMethod(){
        Magazines mag1 = new Magazines("Wired");
        assertEquals("The desk was not the same","magazine loaned to you for a week",mag1.borrow());
    }

    @Test
    public void testReadMethod(){
        Magazines mag1 = new Magazines("Wired");
        assertEquals("The desk was not the same","reading magazine...",mag1.read());
    }

    @Test
    public void testgetLibraryItemNameMethod(){
        Magazines mag1 = new Magazines("Wired");
        assertEquals("The desk was not the same","Wired",mag1.getLibraryItemName());
    }

    @Test
    public void testgetTitleMethod(){
        Magazines mag1 = new Magazines("Wired");
        assertEquals("The desk was not the same","Wired",mag1.getTitle());
    }











}
