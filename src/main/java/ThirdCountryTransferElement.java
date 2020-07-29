import com.fasterxml.jackson.annotation.*;

public class ThirdCountryTransferElement {
    private AdequacyDecision adequacyDecision;
    private AppropriateGuarantees appropriateGuarantees;
    private String country;
    private PresenceOfEnforceableRightsAndEffectiveRemedies presenceOfEnforceableRightsAndEffectiveRemedies;
    private StandardDataProtectionClause standardDataProtectionClause;

    @JsonProperty("adequacyDecision")
    public AdequacyDecision getAdequacyDecision() { return adequacyDecision; }
    @JsonProperty("adequacyDecision")
    public void setAdequacyDecision(AdequacyDecision value) { this.adequacyDecision = value; }

    /**
     * Suitable guarantees according to Art. 45
     */
    @JsonProperty("appropriateGuarantees")
    public AppropriateGuarantees getAppropriateGuarantees() { return appropriateGuarantees; }
    @JsonProperty("appropriateGuarantees")
    public void setAppropriateGuarantees(AppropriateGuarantees value) { this.appropriateGuarantees = value; }

    /**
     * The country code of the third country.
     */
    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    /**
     * Presence of enforceable rights and effective remedies
     */
    @JsonProperty("presenceOfEnforceableRightsAndEffectiveRemedies")
    public PresenceOfEnforceableRightsAndEffectiveRemedies getPresenceOfEnforceableRightsAndEffectiveRemedies() { return presenceOfEnforceableRightsAndEffectiveRemedies; }
    @JsonProperty("presenceOfEnforceableRightsAndEffectiveRemedies")
    public void setPresenceOfEnforceableRightsAndEffectiveRemedies(PresenceOfEnforceableRightsAndEffectiveRemedies value) { this.presenceOfEnforceableRightsAndEffectiveRemedies = value; }

    /**
     * Schema on Standard Data Protection clauses.
     */
    @JsonProperty("standardDataProtectionClause")
    public StandardDataProtectionClause getStandardDataProtectionClause() { return standardDataProtectionClause; }
    @JsonProperty("standardDataProtectionClause")
    public void setStandardDataProtectionClause(StandardDataProtectionClause value) { this.standardDataProtectionClause = value; }

    @Override
    public String toString() {
        return "ThirdCountryTransferElement{" +
                "adequacyDecision=" + adequacyDecision +
                ", appropriateGuarantees=" + appropriateGuarantees +
                ", country='" + country + '\'' +
                ", presenceOfEnforceableRightsAndEffectiveRemedies=" + presenceOfEnforceableRightsAndEffectiveRemedies +
                ", standardDataProtectionClause=" + standardDataProtectionClause +
                '}';
    }
}
