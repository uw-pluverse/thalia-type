Here are the necessary import statements:

```java
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.UnaryOperator;

import javax.swing.event.BeanContextEvent;
import javax.swing.plaf.synth.SynthStyleFactory;

import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.beans.beancontext.BeanContextEvent;
import java.sql.CallableStatement;
import java.text.MessageFormat;
import java.time.temporal.ChronoUnit;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Entry;
import java.util.LinkedBlockingDeque;
import java.util.LinkedBlockingQueue;
import java.util.Map;
import java.util.PriorityBlockingQueue;
import java.util.SimpleImmutableEntry;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.accessibility.AccessibleComponent;
```

However, I noticed that some of the classes used in your code are not part of the standard Java API. For example, `SimpleImmutableEntry` is not a standard class. If you meant to use `AbstractMap.SimpleImmutableEntry`, then you should import it correctly.

Also, note that `SynthStyleFactory` is not actually used in your code, so I would recommend removing its import statement.

Here's the corrected list of import statements:

```java
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.UnaryOperator;

import javax.swing.event.BeanContextEvent;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.beans.beancontext.BeanContextEvent;
import java.sql.CallableStatement;
import java.text.MessageFormat;
import java.time.temporal.ChronoUnit;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Entry;
import java.util.LinkedBlockingDeque;
import java.util.LinkedBlockingQueue;
import java.util.Map;
import java.util.PriorityBlockingQueue;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.accessibility.AccessibleComponent;
```