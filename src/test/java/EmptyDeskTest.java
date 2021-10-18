import com.company.DVDs;
import com.company.EmptyDesk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmptyDeskTest {

    @Test
    public void testUseMethod(){
        EmptyDesk desk2 = new EmptyDesk("49");
        assertEquals("The desk was not the same","setting up my stuff on the emptydesk...",desk2.use());
    }

    @Test
    public void testReserveMethod(){
        EmptyDesk desk2 = new EmptyDesk("49");
        assertEquals("The desk was not the same","emptydesk reserved",desk2.reserve());
    }

    @Test
    public void testUsePersonalDeviceMethod(){
        EmptyDesk desk2 = new EmptyDesk("49");
        assertEquals("The desk was not the same","using my personal laptop...",desk2.usePersonalDevice());
    }

    @Test
    public void testgetLibraryItemNameMethod(){
        EmptyDesk desk2 = new EmptyDesk("49");
        assertEquals("The desk was not the same","Desk 49",desk2.getLibraryItemName());
    }


}
