package FlightManagement;

public class Pilot {
    private String name;
    private String id;
    private int experienceLevel;
    private PilotType pilotType;

    public Pilot(String name, String id, int experienceLevel) {
        this.name = name;
        this.id = id;
        this.experienceLevel = experienceLevel;
        if (this.experienceLevel >= 500)
            setPilotType(PilotType.PrimaryPilot);
        else if (this.experienceLevel >= 0)
            setPilotType(PilotType.COPilot);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public PilotType getPilotType() {
        return pilotType;
    }

    public void setPilotType(PilotType pilotType) {
        this.pilotType = pilotType;
    }

    public void drive(Airplane airplane, Pilot pilot1, Pilot pilot2) {
        if (airplane.getPilotNumber() == 2)
            drive(airplane, pilot1);
        else
            System.out.println("Pilotlar sürüyor.");
    }

    public void drive(Airplane airplane, Pilot pilot1) {
        System.out.println("Pilotlar sürüyor.");
    }
}
