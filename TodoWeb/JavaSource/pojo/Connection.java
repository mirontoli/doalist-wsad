/*
 * Created on 2010-apr-05
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package pojo;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.naming.NamingException;

/**
 * @author Anatoly
 *
 * The purpose of this class is to have connection to remote interface
 * of the FacadeBean in one place. This class will implement the Singleton pattern
 * which means that there is only one facade object may be in this case.
 * Person, Todo and Category will have Connection as their instance variables
 */
public class Connection {
	private static todobeans.Facade facade;
	public static todobeans.Facade getFacade() {
		if (facade == null) { //create facade connection only one time in the application runtime
			try {
				javax.naming.Context ctx = new javax.naming.InitialContext();
				Object einRef = ctx.lookup("java:comp/env/ejbFacadeRef");
				todobeans.FacadeHome home = (todobeans.FacadeHome) javax.rmi.PortableRemoteObject.narrow(einRef, todobeans.FacadeHome.class);
				facade = home.create();
			} catch (ClassCastException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CreateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return facade;
	}
}
