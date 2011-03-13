package todobeans;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessFacadeHomeBean_61499b6f
 */
public class EJSStatelessFacadeHomeBean_61499b6f extends EJSHome {
	/**
	 * EJSStatelessFacadeHomeBean_61499b6f
	 */
	public EJSStatelessFacadeHomeBean_61499b6f() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public todobeans.Facade create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
todobeans.Facade result = null;
boolean createFailed = false;
try {
	result = (todobeans.Facade) super.createWrapper(new BeanId(this, null));
}
catch (javax.ejb.CreateException ex) {
	createFailed = true;
	throw ex;
} catch (java.rmi.RemoteException ex) {
	createFailed = true;
	throw ex;
} catch (Throwable ex) {
	createFailed = true;
	throw new CreateFailureException(ex);
} finally {
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
}
