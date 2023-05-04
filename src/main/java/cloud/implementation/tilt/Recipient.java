package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Recipient {
    private String address;
    private String category;
    private String country;
    private String division;
    private String domain;
    private String name;
    private RecipientRepresentative representative;
    private List<String> url;

    /**
     * The address of the third party (recipient).
     */
    @JsonProperty("address")
    public String getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(String value) { this.address = value; }

    /**
     * The category of the the recipient.
     *
     * This category has to be given, even if the controller is not mentioned explicitly.
     */
    @JsonProperty("category")
    public String getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(String value) { this.category = value; }

    /**
     * The country in which the recipient is located at. Attention: This explictly specifies
     * third country transfers!
     */
    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    /**
     * The division of the third party (recipient) for structuring controllers into smaller
     * entities.
     */
    @JsonProperty("division")
    public String getDivision() { return division; }
    @JsonProperty("division")
    public void setDivision(String value) { this.division = value; }

    /**
     * The domain of the third party (recipient) as a url starting with protocol.
     */
    @JsonProperty("domain")
    public String getDomain() { return domain; }
    @JsonProperty("domain")
    public void setDomain(String value) { this.domain = value; }

    /**
     * The name of the third party (recipient).
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The representative of the third party (recipient).
     */
    @JsonProperty("representative")
    public RecipientRepresentative getRepresentative() { return representative; }
    @JsonProperty("representative")
    public void setRepresentative(RecipientRepresentative value) { this.representative = value; }

    @JsonProperty("url")
    public List<String> getURL() { return url; }
    @JsonProperty("url")
    public void setURL(List<String> value) { this.url = value; }


    @Override
    public String toString() {
        return "Recipient{" +
                "address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", country='" + country + '\'' +
                ", division='" + division + '\'' +
                ", domain='" + domain + '\'' +
                ", name='" + name + '\'' +
                ", representative=" + representative +
                ", url=" + url +
                '}';
    }
}
