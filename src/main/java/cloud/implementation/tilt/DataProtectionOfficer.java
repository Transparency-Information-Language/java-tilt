package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

/**
 * The Data Protection Officer (DPO) of the controller.
 */
public class DataProtectionOfficer {
    private String address;
    private String country;
    private String email;
    private String name;
    private String phone;

    /**
     * Address of the DPO.
     */
    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    /**
     * The country in which the Data Protection officer is located at.
     */
    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    /**
     * The contact email address of the Data Protection Officer.
     */
    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    /**
     * The full name of the Data Protection Officer.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The phone number of the Data Protection Officer (may include country prefix).
     */
    @JsonProperty("phone")
    public String getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(String value) { this.phone = value; }

    @Override
    public String toString() {
        return "DataProtectionOfficer{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
