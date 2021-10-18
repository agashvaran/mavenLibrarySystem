
import com.company.ComputerDesk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerDeskTest {

    @Test
    public void testUseMethod(){
        ComputerDesk desk1 = new ComputerDesk("23");
        assertEquals("The desk was not the same","sitting down in front of the computer desk",desk1.use());
    }

    @Test
    public void testReserveMethod(){
        ComputerDesk desk1 = new ComputerDesk("23");
        assertEquals("The desk was not the same","computer desk has been reserved.",desk1.reserve());
    }

    @Test
    public void testLoginMethod(){
        ComputerDesk desk1 = new ComputerDesk("23");
        assertEquals("The desk was not the same","logging in to library computer",desk1.logIn());
    }

    @Test
    public void testLogOutMethod(){
        ComputerDesk desk1 = new ComputerDesk("23");
        assertEquals("The desk was not the same","logging out of library computer",desk1.logOut());
    }







}
