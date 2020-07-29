

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private static Tilt tilt;


    @BeforeClass
    public static void testSetup() {
        tilt = new Tilt();

        Meta m = new Meta();
        m.setLanguage("de");
        m.setName("My Green Company");
        m.setURL("https://privacy.implementation.cloud");

        tilt.setMeta(m);
    }


    @Test
    public void initFirstDocument() {
        assertEquals("Result", "de", tilt.getMeta().getLanguage());

        System.out.println(tilt.getMeta());
        System.out.println(tilt);
    }

    @Test
    public void printJsonDocument() {
        try {
            String result = Converter.toJsonString(tilt);
            System.out.println(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void readDocumentFromUrl() {
        try {

            String url = "https://raw.githubusercontent.com/Transparency-Information-Language/schema/master/tilt.json";
            String instance = IOUtils.toString(URI.create(url), "utf8");

            System.out.println(instance.indexOf("meta"));

            Tilt t = Converter.fromJsonString(instance);

            System.out.println(t.getMeta().getHash());

            t.getMeta().setHash("42");

            System.out.println(Converter.toJsonString(t));

            System.out.println(t.getMeta().toString());
            System.out.println(t.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void prettyPrintJson() throws IOException {
        JSONObject jsonObject = new JSONObject(Converter.toJsonString(tilt));
        System.out.println(jsonObject.toString(4));
    }

    @Test
    public void getAnotherInstance() throws IOException {
        String url = "https://raw.githubusercontent.com/Transparency-Information-Language/schema/master/tilt.json";
        String instance = IOUtils.toString(URI.create(url), "utf8");

        Tilt t = Converter.fromJsonString(instance);
        System.out.println("t = " + t);

        prettyPrintTilt(t);
    }



    @Test
    public void generateSources() throws JsonProcessingException {
        ArrayList<TiltSource> tiltSourceList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            TiltSource tiltSource = new TiltSource();
            tiltSource.setID("" + Math.random());
            tiltSource.setDataCategory(UUID.randomUUID().toString());
            ArrayList<SourceSource> sourceSources = new ArrayList<>();
            SourceSource sourceSource = new SourceSource();
            sourceSource.setDescription("ABC");
            sourceSource.setPubliclyAvailable(true);
            sourceSource.setURL("https://" + UUID.randomUUID().toString() + ".org");
            sourceSources.add(sourceSource);
            tiltSource.setSources(sourceSources);
            tiltSourceList.add(tiltSource);
        }

        tilt.setSources(tiltSourceList);

        prettyPrintTilt(tilt);
    }



    private void prettyPrintTilt(Tilt t) throws JsonProcessingException {
        JSONObject jsonObject = new JSONObject(Converter.toJsonString(t));
        System.out.println(jsonObject.toString(4));
    }

    @Test
    public void loopThroughThemAll() {
        for (Field f : tilt.getClass().getDeclaredFields()) {
            System.out.println(f.toString());
        }

        System.out.println(tilt.getMeta().toString());
    }
}

