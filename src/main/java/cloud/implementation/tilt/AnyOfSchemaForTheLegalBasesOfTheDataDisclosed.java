package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

public class AnyOfSchemaForTheLegalBasesOfTheDataDisclosed {
    private String description;
    private String reference;

    /**
     * An explanation about the legal basis used.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * This field refers to the reference in legal regulations (laws, orders, declaration etc.).
     * The format is set to uppercase letters for the legal text followed by hyphened numbers
     * and lowercase letters for the exact location.
     */
    @JsonProperty("reference")
    public String getReference() { return reference; }
    @JsonProperty("reference")
    public void setReference(String value) { this.reference = value; }

    @Override
    public String toString() {
        return "AnyOfSchemaForTheLegalBasesOfTheDataDisclosed{" +
                "description='" + description + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
