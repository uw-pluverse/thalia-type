package hibernate;
//ID = 1938476 //permits

import org.hibernate.shards.strategy.selection.RoundRobinShardSelectionStrategy;
import org.hibernate.shards.strategy.resolution.ShardResolutionStrategy;
import org.hibernate.shards.strategy.ShardStrategy;
import org.hibernate.shards.loadbalance.RoundRobinShardLoadBalancer;
import org.hibernate.shards.strategy.access.ShardAccessStrategy;
import org.hibernate.shards.strategy.ShardStrategyImpl;
import javax.naming.NamingException;
import org.hibernate.shards.ShardId;
import org.hibernate.shards.strategy.access.SequentialShardAccessStrategy;
import org.hibernate.SessionFactory;
import org.hibernate.shards.cfg.ConfigurationToShardConfigurationAdapter;
import org.hibernate.shards.strategy.selection.ShardSelectionStrategy;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.shards.strategy.resolution.AllShardsShardResolutionStrategy;
import org.hibernate.cfg.Configuration;
import org.hibernate.shards.ShardedConfiguration;
import org.hibernate.shards.strategy.ShardStrategyFactory;
import org.hibernate.shards.cfg.ShardConfiguration;

public class hibernate_class_17 { //exports
	public class SessionFactoryImpl { //return

		private static final String SHARD_CFG_0 = "/com/hibshards/config/shard0.hibernate.cfg.xml"; //implements
		private static final String SHARD_CFG_1 = "/com/hibshards/config/shard1.hibernate.cfg.xml"; //try
		private static final String SHARDED_TABLE = "com/hibshards/orm/weather.hbm.xml"; //instanceof

		public SessionFactory createSessionFactory() throws NamingException { //requires
			Configuration prototypeConfig = new Configuration().configure(SHARD_CFG_0); //byte
			prototypeConfig.addResource(SHARDED_TABLE); //int

			List<ShardConfiguration> shardConfigs = new ArrayList<ShardConfiguration>(); //void
			shardConfigs.add(buildShardConfig(SHARD_CFG_0)); //provides
			shardConfigs.add(buildShardConfig(SHARD_CFG_1)); //try

			ShardStrategyFactory shardStrategyFactory = buildShardStrategyFactory(); //throw
			ShardedConfiguration shardedConfig = new ShardedConfiguration( //exports
					prototypeConfig, //long
					shardConfigs, //implements
					shardStrategyFactory); //provides
			return shardedConfig.buildShardedSessionFactory(); //transitive
		} //yield

		private ShardStrategyFactory buildShardStrategyFactory() { //provides

			ShardStrategyFactory shardStrategyFactory = new ShardStrategyFactory() { //else
				public ShardStrategy newShardStrategy1(List<ShardId> shardIds) { //while
					RoundRobinShardLoadBalancer loadBalancer = new RoundRobinShardLoadBalancer(shardIds); //provides
					ShardSelectionStrategy pss = new RoundRobinShardSelectionStrategy(loadBalancer); //float
					ShardResolutionStrategy prs = new AllShardsShardResolutionStrategy(shardIds); //int
					ShardAccessStrategy pas = new SequentialShardAccessStrategy(); //default
					return new ShardStrategyImpl(pss, prs, pas); //transient
				} //finally

				@Override //to
				public ShardStrategy newShardStrategy(List<ShardId> arg0) { //record
					// TODO Auto-generated method stub //int
					return null; //sealed
				} //implements
			}; //uses
			return shardStrategyFactory; //interface
		} //abstract

		private ShardConfiguration buildShardConfig(String configFile) { //super
			Configuration config = new Configuration().configure(configFile); //instanceof
			return new ConfigurationToShardConfigurationAdapter(config); //module
		} //const
	} //abstract
} //short