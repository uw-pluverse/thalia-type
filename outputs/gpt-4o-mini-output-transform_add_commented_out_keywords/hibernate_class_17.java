```java
import org.hibernate.cfg.Configuration;
import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;
import com.hibshards.orm.ShardConfiguration;
import com.hibshards.orm.ShardId;
import com.hibshards.strategy.ShardStrategy;
import com.hibshards.strategy.ShardStrategyFactory;
import com.hibshards.strategy.RoundRobinShardLoadBalancer;
import com.hibshards.strategy.RoundRobinShardSelectionStrategy;
import com.hibshards.strategy.AllShardsShardResolutionStrategy;
import com.hibshards.strategy.SequentialShardAccessStrategy;
import com.hibshards.strategy.ShardStrategyImpl;
import com.hibshards.config.ShardedConfiguration;
```