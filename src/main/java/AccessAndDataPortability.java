import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Defining the right to access and data portability.
 */
public class AccessAndDataPortability {
    private AdministrativeFee administrativeFee;
    private boolean available;
    private List<String> dataFormats;
    private String description;
    private String email;
    private List<String> identificationEvidences;
    private String url;

    /**
     * The fee that refers to several copies.
     */
    @JsonProperty("administrativeFee")
    public AdministrativeFee getAdministrativeFee() { return administrativeFee; }
    @JsonProperty("administrativeFee")
    public void setAdministrativeFee(AdministrativeFee value) { this.administrativeFee = value; }

    /**
     * The information is subject to the requirements of Art. 20 (right to data portability)
     * GDPR.
     */
    @JsonProperty("available")
    public boolean getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(boolean value) { this.available = value; }

    /**
     * An explanation about the data format(s) the data is provided in.
     */
    @JsonProperty("dataFormats")
    public List<String> getDataFormats() { return dataFormats; }
    @JsonProperty("dataFormats")
    public void setDataFormats(List<String> value) { this.dataFormats = value; }

    /**
     * Description of the requirements according to Art. 20 GDPR.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * Contact email address
     */
    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    /**
     * ID evidences
     */
    @JsonProperty("identificationEvidences")
    public List<String> getIdentificationEvidences() { return identificationEvidences; }
    @JsonProperty("identificationEvidences")
    public void setIdentificationEvidences(List<String> value) { this.identificationEvidences = value; }

    /**
     * URL to relevant resources such as access portals.
     */
    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @Override
    public String toString() {
        return "AccessAndDataPortability{" +
                "administrativeFee=" + administrativeFee +
                ", available=" + available +
                ", dataFormats=" + dataFormats +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", identificationEvidences=" + identificationEvidences +
                ", url='" + url + '\'' +
                '}';
    }
}
