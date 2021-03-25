package flights;
import java.util.*;
import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class searchControlTest {

    private searchController testSearcher = new searchController();

    @BeforeEach
    public void setUp() throws Exception {
        testSearcher = new searchController();
    }

    @AfterEach
    public void tearDown()throws Exception {
        testSearcher = null;
    }

    @Test
    // Search returns a flight
    public void searchReturnsFlight() throws Exception {
        assertNotNull(testSearcher.searchFlights("Reykjavík","Vestmannaeyjar",new Date(2021 - 15 - 6),new Date(2021 - 15 - 6),3));
    }

    @Test
    // Search with missing parameters returns 0 flights
    public void searchMissingParams() throws Exception {
        assertEquals(testSearcher.searchFlights("IAC","F109",new Date(2021 - 15 - 6),new Date(2021 - 15 - 6),3).size(),0);
    }

}
