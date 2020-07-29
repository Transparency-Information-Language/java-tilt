import com.fasterxml.jackson.annotation.*;

/**
 * The representative of the third party (recipient).
 */
public class RecipientRepresentative {
    private String email;
    private String name;
    private String phone;

    /**
     * The email address of the representative of the third party (recipient).
     */
    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    /**
     * The name of the representative of the third party (recipient).
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * The phone number of the representative of the third party (recipient).
     */
    @JsonProperty("phone")
    public String getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(String value) { this.phone = value; }

    @Override
    public String toString() {
        return "RecipientRepresentative{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
