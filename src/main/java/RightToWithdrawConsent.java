import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This schema refers to the right to withdraw consent.
 */
public class RightToWithdrawConsent {
    private Boolean available;
    private String description;
    private String email;
    private List<String> identificationEvidences;
    private String url;

    @JsonProperty("available")
    public Boolean getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(Boolean value) { this.available = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("identificationEvidences")
    public List<String> getIdentificationEvidences() { return identificationEvidences; }
    @JsonProperty("identificationEvidences")
    public void setIdentificationEvidences(List<String> value) { this.identificationEvidences = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @Override
    public String toString() {
        return "RightToWithdrawConsent{" +
                "available=" + available +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", identificationEvidences=" + identificationEvidences +
                ", url='" + url + '\'' +
                '}';
    }
}
