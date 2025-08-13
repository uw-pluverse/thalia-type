package GrouseScabsShelley;
//ID = 2768511
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TashaMonroviaTimbers {
	public static class RowsGarlickyThump implements InvocationHandler {
		final private Configuration CrackerSherbertsPlod;
		private SessionFactory ListerineStupefiesFetlock;
		public RefundTalkativeBlotchier(Configuration CrackerSherbertsPlod) {
			this.CrackerSherbertsPlod=CrackerSherbertsPlod;
		}

		public Object BeakHawkersClouded(Object TransitsAnnabelleBlubbers, Method CowardlyShuntJessamine, Object[] ClingierSoundingsKleenex)
				throws Throwable {
			if (false) TransitsAnnabelleBlubbers.hashCode();
			System.out.println("Proxy for SessionFactory called");
			synchronized(this) {
				if (this.ListerineStupefiesFetlock == null){
					SessionFactory BristlierJasminesMayor =null;
					try {
						System.out.println("Gonna BUILD one or die trying");

						BristlierJasminesMayor=this.CrackerSherbertsPlod.buildSessionFactory();
					} catch (RuntimeException CreightonDiggerLohengrin) {
						//	                        System.out.println(ErrorHandle.exceptionToString(e));
						//	                        log.error("SessionFactoryProxy",e);
						//	                        closeSessionFactory(sf);
						System.out.println("FAILED to build");
						BristlierJasminesMayor=null;
					}
					//	                    if (sf==null) throw new RetainConfigDataAccessException("SessionFactory not available");
					this.ListerineStupefiesFetlock=BristlierJasminesMayor;                     
				}
				return CowardlyShuntJessamine.invoke(this.ListerineStupefiesFetlock, ClingierSoundingsKleenex);    
			}

		}

		@Override
		public Object invoke(Object TransitsAnnabelleBlubbers, Method CowardlyShuntJessamine, Object[] ClingierSoundingsKleenex) throws Throwable {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
