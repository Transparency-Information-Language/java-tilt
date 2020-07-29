import com.fasterxml.jackson.annotation.*;

public class Recipient {
    private String address;
    private String category;
    private String country;
    private String division;
    private String name;
    private RecipientRepresentative representative;

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
     * This category has to be given, even if the cloud.implementation.tilt.controller is not mentioned explicitly.
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

    @Override
    public String toString() {
        return "Recipient{" +
                "address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", country='" + country + '\'' +
                ", division='" + division + '\'' +
                ", name='" + name + '\'' +
                ", representative=" + representative +
                '}';
    }
}
