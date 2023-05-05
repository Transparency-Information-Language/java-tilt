package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;


public class Source {
    private String id;
    private String dataCategory;
    private List<SourceSource> sources;

    /**
     * This refers to an locally unique ID in an arbitrary but deterministic format.
     */
    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    /**
     * The category the data refer to.
     */
    @JsonProperty("dataCategory")
    public String getDataCategory() { return dataCategory; }
    @JsonProperty("dataCategory")
    public void setDataCategory(String value) { this.dataCategory = value; }

    /**
     * Specify the source(s) where the data come from.
     */
    @JsonProperty("sources")
    public List<SourceSource> getSources() { return sources; }

    @Override
    public String toString() {
        return "Source{" +
                "id='" + id + '\'' +
                ", dataCategory='" + dataCategory + '\'' +
                ", sources=" + sources +
                '}';
    }

    @JsonProperty("sources")
    public void setSources(List<SourceSource> value) { this.sources = value; }
}
