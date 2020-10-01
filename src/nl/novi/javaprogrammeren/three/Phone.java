package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;
    final private String countryCodeNL = "+31";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInternationalPhoneNumber() {
        String phoneNumber = countryCodeNL + getPhoneNumber();

        return phoneNumber;
    }
}
