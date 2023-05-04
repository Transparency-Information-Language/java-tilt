package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

/**
 * Schema on Standard Data Protection clauses.
 */
public class StandardDataProtectionClause {
    private Boolean available;
    private String description;

    /**
     * Does a standard data protection clause exist?
     */
    @JsonProperty("available")
    public Boolean getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(Boolean value) { this.available = value; }

    /**
     * An explanation about the standard data protection clause (may include link).
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @Override
    public String toString() {
        return "StandardDataProtectionClause{" +
                "available=" + available +
                ", description='" + description + '\'' +
                '}';
    }
}
