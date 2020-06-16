package project.firts.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ImportContractClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClients;
    @Column(name = "firts_Name", nullable = false)
    private String firtsName;
   @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "house_Number", nullable = false, length = 5)
    private String houseNumber;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "city_town", nullable = false)
    private String cityTown;


    public ImportContractClients() {
    }

    public ImportContractClients(String firtsName, String lastName, String houseNumber, String street, String cityTown) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.cityTown = cityTown;
    }


    public long getIdClients() {
        return idClients;
    }

    public void setIdClients(long idClients) {
        this.idClients = idClients;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityTown() {
        return cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }

    @Override
    public String toString() {
        return "ImportContractClients [" +
                "idClients=" + idClients +
                ", firtsName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", street='" + street + '\'' +
                ", cityTown='" + cityTown + '\'' +
                ']';
    }
}
