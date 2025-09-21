```java
import org.hibernate.cfg.Configuration;
import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;
import com.hibshards.orm.ShardConfiguration;
import com.hibshards.orm.ShardId;
import com.hibshards.strategy.ShardStrategy;
import com.hibshards.strategy.ShardStrategyFactory;
import com.hibshards.strategy.impl.ShardStrategyImpl;
import com.hibshards.strategy.impl.RoundRobinShardLoadBalancer;
import com.hibshards.strategy.impl.RoundRobinShardSelectionStrategy;
import com.hibshards.strategy.impl.AllShardsShardResolutionStrategy;
import com.hibshards.strategy.impl.SequentialShardAccessStrategy;
import com.hibshards.configuration.ShardedConfiguration;
```