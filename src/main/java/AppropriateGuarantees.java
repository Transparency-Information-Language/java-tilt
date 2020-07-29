import com.fasterxml.jackson.annotation.*;

/**
 * Suitable guarantees according to Art. 45
 */
public class AppropriateGuarantees {
    private Boolean available;
    private String description;

    /**
     * Do suitable guarantees according to Art. 45 exist?
     */
    @JsonProperty("available")
    public Boolean getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(Boolean value) { this.available = value; }

    /**
     * Description of suitable guarantees according to Art. 45
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @Override
    public String toString() {
        return "AppropriateGuarantees{" +
                "available=" + available +
                ", description='" + description + '\'' +
                '}';
    }
}
