import com.fasterxml.jackson.annotation.*;

public class AnyOfSchemaForThePurposes {
    private String description;
    private String purpose;

    /**
     * This schema refers to an exact description of the purpose the data is processed for.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * In this schema the purpose is specified (i.e. a headline or purpose category).
     */
    @JsonProperty("purpose")
    public String getPurpose() { return purpose; }
    @JsonProperty("purpose")
    public void setPurpose(String value) { this.purpose = value; }

    @Override
    public String toString() {
        return "AnyOfSchemaForThePurposes{" +
                "description='" + description + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
