

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EbooksTest {

    @Test
    public void testUseMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("override this with read for ebook");
        assertEquals("wrong", "override this with read for ebook", ebook1.use());
    }

    @Test
    public void testPlayMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("Playing digital Item");
        assertEquals("wrong", "Playing digital Item", ebook1.play());
    }

    @Test
    public void testReserveMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("this ebook has been reserved");
        assertEquals("wrong", "this ebook has been reserved", ebook1.reserve());
    }

    @Test
    public void testReadMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("preparing book for reading...");
        assertEquals("wrong", "preparing book for reading...", ebook1.read());
    }

    @Test
    public void testBorrowMethod(){
        com.company.Ebooks ebook1 = new com.company.Ebooks("ebook sent to email");
        assertEquals("wrong", "ebook sent to email", ebook1.borrow());
    }













}
