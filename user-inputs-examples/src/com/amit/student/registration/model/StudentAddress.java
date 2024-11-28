package com.amit.student.registration.model;

public class StudentAddress {

    /*pseudo code
    ID
    houseNoBuildingName
    landmark
    tehshil
    district
    state
    PIN Code*/

    public int addressID;
    public String houseNoBuildingName;
    public String landmark;
    public String city;
    public String tehshil;
    public String district;
    public String state;
    public int pin;

    @Override
    public String toString() {
        return "StudentAddress{" +
                "addressID=" + addressID +
                ", houseNoBuildingName='" + houseNoBuildingName + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", tehshil='" + tehshil + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
