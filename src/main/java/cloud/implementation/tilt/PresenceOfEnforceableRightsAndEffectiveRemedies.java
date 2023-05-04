package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

/**
 * Presence of enforceable rights and effective remedies
 */
public class PresenceOfEnforceableRightsAndEffectiveRemedies {
    private Boolean available;
    private String description;

    /**
     * Presence of enforceable rights and effective remedies?
     */
    @JsonProperty("available")
    public Boolean getAvailable() { return available; }
    @JsonProperty("available")
    public void setAvailable(Boolean value) { this.available = value; }

    /**
     * Description of enforceable rights and effective remedies.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @Override
    public String toString() {
        return "PresenceOfEnforceableRightsAndEffectiveRemedies{" +
                "available=" + available +
                ", description='" + description + '\'' +
                '}';
    }
}
