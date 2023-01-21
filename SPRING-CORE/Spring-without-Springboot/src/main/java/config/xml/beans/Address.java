package config.xml.beans;

public class Address {

    private String streetName;
    private String pinCode;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void address(){
        System.out.println("inside address method");
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
