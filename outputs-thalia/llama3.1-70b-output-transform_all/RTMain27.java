import java.io.Writer;
import java.text.DecimalFormatSymbols;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

Note: Adjustable is not a standard Java class, so I assume it's a custom interface or class. If that's the case, you should import it from its package.

Also, note that IllegalMonitorStateException is not typically used as a value type in a ConcurrentHashMap. It's usually thrown as an exception when a thread tries to wait on an object without owning its monitor.