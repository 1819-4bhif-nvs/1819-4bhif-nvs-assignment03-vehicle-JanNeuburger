package at.htl.vehicle.entity;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vehicle {

    private Long id;
    private String brand;
    private String type;

    //region Constructors
    public Vehicle() {
    }

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    //endregion

    //region Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //endregion
}
