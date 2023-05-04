package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * The description of data disclosed.
 */
public class DataDisclosedElement {
    private String id;
    private List<String> category;
    private List<AnyOfSchemaForTheLegalBasesOfTheDataDisclosed> legalBases;
    private List<AnyOfSchemaForLegitimateInterests> legitimateInterests;
    private NonDisclosure nonDisclosure;
    private List<AnyOfSchemaForThePurposes> purposes;
    private List<Recipient> recipients;
    private List<StorageElement> storage;

    /**
     * The id of a data item that is disclosed. The id is necessary to distinguish several
     * processing tasks of the same data item (locally unique ID that can be based on the
     * database implementation).
     */
    @JsonProperty("_id")
    public String getID() { return id; }
    @JsonProperty("_id")
    public void setID(String value) { this.id = value; }

    /**
     * The data (category/categories) the data disclosed are referred to. Can be multiple
     */
    @JsonProperty("category")
    public List<String> getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(List<String> value) { this.category = value; }

    /**
     * An explanation about the legal bases for the processing of personal data disclosed.
     */
    @JsonProperty("legalBases")
    public List<AnyOfSchemaForTheLegalBasesOfTheDataDisclosed> getLegalBases() { return legalBases; }
    @JsonProperty("legalBases")
    public void setLegalBases(List<AnyOfSchemaForTheLegalBasesOfTheDataDisclosed> value) { this.legalBases = value; }

    /**
     * An explanation about the legitimate interests for the processing of data disclosed.
     */
    @JsonProperty("legitimateInterests")
    public List<AnyOfSchemaForLegitimateInterests> getLegitimateInterests() { return legitimateInterests; }
    @JsonProperty("legitimateInterests")
    public void setLegitimateInterests(List<AnyOfSchemaForLegitimateInterests> value) { this.legitimateInterests = value; }

    /**
     * This schema refers to the necessity and consequences of non-disclosure of personal data.
     * According to Art. 13 (2e), this refers to the information whether the provision of the
     * personal data is required by law or contract or is required for the conclusion of a
     * contract, whether the data subject is obliged to provide the personal data and the
     * possible consequences of not providing it.
     */
    @JsonProperty("nonDisclosure")
    public NonDisclosure getNonDisclosure() { return nonDisclosure; }
    @JsonProperty("nonDisclosure")
    public void setNonDisclosure(NonDisclosure value) { this.nonDisclosure = value; }

    /**
     * The purpose for which a data item is processed for.
     */
    @JsonProperty("purposes")
    public List<AnyOfSchemaForThePurposes> getPurposes() { return purposes; }
    @JsonProperty("purposes")
    public void setPurposes(List<AnyOfSchemaForThePurposes> value) { this.purposes = value; }

    /**
     * An explanation about the recipients of the data disclosed.
     */
    @JsonProperty("recipients")
    public List<Recipient> getRecipients() { return recipients; }
    @JsonProperty("recipients")
    public void setRecipients(List<Recipient> value) { this.recipients = value; }

    /**
     * In this section, the duration of storage or storage criteria are given.
     */
    @JsonProperty("storage")
    public List<StorageElement> getStorage() { return storage; }
    @JsonProperty("storage")
    public void setStorage(List<StorageElement> value) { this.storage = value; }

    @Override
    public String toString() {
        return "DataDisclosedElement{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", legalBases=" + legalBases +
                ", legitimateInterests=" + legitimateInterests +
                ", nonDisclosure=" + nonDisclosure +
                ", purposes=" + purposes +
                ", recipients=" + recipients +
                ", storage=" + storage +
                '}';
    }
}
