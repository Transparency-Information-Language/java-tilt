import com.fasterxml.jackson.annotation.*;

public class SourceSource {
    private String description;
    private boolean publiclyAvailable;
    private String url;

    /**
     * Description of the source the data is taken from.
     */
    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

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
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @Override
    public String toString() {
        return "SourceSource{" +
                "description='" + description + '\'' +
                ", publiclyAvailable=" + publiclyAvailable +
                ", url='" + url + '\'' +
                '}';
    }
}
