package flights;
import java.util.Date;
 
public class Flights {

    private String airline;
    private String flightNo;
    private Date departureTime;
    private Date arrivalTime;
    private String departureDest;
    private String arrivalDest;
    private String airport;
    private int price;
    private int seatAvailability;
    

    public Flights (String airline, String flightNo, Date departureTime, Date arrivalTime, String departureDest, String arrivalDest, String airport,int price, int seatAvailability) {
        this.airline = airline;
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureDest = departureDest;
        this.arrivalDest = arrivalDest;
        this.airport = airport;
        this.price = price;
        this.seatAvailability=seatAvailability;
    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Date getDepartureTime(){
        return departureTime;
    }

    public Date getArrivalTime(){
        return arrivalTime;
    }
  
    public String getDepartureDest() {
        return departureDest;
    }
   
    public String getArrivalDest() {
        return arrivalDest;
    }

    public String getAirport() {
        return airport;
    }

    public int getPrice(){
        return price;
    }
   
    public int getSeatAvailabilty(){
        return seatAvailability;
    }

}
