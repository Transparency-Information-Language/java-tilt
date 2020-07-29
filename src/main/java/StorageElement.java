import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class StorageElement {
    private AggregationFunction aggregationFunction;
    private List<String> legalBasisConditional;
    private List<String> purposeConditional;
    private List<TemporalElement> temporal;

    /**
     * The aggregation function describes the calculation basis when specifying several time
     * intervals. For example, if there is storage for 2 weeks for technical reasons (e.g.
     * backup), but there is a legally longer retention period, the maximum aggregation function
     * (max) would be selected (standard case). Aggregation functions available: min, max, sum,
     * avg
     */
    @JsonProperty("aggregationFunction")
    public AggregationFunction getAggregationFunction() { return aggregationFunction; }
    @JsonProperty("aggregationFunction")
    public void setAggregationFunction(AggregationFunction value) { this.aggregationFunction = value; }

    /**
     * If the storage is required by law, the respective one has to specified in here.
     */
    @JsonProperty("legalBasisConditional")
    public List<String> getLegalBasisConditional() { return legalBasisConditional; }
    @JsonProperty("legalBasisConditional")
    public void setLegalBasisConditional(List<String> value) { this.legalBasisConditional = value; }

    /**
     * Specifies the purpose that requires data storage.
     */
    @JsonProperty("purposeConditional")
    public List<String> getPurposeConditional() { return purposeConditional; }
    @JsonProperty("purposeConditional")
    public void setPurposeConditional(List<String> value) { this.purposeConditional = value; }

    /**
     * This schema serves to specify a temporal description of how long the data is stored and
     * for what exactly.
     */
    @JsonProperty("temporal")
    public List<TemporalElement> getTemporal() { return temporal; }
    @JsonProperty("temporal")
    public void setTemporal(List<TemporalElement> value) { this.temporal = value; }

    @Override
    public String toString() {
        return "StorageElement{" +
                "aggregationFunction=" + aggregationFunction +
                ", legalBasisConditional=" + legalBasisConditional +
                ", purposeConditional=" + purposeConditional +
                ", temporal=" + temporal +
                '}';
    }
}
