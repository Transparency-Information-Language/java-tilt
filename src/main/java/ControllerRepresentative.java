import com.fasterxml.jackson.annotation.*;

/**
 * The representative is a responsible real person that represents the cloud.implementation.tilt.controller.
 */
public class ControllerRepresentative {
    private String email;
    private String name;
    private String phone;

    /**
     * Email address of the cloud.implementation.tilt.controller's representative.
     */
    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    /**
     * Name of the cloud.implementation.tilt.controller's representative.
     */
    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    /**
     * Phone number of the cloud.implementation.tilt.controller's representative.
     */
    @JsonProperty("phone")
    public String getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(String value) { this.phone = value; }

    @Override
    public String toString() {
        return "ControllerRepresentative{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
