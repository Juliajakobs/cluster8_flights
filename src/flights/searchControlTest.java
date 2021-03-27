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
    @Test
    // searching for a destination returns date
    public  void searchDates() throws Exception{
        assertEquals(testSearcher.getDepartures("Egilsstaðir").get(0).getDepartureTime(),new Date(2021 - 5 - 11));
    }
    @Test
    // Skilar flug/um sem hafa a.m.k. x-sæti laus
    public void numSeatsAvailable() throws Exception{
        ArrayList<Flight> f = new ArrayList();
        f.add(testSearcher.dbManager.flights.get(2));
        assertEquals(testSearcher.getSeatsAvailable(60), f);
    }

}
