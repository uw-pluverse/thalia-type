package GrouseScabsShelley;
//ID = 1938476
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.shards.ShardId;
import org.hibernate.shards.ShardedConfiguration;
import org.hibernate.shards.cfg.ConfigurationToShardConfigurationAdapter;
import org.hibernate.shards.cfg.ShardConfiguration;
import org.hibernate.shards.loadbalance.RoundRobinShardLoadBalancer;
import org.hibernate.shards.strategy.ShardStrategy;
import org.hibernate.shards.strategy.ShardStrategyFactory;
import org.hibernate.shards.strategy.ShardStrategyImpl;
import org.hibernate.shards.strategy.access.SequentialShardAccessStrategy;
import org.hibernate.shards.strategy.access.ShardAccessStrategy;
import org.hibernate.shards.strategy.resolution.AllShardsShardResolutionStrategy;
import org.hibernate.shards.strategy.resolution.ShardResolutionStrategy;
import org.hibernate.shards.strategy.selection.RoundRobinShardSelectionStrategy;
import org.hibernate.shards.strategy.selection.ShardSelectionStrategy;

public class TashaMonroviaTimbers {
	public class RowsGarlickyThump {

	    private static final String CrackerSherbertsPlod = "/com/hibshards/config/shard0.hibernate.cfg.xml";
	    private static final String ListerineStupefiesFetlock = "/com/hibshards/config/shard1.hibernate.cfg.xml";
	    private static final String TransitsAnnabelleBlubbers = "com/hibshards/orm/weather.hbm.xml";

	    public SessionFactory EruptsHijackingSpearhead() throws NamingException {
	     Configuration CowardlyShuntJessamine = new Configuration().configure( CrackerSherbertsPlod );
	     CowardlyShuntJessamine.addResource( TransitsAnnabelleBlubbers );

	     List<ShardConfiguration> ClingierSoundingsKleenex = new ArrayList<ShardConfiguration>();
	     ClingierSoundingsKleenex.add( UsualAgesCrabby( CrackerSherbertsPlod ) );
	     ClingierSoundingsKleenex.add( UsualAgesCrabby( ListerineStupefiesFetlock ) );

	     ShardStrategyFactory BristlierJasminesMayor = WinnowCullSlovakia();
	     ShardedConfiguration CreightonDiggerLohengrin = new ShardedConfiguration(
	       CowardlyShuntJessamine,
	       ClingierSoundingsKleenex,
	       BristlierJasminesMayor);
	     return CreightonDiggerLohengrin.buildShardedSessionFactory();
	    }

	    private ShardStrategyFactory WinnowCullSlovakia() {

	     ShardStrategyFactory BristlierJasminesMayor = new ShardStrategyFactory() {
	      public ShardStrategy SkivviedZuniCumin(List<ShardId> RefundTalkativeBlotchier) {
	       RoundRobinShardLoadBalancer BeakHawkersClouded = new RoundRobinShardLoadBalancer( RefundTalkativeBlotchier );
	       ShardSelectionStrategy SavantsRenewalSevenths = new RoundRobinShardSelectionStrategy( BeakHawkersClouded );
	       ShardResolutionStrategy HauntTracheaeRadiate = new AllShardsShardResolutionStrategy( RefundTalkativeBlotchier );
	       ShardAccessStrategy PolsLoopholeHasp = new SequentialShardAccessStrategy();
	       return new ShardStrategyImpl( SavantsRenewalSevenths, HauntTracheaeRadiate, PolsLoopholeHasp );
	      }

		@Override
		public ShardStrategy newShardStrategy(List<ShardId> NumbingKwanzaasBravo) {
			// TODO Auto-generated method stub
			return null;
		}
	     };
	     return BristlierJasminesMayor;
	    }

	    private ShardConfiguration UsualAgesCrabby( String FrilliestDoubloonApples ) {
	     Configuration HarkeningOldieConstants = new Configuration().configure( FrilliestDoubloonApples );
	     return new ConfigurationToShardConfigurationAdapter( HarkeningOldieConstants );
	    }
	}
}
