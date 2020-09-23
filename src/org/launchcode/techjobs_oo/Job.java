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


    public Job () {
        id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        // If no data is available
            if (this.name.equals("") && this.employer.getValue().equals("") && this.location.getValue().equals("") && this.positionType.getValue().equals("") && this.coreCompetency.getValue().equals("")) {
                return "OOPS! This job does not seem to exist.";
            }

        // Assign "Data not available" as the object if a field is missing
            if (this.name.equals("")){
                this.name = "Data not available";
            }
            if (this.employer.getValue().equals("")){
                this.employer.setValue("Data not available");
            }
            if (this.location.getValue().equals("")){
                this.location.setValue("Data not available");
            }
            if (this.positionType.getValue().equals("")){
                this.positionType.setValue("Data not available");
            }
            if (this.coreCompetency.getValue().equals("")){
                this.coreCompetency.setValue("Data not available");
            }


        return  "\nID= " + this.id + '\n' +
                "Name= " + this.name + '\n' +
                "Employer= " + this.employer + '\n' +
                "Location= " + this.location + '\n' +
                "Position Type= " + this.positionType + '\n' +
                "Core Competency= " + this.coreCompetency + '\n';

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

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
}
