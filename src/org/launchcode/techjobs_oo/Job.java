package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
       return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (this.getName() == null && this.getEmployer() == null && this.getLocation() == null && this.getPositionType() == null && this.getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist.";
        }
        if (this.getName() == "") {
            name = "Data not available";
        }
        if (this.getEmployer().getValue().isEmpty()) {
            this.getEmployer().setValue("Data not available");
        }
        if (this.getLocation().getValue().isEmpty()) {
            this.getLocation().setValue("Data not available");
        }
        if (this.getPositionType().getValue().isEmpty()) {
            this.getPositionType().setValue("Data not available");
        }
        if(this.getCoreCompetency().getValue().isEmpty()) {
            this.getCoreCompetency().setValue("Data not available");
        }
        return "\n" +
                    "ID: " + getId() + "\n" +
                    "Name: " + this.getName() + "\n" +
                    "Employer: " + this.getEmployer() + "\n" +
                    "Location: " + this.getLocation() + "\n" +
                    "Position Type: " + this.getPositionType() + "\n" +
                    "Core Competency: " + this.getCoreCompetency() + "\n";

        }
    }

