Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.ShardId;
import org.hibernate.shards.id.AllShardsShardResolutionStrategy;
import org.hibernate.shards.loadbalance.RoundRobinShardLoadBalancer;
import org.hibernate.shards.strategy.access.SequentialShardAccessStrategy;
import org.hibernate.shards.strategy.selection.RoundRobinShardSelectionStrategy;
import org.hibernate.shards.strategy.ShardStrategyFactory;
import org.hibernate.shards.strategy.ShardStrategyImpl;
import org.hibernate.shards.config.ConfigurationToShardConfigurationAdapter;
import org.hibernate.shards.config.ShardedConfiguration;
import org.hibernate.shards.config.ShardConfiguration;
import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;
```