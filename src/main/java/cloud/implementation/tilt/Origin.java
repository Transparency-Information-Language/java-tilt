package cloud.implementation.tilt;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * How was the data obtained?
 */
public enum Origin {
    INFERRED, OBSERVED, RECEIVED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INFERRED: return "inferred";
            case OBSERVED: return "observed";
            case RECEIVED: return "received";
        }
        return null;
    }

    @JsonCreator
    public static Origin forValue(String value) throws IOException {
        if (value.equals("inferred")) return INFERRED;
        if (value.equals("observed")) return OBSERVED;
        if (value.equals("received")) return RECEIVED;
        throw new IOException("Cannot deserialize Origin");
    }
}
