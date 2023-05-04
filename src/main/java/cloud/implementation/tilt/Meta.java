package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Meta information for the identification and verification of the document.
 */
public class Meta {
    private String hash;
    private String id;
    private String created;
    private String language;
    private String modified;
    private String name;
    private String status;
    private List<String> url;
    private long version;

    /**
     * The hash is based on one SHA256 calculation of the document.
     */
    @JsonProperty("_hash")
    public String getHash() { return hash; }
    @JsonProperty("_hash")
    public void setHash(String value) { this.hash = value; }

    /**
     * The ID follows the database-specific implementation and does not have to be set in
     * advance; but should offer as much entropy as possible for globally unique identifiers.
     */
    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    /**
     * Creation date of the document as an ISO-8601 time code.
     */
    @JsonProperty("created")
    public String getCreated() { return created; }
    @JsonProperty("created")
    public void setCreated(String value) { this.created = value; }

    /**
     * All language abbreviation codes follow the established ISO 639-1 standard as identifiers
     * for names of languages.
     */
    @JsonProperty("language")
    public String getLanguage() { return language; }
    @JsonProperty("language")
    public void setLanguage(String value) { this.language = value; }

    /**
     * Last modified date of the document as an ISO-8601 time code.
     */
    @JsonProperty("modified")
    public String getModified() { return modified; }
    @JsonProperty("modified")
    public void setModified(String value) { this.modified = value; }

    /**
     * Name of the data controller.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The status of an instance can be active or inactive depending on the policy's legal force.
     */
    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    /**
     * URL(s) to the privacy policy of this schema. Multiple URLs can be used in case of
     * potential sub-entities pointing to the same entity
     */
    @JsonProperty("url")
    public List<String> getURL() { return url; }
    @JsonProperty("url")
    public void setURL(List<String> value) { this.url = value; }

    /**
     * This number serves to version documents of a controller.
     */
    @JsonProperty("version")
    public long getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(long value) { this.version = value; }

    @Override
    public String toString() {
        return "Meta{" +
                "hash='" + hash + '\'' +
                ", id='" + id + '\'' +
                ", created='" + created + '\'' +
                ", language='" + language + '\'' +
                ", modified='" + modified + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                ", version=" + version +
                '}';
    }
}
