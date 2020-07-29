import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ChangesOfPurposeElement {
    private List<String> affectedDataCategories;
    private String description;
    private String plannedDateOfChange;
    private String urlOfNewVersion;

    /**
     * Data categories that are affected from the change of purpose.
     */
    @JsonProperty("affectedDataCategories")
    public List<String> getAffectedDataCategories() { return affectedDataCategories; }
    @JsonProperty("affectedDataCategories")
    public void setAffectedDataCategories(List<String> value) { this.affectedDataCategories = value; }

    /**
     * Description of the change of purpose.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * Specify the planned date to the changes as ISO 8601 string.
     */
    @JsonProperty("plannedDateOfChange")
    public String getPlannedDateOfChange() { return plannedDateOfChange; }
    @JsonProperty("plannedDateOfChange")
    public void setPlannedDateOfChange(String value) { this.plannedDateOfChange = value; }

    /**
     * URL points to a document of the same as this one. That creates a chain of information
     * requirements for seamless recognition of transparency information even over a longer
     * period of time.
     */
    @JsonProperty("urlOfNewVersion")
    public String getURLOfNewVersion() { return urlOfNewVersion; }
    @JsonProperty("urlOfNewVersion")
    public void setURLOfNewVersion(String value) { this.urlOfNewVersion = value; }

    @Override
    public String toString() {
        return "ChangesOfPurposeElement{" +
                "affectedDataCategories=" + affectedDataCategories +
                ", description='" + description + '\'' +
                ", plannedDateOfChange='" + plannedDateOfChange + '\'' +
                ", urlOfNewVersion='" + urlOfNewVersion + '\'' +
                '}';
    }
}
