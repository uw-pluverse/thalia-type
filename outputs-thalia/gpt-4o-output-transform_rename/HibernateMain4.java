```java
import org.hibernate.envers.configuration.internal.AuditConfiguration;
import org.hibernate.envers.internal.entities.PropertyNameGetter;
import org.hibernate.envers.internal.entities.mapper.id.SingleIdMapper;
import org.hibernate.envers.internal.synchronization.work.PersistentCollectionChangeWorkUnit;
import org.hibernate.envers.internal.tools.Triple;
import org.hibernate.envers.internal.tools.MessageHelper;
import org.hibernate.envers.internal.tools.graph.Vertex;
import org.hibernate.envers.internal.tools.graph.ListProxy;
import org.hibernate.envers.internal.tools.graph.PropertyAuditProjection;
import org.hibernate.engine.jdbc.NonContextualLobCreator;
import org.hibernate.event.spi.InitializeCollectionEventListener;
import org.hibernate.persister.walking.spi.Initializor;
import org.hibernate.persister.walking.spi.ReplicationMode;
import org.hibernate.proxy.InterceptorDecorator;
import org.hibernate.tuple.InstantiationOptimizerAdapter;
```