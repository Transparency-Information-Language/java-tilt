package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

public class TemporalElement {
    private String description;
    private String ttl;

    /**
     * The description why the data has to be stored..
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * The TTL (Time-to-Live) specifies the lifetime of this data (category). It follows the ISO
     * 8601 for time spans.
     */
    @JsonProperty("ttl")
    public String getTTL() { return ttl; }
    @JsonProperty("ttl")
    public void setTTL(String value) { this.ttl = value; }

    @Override
    public String toString() {
        return "TemporalElement{" +
                "description='" + description + '\'' +
                ", ttl='" + ttl + '\'' +
                '}';
    }
}
