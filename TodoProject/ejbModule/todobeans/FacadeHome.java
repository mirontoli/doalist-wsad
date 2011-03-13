package todobeans;
/**
 * Home interface for Enterprise Bean: Facade
 */
public interface FacadeHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: Facade
	 */
	public todobeans.Facade create()
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
