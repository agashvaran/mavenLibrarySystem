

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EbooksTest {

    @Test
    public void testUseMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("god", "god", "ebook");
        assertEquals("wrong", "override this with read for ebook", ebook1.use());
    }

    @Test
    public void testPlayMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("god", "god");
        assertEquals("wrong", "Playing digital Item", ebook1.play());
    }

    @Test
    public void testReserveMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("god");
        assertEquals("wrong", "this ebook has been reserved", ebook1.reserve());
    }

    @Test
    public void testReadMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("god");
        assertEquals("wrong", "preparing book for reading...", ebook1.read());
    }

    @Test
    public void testBorrowMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("god");
        assertEquals("wrong", "ebook sent to email", ebook1.borrow());
    }

    @Test
    public void testgetLibraryItemNameMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("god");
        assertEquals("wrong", "god", ebook1.getLibraryItemName());
    }













}
