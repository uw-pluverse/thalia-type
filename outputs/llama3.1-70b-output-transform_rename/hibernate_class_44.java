Here are the necessary import statements:

```java
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
```

Note that I have not included any imports for the `log` object, as it is not clear what logging framework is being used. You may need to add an additional import statement depending on your specific logging configuration.