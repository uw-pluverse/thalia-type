```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.util.HibernateUtil;
import javax.ejb.Stateless;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
```