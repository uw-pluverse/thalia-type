Here are the necessary import statements:

```java
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.RoundingMode;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
```

Note that I've only included the necessary imports, which are:

* `DecimalFormat` and its related classes (`DecimalFormatSymbols`) for formatting numbers
* `Locale` for getting the default locale
* `RoundingMode` for setting the rounding mode in the `DecimalFormat`
* `NumberFormat` is not actually used in this code, but I've included it as a precautionary measure in case you need to use it elsewhere.