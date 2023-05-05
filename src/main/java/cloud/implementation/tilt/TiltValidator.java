package cloud.implementation.tilt;

import org.apache.commons.io.IOUtils;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.URI;

public class TiltValidator {

    public static final String TILT_SCHEMA_URL = "https://raw.githubusercontent.com/Transparency-Information-Language/schema/master/tilt-schema.json";

    /*
        Returns true if document is valid according to given schema
     */
    public static boolean validateDocumentFromUrl(String documentUrl, String schemaUrl) {
        try {
            String schema_content = IOUtils.toString(URI.create(schemaUrl), "utf8");
            JSONObject rawSchema = new JSONObject(new JSONTokener(schema_content));
            Schema schema = SchemaLoader.load(rawSchema);

            String instance_content = IOUtils.toString(URI.create(documentUrl), "utf8");
            schema.validate(new JSONObject(instance_content));

            System.out.println("Document " + documentUrl + " seems to be valid!\n");
            return true;
        } catch (ValidationException e) {
            for(String s : e.getAllMessages())
                System.out.println(s);
            //for(Exception ex : e.getCausingExceptions())
            //    System.out.println(ex.getMessage());
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /*
        Validate by standard tilt schema
     */
    public static boolean validateDocumentFromUrl(String documentUrl) {
        return validateDocumentFromUrl(documentUrl, TILT_SCHEMA_URL);
    }


}