Here are the necessary import statements:

```java
import org.joda.time.DateTime;
import org.joda.time.Weeks;
```

Note that Joda-Time is a separate library from Java, so you need to ensure you have it in your classpath. If you're using Maven or Gradle, add the following dependency to your project file:

Maven:
```xml
<dependency>
    <groupId>joda-time</groupId>
    <artifactId>joda-time</artifactId>
    <version>2.10.13</version>
</dependency>
```

Gradle:
```groovy
dependencies {
    implementation 'joda-time:joda-time:2.10.13'
}
```