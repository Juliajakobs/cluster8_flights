/*package flights;
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
    // Leit að flugi skilar niðurstöðu
    public void searchReturnsFlight() throws Exception {
        assertNotNull(testSearcher.searchFlights("Reykjavík","Vestmannaeyjar",new Date(2021 - 15 - 6),new Date(2021 - 15 - 6),3));
    }

    @Test
    // Leit með missing params skilar 0 flugum
    public void searchMissingParams() throws Exception {
        assertEquals(testSearcher.searchFlights("IAC","F109",new Date(2021 - 15 - 6),new Date(2021 - 15 - 6),3).size(),0);
    }

    @Test
    // Leit að áfangastað skilar dagsetningu brottfarar
    public  void searchDates() throws Exception {
        assertEquals(testSearcher.getDepartures("Egilsstaðir").get(0).getDepartureTime(),new Date(2021 - 5 - 11));
    }
    @Test
    // Skilar flug/um sem hafa a.m.k. x-sæti laus
    public void numSeatsAvailable() throws Exception {
        ArrayList<Flight> f = new ArrayList();
        f.add(testSearcher.dbManager.flights.get(2));
        assertEquals(testSearcher.getSeatsAvailable(60), f);
    }
    @Test
    // Leit skilar verði flugleiðar
    public void seePrice() {
        assertEquals(testSearcher.findPrice("Reykjavík","Ísafjörður",new Date(2021 - 6 - 23)).get(0).getPrice(),30000);
    }
}*/
