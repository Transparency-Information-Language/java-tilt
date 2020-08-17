![Java CI with Maven](https://github.com/Transparency-Information-Language/java-tilt/workflows/Java%20CI%20with%20Maven/badge.svg) ![Maven Package](https://github.com/Transparency-Information-Language/java-tilt/workflows/Maven%20Package/badge.svg)

# java-tilt
java-tilt is a Java based language binding for the Transparency Information Language and Toolkit.

## Installation
1/2: Add this to pom.xml:
```xml
<dependency>
  <groupId>cloud.implementation.tilt</groupId>
  <artifactId>tilt</artifactId>
  <version>0.0.1</version>
</dependency>
```

2/2: Run via command line:
```bash
$ mvn install
```

## Usage

[**See more examples and tests here**.](https://github.com/Transparency-Information-Language/java-tilt/blob/master/src/test/java/MainTest.java)


```java
/*
    Generate new Tilt instance from scratch
 */

Tilt tilt = new Tilt();

Controller controller = new Controller();
controller.setName("Example Company SE");
tilt.setController(controller);

System.out.println(tilt.toString());
```

```java
/*
    Validation Example
*/

String DOCUMENT_URL = "https://raw.githubusercontent.com/Transparency-Information-Language/schema/master/tilt.json";

TiltValidator.validateDocumentFromUrl(DOCUMENT_URL);
```

```java
/*
    Load tilt instance from json and modify properties
*/
try {
    String instance = IOUtils.toString(URI.create(DOCUMENT_URL), "utf8");

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

```

## Author
Elias Grünewald

## License
[GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.de.html)