Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sharding.ShardConfiguration;
import org.hibernate.sharding.ShardId;
import org.hibernate.sharding.ShardResolutionStrategy;
import org.hibernate.sharding.ShardSelectionStrategy;
import org.hibernate.sharding.ShardStrategy;
import org.hibernate.sharding.ShardStrategyFactory;
import org.hibernate.sharding.ShardStrategyImpl;
import org.hibernate.sharding.access.SequentialShardAccessStrategy;
import org.hibernate.sharding.resolution.AllShardsShardResolutionStrategy;
import org.hibernate.sharding.selection.RoundRobinShardLoadBalancer;
import org.hibernate.sharding.selection.RoundRobinShardSelectionStrategy;
import org.hibernate.sharding.spi.ConfigurationToShardConfigurationAdapter;

import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;
```