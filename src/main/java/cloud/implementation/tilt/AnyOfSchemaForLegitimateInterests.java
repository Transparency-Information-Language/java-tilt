package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

public class AnyOfSchemaForLegitimateInterests {
    private Boolean exists;
    private String reasoning;

    /**
     * The legitimate interest only has to be stated if the processing is carried out in
     * accordance with Art. 13 (1d). This field refers to the existence of such an interest.
     */
    @JsonProperty("exists")
    public Boolean getExists() { return exists; }
    @JsonProperty("exists")
    public void setExists(Boolean value) { this.exists = value; }

    /**
     * If the legitimate interest has to be stated because the processing is carried out in
     * accordance with Art. 13 (1d), it is described in here.
     */
    @JsonProperty("reasoning")
    public String getReasoning() { return reasoning; }
    @JsonProperty("reasoning")
    public void setReasoning(String value) { this.reasoning = value; }

    @Override
    public String toString() {
        return "AnyOfSchemaForLegitimateInterests{" +
                "exists=" + exists +
                ", reasoning='" + reasoning + '\'' +
                '}';
    }
}
