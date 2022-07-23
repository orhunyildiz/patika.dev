package FlightManagement;

public class Airplane {
    private String id;
    private String name;
    private AirplaneStatus airplaneStatus;
    private int pilotNumber;
    private AirplaneType airplaneType;

    public Airplane(String id, String name, AirplaneStatus airplaneStatus, AirplaneType airplaneType) {
        this.id = id;
        this.name = name;
        this.airplaneStatus = airplaneStatus;
        this.airplaneType = airplaneType;
        if (this.airplaneType.equals(AirplaneType.AIRBUS))
            setPilotNumber(3);
        else
            setPilotNumber(2);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AirplaneStatus getAirplaneStatus() {
        return airplaneStatus;
    }

    public void setAirplaneStatus(AirplaneStatus airplaneStatus) {
        this.airplaneStatus = airplaneStatus;
    }

    public int getPilotNumber() {
        return pilotNumber;
    }

    public void setPilotNumber(int pilotNumber) {
        this.pilotNumber = pilotNumber;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }
}
