import com.fasterxml.jackson.annotation.*;

/**
 * The responsible cloud.implementation.tilt.controller is defined in here.
 */
public class Controller {
    private String address;
    private String country;
    private String division;
    private String name;
    private ControllerRepresentative representative;

    /**
     * Address of the cloud.implementation.tilt.controller.
     */
    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    /**
     * All country codes follow the established ones ISO 3166 country abbreviation standard.
     */
    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    /**
     * Serves to differentiate between different areas of a company; particularly relevant for
     * large companies.
     */
    @JsonProperty("division")
    public String getDivision() { return division; }
    @JsonProperty("division")
    public void setDivision(String value) { this.division = value; }

    /**
     * Name of the cloud.implementation.tilt.controller.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The representative is a responsible real person that represents the cloud.implementation.tilt.controller.
     */
    @JsonProperty("representative")
    public ControllerRepresentative getRepresentative() { return representative; }
    @JsonProperty("representative")
    public void setRepresentative(ControllerRepresentative value) { this.representative = value; }

    @Override
    public String toString() {
        return "Controller{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", division='" + division + '\'' +
                ", name='" + name + '\'' +
                ", representative=" + representative +
                '}';
    }
}
