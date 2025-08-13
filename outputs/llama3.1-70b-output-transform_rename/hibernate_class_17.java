Here are the necessary import statements:

```java
import org.hibernate.HibernateException;
import org.hibernate.NamingException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.shards.ShardAccessStrategy;
import org.hibernate.shards.ShardConfiguration;
import org.hibernate.shards.ShardId;
import org.hibernate.shards.ShardResolutionStrategy;
import org.hibernate.shards.ShardSelectionStrategy;
import org.hibernate.shards.ShardStrategy;
import org.hibernate.shards.ShardStrategyFactory;
import org.hibernate.shards.RoundRobinShardLoadBalancer;
import org.hibernate.shards.RoundRobinShardSelectionStrategy;
import org.hibernate.shards.AllShardsShardResolutionStrategy;
import org.hibernate.shards.SequentialShardAccessStrategy;
import org.hibernate.shards.ShardStrategyImpl;
import org.hibernate.shards.ConfigurationToShardConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;
```