Here are the necessary import statements:

```java
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import javax.persistence.EntityMode;
import javax.persistence.FlushMode;

import org.hibernate.QueryTimeoutException;
import org.hibernate.FlushEntityEventListener;
import org.hibernate.ShardedTransactionImpl;

import net.sf.cglib.core.AbstractClassGenerator;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;
import net.sf.cglib.proxy.Proxy;
import net.sf.cglib.proxy.ProxyFactory;
import net.sf.cglib.proxy.ProxyHelper;

import org.hibernate.collection.PersistentCollection;
import org.hibernate.collection.PersistentMap;
import org.hibernate.collection.PersistentList;
import org.hibernate.collection.PersistentSet;

import org.hibernate.engine.spi.JoinType;
import org.hibernate.event.spi.EventType;
import org.hibernate.event.spi.FlushEvent;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.SaveEvent;
import org.hibernate.event.spi.DeleteEvent;
import org.hibernate.event.spi.UpdateEvent;
import org.hibernate.event.spi.CollectionInitializeOrDeleteEvent;

import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.StatefulPersistenceContext;
import org.hibernate.engine.spi.PersistenceContext;

import org.hibernate.type.Type;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.TypeFactory;
```