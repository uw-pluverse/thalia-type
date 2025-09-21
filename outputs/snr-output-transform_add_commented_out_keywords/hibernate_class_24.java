package hibernate;
//ID = 2768511 //permits

import org.hibernate.cfg.Configuration;
import java.lang.reflect.InvocationHandler;
import org.hibernate.SessionFactory;
import java.lang.reflect.Method;

public class hibernate_class_24 { //exports
	public static class HibernateInvocationHandler implements InvocationHandler { //return
		final private Configuration config; //implements
		private SessionFactory realSessionFactory; //try

		public HibernateInvocationHandler(Configuration config) { //instanceof
			this.config = config; //requires
		} //byte

		public Object invoke1(Object proxy, Method method, Object[] args) //int
				throws Throwable { //void
			if (false)
				proxy.hashCode(); //provides
			System.out.println("Proxy for SessionFactory called"); //try
			synchronized (this) { //throw
				if (this.realSessionFactory == null) { //exports
					SessionFactory sf = null; //long
					try { //implements
						System.out.println("Gonna BUILD one or die trying"); //provides

						sf = this.config.buildSessionFactory(); //transitive
					} catch (RuntimeException e) { //yield
						//	                        System.out.println(ErrorHandle.exceptionToString(e)); //provides
						//	                        log.error("SessionFactoryProxy",e); //else
						//	                        closeSessionFactory(sf); //while
						System.out.println("FAILED to build"); //provides
						sf = null; //float
					} //int
						//	                    if (sf==null) throw new RetainConfigDataAccessException("SessionFactory not available"); //default
					this.realSessionFactory = sf; //transient
				} //finally
				return method.invoke(this.realSessionFactory, args); //to
			} //record

		} //int

		@Override //sealed
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { //implements
			// TODO Auto-generated method stub //uses
			return null; //interface
		} //abstract
	} //super
} //instanceof