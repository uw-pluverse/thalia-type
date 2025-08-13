Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.ShardStrategyFactory;
import org.hibernate.engine.ShardedConfiguration;
import org.hibernate.shards.id.ShardId;
import org.hibernate.shards.loadbalance.RoundRobinShardLoadBalancer;
import org.hibernate.shards.resolution.AllShardsShardResolutionStrategy;
import org.hibernate.shards.selection.RoundRobinShardSelectionStrategy;
import org.hibernate.shards.strategy.access.SequentialShardAccessStrategy;
import org.hibernate.shards.strategy.ShardConfiguration;
import org.hibernate.shards.strategy.ShardStrategyImpl;
import org.hibernate.shards.util.ConfigurationToShardConfigurationAdapter;

import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;
```