```java
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import javax.naming.NamingException;
import java.util.List;
import java.util.ArrayList;
import com.hibshards.orm.ShardConfiguration;
import com.hibshards.orm.ShardStrategyFactory;
import com.hibshards.orm.ShardStrategy;
import com.hibshards.orm.ShardId;
import com.hibshards.orm.RoundRobinShardLoadBalancer;
import com.hibshards.orm.RoundRobinShardSelectionStrategy;
import com.hibshards.orm.AllShardsShardResolutionStrategy;
import com.hibshards.orm.SequentialShardAccessStrategy;
import com.hibshards.orm.ShardStrategyImpl;
import com.hibshards.orm.ConfigurationToShardConfigurationAdapter;
```