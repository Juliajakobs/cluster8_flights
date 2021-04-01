/*package flights;
import java.util.*;

public class DatabaseMock {
    // implenta mock niðurstöður
    ArrayList<Flight> flights;

    public DatabaseMock() {
        flights = new ArrayList<Flight>();

        Date date1 = new Date(2021 - 4 - 6);
        Date date2 = new Date(2021 - 4 - 27);
        Date date3 = new Date(2021 - 5 - 11);
        Date date4 = new Date(2021 - 6 - 23);
        Date date5 = new Date(2021 - 6 - 13);

        String departureDest1 = "Reykjavík";
        String arrivalDest1 = "Reykjavík";
        String departureDest2 = "Vestmannaeyjar";
        String arrivalDest2 = "Vestmannaeyjar";
        String departureDest3 = "Egilsstaðir";
        String arrivalDest3 = "Egilsstaðir";
        String departureDest4 = "Ísafjörður";
        String arrivalDest4 = "Ísafjörður";


        Flight flight1 = new flights.Flight("IAC", "F109", date1, date1, departureDest1, arrivalDest2, "REY", 25000, 50);
        Flight flight2 = new flights.Flight("IAC", "F105", date2, date2, departureDest2, arrivalDest1, "VE", 13000, 12);

        Flight flight3 = new flights.Flight("Ernir", "F121", date3, date3, departureDest1, arrivalDest3, "REY", 24000, 95);
        Flight flight4 = new flights.Flight("AIC", "F109", date3, date3, departureDest3, departureDest1, "EGS", 13000, 55);

        Flight flight5 = new flights.Flight("Ernir", "F104", date4, date4, departureDest1, arrivalDest4, "REY", 30000, 14);
        Flight flight6 = new flights.Flight("IAC", "F112", date5, date5, departureDest4, arrivalDest1, "ÍSF", 35000, 1);

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
    }

    public List<Flight> searchFlightRoutes(String departureDest, String arrDest, Date depTime,
                                           Date arrTime, int passengers) {
        List<Flight> flightList = new ArrayList<>();
            for (Flight flight : flights) {
                if (flight.getDepartureDest().equals(departureDest) &&
                        flight.getArrivalDest().equals(arrDest) &&
                        flight.getDepartureTime().equals(depTime) &&
                        flight.getArrivalTime().equals(arrTime) &&
                        flight.getSeatAvailability() > passengers
                ) {
                    flightList.add(flight);
                }
            }
            return flightList;
    }

    public List <Flight> getDepartureTimes(String dep){
        List<Flight> depTime = new ArrayList<>();
        for(Flight flight : flights){
            if(flight.getDepartureDest().equals(dep)){
                depTime.add(flight);
            }
        }
        return depTime;
    }

    public ArrayList<Flight> getSeatsAvailable(int number){
        ArrayList<Flight> match = new ArrayList();
        for (Flight flight : flights){
            if (flight.getSeatAvailability()>=number){
                match.add(flight);
            }
        }
        return match;
    }

    public ArrayList<Flight> findPrice(String dep, String arr, Date date){
        ArrayList<Flight> price = new ArrayList<>();
        for(Flight flight : flights){
            if(flight.getDepartureDest().equals(dep) &&
                flight.getArrivalDest().equals(arr)&&
                flight.getDepartureTime().equals(date)){
                price.add(flight);
            }
        }
        return price;
    }

    public ArrayList <Flight> getCheapestFlight(){
       ArrayList<Flight> cheapest = new ArrayList<>();
       double min = Double.POSITIVE_INFINITY;
        for(Flight flight: flights){
            if(flight.getPrice() <= min){
                System.out.println(flight.getPrice());
                min=flight.getPrice();
            }
            cheapest.add(flight);
            System.out.println(min);
        }
        System.out.println(cheapest);
        return cheapest;
    }

}

*/
