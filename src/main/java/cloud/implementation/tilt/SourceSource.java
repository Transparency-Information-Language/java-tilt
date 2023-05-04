package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class SourceSource {
    private String description;
    private Origin origin;
    private boolean publiclyAvailable;
    private List<String> url;

    /**
     * Description of the source the data is taken from.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    /**
     * How was the data obtained?
     */
    @JsonProperty("origin")
    public Origin getOrigin() { return origin; }
    @JsonProperty("origin")
    public void setOrigin(Origin value) { this.origin = value; }

    /**
     * Are these data publicly available?
     */
    @JsonProperty("publiclyAvailable")
    public boolean getPubliclyAvailable() { return publiclyAvailable; }
    @JsonProperty("publiclyAvailable")
    public void setPubliclyAvailable(boolean value) { this.publiclyAvailable = value; }

    /**
     * URL (reference) where the data is taken from.
     */
    @JsonProperty("url")
    public List<String> getURL() { return url; }
    @JsonProperty("url")
    public void setURL(List<String> value) { this.url = value; }

    @Override
    public String toString() {
        return "SourceSource{" +
                "description='" + description + '\'' +
                ", origin=" + origin +
                ", publiclyAvailable=" + publiclyAvailable +
                ", url='" + url + '\'' +
                '}';
    }
}
