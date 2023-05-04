package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

/**
 * This schema refers to the necessity and consequences of non-disclosure of personal data.
 * According to Art. 13 (2e), this refers to the information whether the provision of the
 * personal data is required by law or contract or is required for the conclusion of a
 * contract, whether the data subject is obliged to provide the personal data and the
 * possible consequences of not providing it.
 */
public class NonDisclosure {
    private String consequences;
    private boolean contractualRegulation;
    private boolean legalRequirement;
    private boolean obligationToProvide;

    /**
     * Description of the consequences in the case of non-disclosure.
     */
    @JsonProperty("consequences")
    public String getConsequences() { return consequences; }
    @JsonProperty("consequences")
    public void setConsequences(String value) { this.consequences = value; }

    /**
     * Is there a contractual regulation to collect these data?
     */
    @JsonProperty("contractualRegulation")
    public boolean getContractualRegulation() { return contractualRegulation; }
    @JsonProperty("contractualRegulation")
    public void setContractualRegulation(boolean value) { this.contractualRegulation = value; }

    /**
     * Is there a legal requirement to collect these data?
     */
    @JsonProperty("legalRequirement")
    public boolean getLegalRequirement() { return legalRequirement; }
    @JsonProperty("legalRequirement")
    public void setLegalRequirement(boolean value) { this.legalRequirement = value; }

    /**
     * Is there an obligation for the data subject to provide these data?
     */
    @JsonProperty("obligationToProvide")
    public boolean getObligationToProvide() { return obligationToProvide; }
    @JsonProperty("obligationToProvide")
    public void setObligationToProvide(boolean value) { this.obligationToProvide = value; }

    @Override
    public String toString() {
        return "NonDisclosure{" +
                "consequences='" + consequences + '\'' +
                ", contractualRegulation=" + contractualRegulation +
                ", legalRequirement=" + legalRequirement +
                ", obligationToProvide=" + obligationToProvide +
                '}';
    }
}
