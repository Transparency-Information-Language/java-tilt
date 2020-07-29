import com.fasterxml.jackson.annotation.*;

/**
 * Defines the supervisory authority that has to be contacted in order to complain about the
 * data cloud.implementation.tilt.controller's practices.
 */
public class SupervisoryAuthority {
    private String address;
    private String country;
    private String email;
    private String name;
    private String phone;

    /**
     * Adress of the supervisory authority.
     */
    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    /**
     * Country of the supervisory authority.
     */
    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    /**
     * Email adress of the supervisory authority.
     */
    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    /**
     * Name of the supervisory authority.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Phone number of the supervisory authority.
     */
    @JsonProperty("phone")
    public String getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(String value) { this.phone = value; }

    @Override
    public String toString() {
        return "SupervisoryAuthority{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
