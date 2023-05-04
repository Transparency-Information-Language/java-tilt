package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * The responsible controller is defined in here.
 */
public class Controller {
    private String address;
    private String country;
    private String division;
    private String name;
    private ControllerRepresentative representative;
    private String sector;
    private List<String> url;

    /**
     * Address of the controller.
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
     * Name of the controller.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The representative is a responsible real person that represents the controller.
     */
    @JsonProperty("representative")
    public ControllerRepresentative getRepresentative() { return representative; }
    @JsonProperty("representative")
    public void setRepresentative(ControllerRepresentative value) { this.representative = value; }

    /**
     * The industry of the controller according to UN ISIC Rev. 4
     */
    @JsonProperty("sector")
    public String getSector() { return sector; }
    @JsonProperty("sector")
    public void setSector(String value) { this.sector = value; }

    /**
     * The URI(s) to identify this controller. Multiple URs are possible accomodating for
     * multiple representation of the same entity
     */
    @JsonProperty("url")
    public List<String> getURL() { return url; }
    @JsonProperty("url")
    public void setURL(List<String> value) { this.url = value; }

    @Override
    public String toString() {
        return "Controller{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", division='" + division + '\'' +
                ", name='" + name + '\'' +
                ", representative=" + representative +
                ", sector=" + sector +
                ", url=" + url +
                '}';
    }
}
