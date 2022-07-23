package FlightManagement;

import java.time.LocalDateTime;
import java.util.List;

public class Flight {
    private String id;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private List<Pilot> pilots;
    private AirlinesCompany airlinesCompany;
    private Airplane airplane;

    public Flight(String id, String departureAirport, String arrivalAirport, AirlinesCompany airlinesCompany, List<Pilot> pilots, Airplane airplane) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.airlinesCompany = airlinesCompany;
        departureTime = LocalDateTime.parse("2022-07-23T20:19:39.741771");
        arrivalTime = LocalDateTime.now();
        this.airplane = airplane;
    }
}
