import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The aggregation function describes the calculation basis when specifying several time
 * intervals. For example, if there is storage for 2 weeks for technical reasons (e.g.
 * backup), but there is a legally longer retention period, the maximum aggregation function
 * (max) would be selected (standard case). Aggregation functions available: min, max, sum,
 * avg
 */
public enum AggregationFunction {
    AVG, MAX, MIN, SUM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AVG: return "avg";
            case MAX: return "max";
            case MIN: return "min";
            case SUM: return "sum";
        }
        return null;
    }

    @JsonCreator
    public static AggregationFunction forValue(String value) throws IOException {
        if (value.equals("avg")) return AVG;
        if (value.equals("max")) return MAX;
        if (value.equals("min")) return MIN;
        if (value.equals("sum")) return SUM;
        throw new IOException("Cannot deserialize AggregationFunction");
    }
}
