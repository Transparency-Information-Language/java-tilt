import com.fasterxml.jackson.annotation.*;

/**
 * Automated decision making and potentially involved logic. Does include profiling.
 */
public class AutomatedDecisionMaking {
    private Boolean inUse;
    private String logicInvolved;
    private String scopeAndIntendedEffects;

    /**
     * Is automated decision making in use?
     */
    @JsonProperty("inUse")
    public Boolean getInUse() { return inUse; }
    @JsonProperty("inUse")
    public void setInUse(Boolean value) { this.inUse = value; }

    /**
     * An explanation about the logic involved to automated decision making.
     */
    @JsonProperty("logicInvolved")
    public String getLogicInvolved() { return logicInvolved; }
    @JsonProperty("logicInvolved")
    public void setLogicInvolved(String value) { this.logicInvolved = value; }

    /**
     * Scope and intended effects of such processing for the data subject.
     */
    @JsonProperty("scopeAndIntendedEffects")
    public String getScopeAndIntendedEffects() { return scopeAndIntendedEffects; }
    @JsonProperty("scopeAndIntendedEffects")
    public void setScopeAndIntendedEffects(String value) { this.scopeAndIntendedEffects = value; }

    @Override
    public String toString() {
        return "AutomatedDecisionMaking{" +
                "inUse=" + inUse +
                ", logicInvolved='" + logicInvolved + '\'' +
                ", scopeAndIntendedEffects='" + scopeAndIntendedEffects + '\'' +
                '}';
    }
}
