
import com.fasterxml.jackson.annotation.*;

public class AdequacyDecision {
    private Boolean available;
    private String description;

    /**
     * Adequacy decision by the European commission exists?
     */
    @JsonProperty("available")
    public Boolean getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(Boolean value) { this.available = value; }

    /**
     * Description of the adequacy decision by the European commission.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @Override
    public String toString() {
        return "AdequacyDecision{" +
                "available=" + available +
                ", description='" + description + '\'' +
                '}';
    }
}
