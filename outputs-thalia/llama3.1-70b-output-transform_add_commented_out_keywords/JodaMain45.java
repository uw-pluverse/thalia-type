import org.joda.time.BasicGJChronology;
import org.joda.time.ReadablePartial;

Note: The MIDNIGHT constant is not imported as it's not clear where it comes from. If it's a custom constant, you should import the class that defines it. If it's a standard Joda-Time constant, it's likely `org.joda.time.DateTimeFieldConstants.MIDNIGHT` or similar.