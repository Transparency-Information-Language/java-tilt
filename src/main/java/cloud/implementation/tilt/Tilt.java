package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This schema defines the Transparency Information Language
 */
public class Tilt {
    private Meta meta;
    private Controller controller;
    private DataProtectionOfficer dataProtectionOfficer;
    private List<DataDisclosedElement> dataDisclosed;
    private List<ThirdCountryTransferElement> thirdCountryTransfers;
    private AccessAndDataPortability accessAndDataPortability;
    private List<Source> sources;
    private RightToInformation rightToInformation;
    private RightToRectificationOrDeletion rightToRectificationOrDeletion;
    private RightToDataPortability rightToDataPortability;
    private RightToWithdrawConsent rightToWithdrawConsent;
    private RightToComplain rightToComplain;
    private AutomatedDecisionMaking automatedDecisionMaking;
    private List<ChangesOfPurposeElement> changesOfPurpose;

    /**
     * Defining the right to access and data portability.
     */
    @JsonProperty("accessAndDataPortability")
    public AccessAndDataPortability getAccessAndDataPortability() { return accessAndDataPortability; }
    @JsonProperty("accessAndDataPortability")
    public void setAccessAndDataPortability(AccessAndDataPortability value) { this.accessAndDataPortability = value; }

    /**
     * Automated decision making and potentially involved logic. Does include profiling.
     */
    @JsonProperty("automatedDecisionMaking")
    public AutomatedDecisionMaking getAutomatedDecisionMaking() { return automatedDecisionMaking; }
    @JsonProperty("automatedDecisionMaking")
    public void setAutomatedDecisionMaking(AutomatedDecisionMaking value) { this.automatedDecisionMaking = value; }

    /**
     * Notification of change of purpose.
     */
    @JsonProperty("changesOfPurpose")
    public List<ChangesOfPurposeElement> getChangesOfPurpose() { return changesOfPurpose; }
    @JsonProperty("changesOfPurpose")
    public void setChangesOfPurpose(List<ChangesOfPurposeElement> value) { this.changesOfPurpose = value; }

    /**
     * The responsible controller is defined in here.
     */
    @JsonProperty("controller")
    public Controller getController() { return controller; }
    @JsonProperty("controller")
    public void setController(Controller value) { this.controller = value; }

    /**
     * A detailed explanation about which data is disclosed in the processing tasks.
     */
    @JsonProperty("dataDisclosed")
    public List<DataDisclosedElement> getDataDisclosed() { return dataDisclosed; }
    @JsonProperty("dataDisclosed")
    public void setDataDisclosed(List<DataDisclosedElement> value) { this.dataDisclosed = value; }

    /**
     * The Data Protection Officer (DPO) of the controller.
     */
    @JsonProperty("dataProtectionOfficer")
    public DataProtectionOfficer getDataProtectionOfficer() { return dataProtectionOfficer; }
    @JsonProperty("dataProtectionOfficer")
    public void setDataProtectionOfficer(DataProtectionOfficer value) { this.dataProtectionOfficer = value; }

    /**
     * Meta information for the identification and verification of the document.
     */
    @JsonProperty("meta")
    public Meta getMeta() { return meta; }
    @JsonProperty("meta")
    public void setMeta(Meta value) { this.meta = value; }

    /**
     * This schema refers to the right to complain.
     */
    @JsonProperty("rightToComplain")
    public RightToComplain getRightToComplain() { return rightToComplain; }
    @JsonProperty("rightToComplain")
    public void setRightToComplain(RightToComplain value) { this.rightToComplain = value; }

    /**
     * The right to data portability as stated in Art. 20 GDPR.
     */
    @JsonProperty("rightToDataPortability")
    public RightToDataPortability getRightToDataPortability() { return rightToDataPortability; }
    @JsonProperty("rightToDataPortability")
    public void setRightToDataPortability(RightToDataPortability value) { this.rightToDataPortability = value; }

    /**
     * Refers to the right of information.
     */
    @JsonProperty("rightToInformation")
    public RightToInformation getRightToInformation() { return rightToInformation; }
    @JsonProperty("rightToInformation")
    public void setRightToInformation(RightToInformation value) { this.rightToInformation = value; }

    /**
     * This schema refers to the right to rectification or deletion (Art. 16 GDPR).
     */
    @JsonProperty("rightToRectificationOrDeletion")
    public RightToRectificationOrDeletion getRightToRectificationOrDeletion() { return rightToRectificationOrDeletion; }
    @JsonProperty("rightToRectificationOrDeletion")
    public void setRightToRectificationOrDeletion(RightToRectificationOrDeletion value) { this.rightToRectificationOrDeletion = value; }

    /**
     * This schema refers to the right to withdraw consent.
     */
    @JsonProperty("rightToWithdrawConsent")
    public RightToWithdrawConsent getRightToWithdrawConsent() { return rightToWithdrawConsent; }
    @JsonProperty("rightToWithdrawConsent")
    public void setRightToWithdrawConsent(RightToWithdrawConsent value) { this.rightToWithdrawConsent = value; }

    /**
     * This duty to provide information is limited to the collection of personal data that does
     * not take place from the data subject (Art. 14).
     */
    @JsonProperty("sources")
    public List<Source> getSources() { return sources; }
    @JsonProperty("sources")
    public void setSources(List<Source> value) { this.sources = value; }

    /**
     * This schema refers to the adequacy decisions of any third country transfers.
     */
    @JsonProperty("thirdCountryTransfers")
    public List<ThirdCountryTransferElement> getThirdCountryTransfers() { return thirdCountryTransfers; }
    @JsonProperty("thirdCountryTransfers")
    public void setThirdCountryTransfers(List<ThirdCountryTransferElement> value) { this.thirdCountryTransfers = value; }

    @Override
    public String toString() {
        return "Tilt{" +
                "meta=" + meta +
                ", controller=" + controller +
                ", dataProtectionOfficer=" + dataProtectionOfficer +
                ", dataDisclosed=" + dataDisclosed +
                ", thirdCountryTransfers=" + thirdCountryTransfers +
                ", accessAndDataPortability=" + accessAndDataPortability +
                ", sources=" + sources +
                ", rightToInformation=" + rightToInformation +
                ", rightToRectificationOrDeletion=" + rightToRectificationOrDeletion +
                ", rightToDataPortability=" + rightToDataPortability +
                ", rightToWithdrawConsent=" + rightToWithdrawConsent +
                ", rightToComplain=" + rightToComplain +
                ", automatedDecisionMaking=" + automatedDecisionMaking +
                ", changesOfPurpose=" + changesOfPurpose +
                '}';
    }
}
