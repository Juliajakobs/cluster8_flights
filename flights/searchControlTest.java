package flights;
import org.junit.*;

public class searchControlTest {


    private searchController searcher = new searchController();

    @Before
    public void setUp() throws Exception {
        searcher = new flights.searchController();
    }

    @After
    public void tearDown()throws Exception{
        searcher = null;
    }

    @Test
    public void searchFlights(){

    }

}
