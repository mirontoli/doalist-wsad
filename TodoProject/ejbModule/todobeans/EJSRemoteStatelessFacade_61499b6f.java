package todobeans;

import com.ibm.ejs.container.*;

/**
 * EJSRemoteStatelessFacade_61499b6f
 */
public class EJSRemoteStatelessFacade_61499b6f extends EJSWrapper implements Facade {
	/**
	 * EJSRemoteStatelessFacade_61499b6f
	 */
	public EJSRemoteStatelessFacade_61499b6f() throws java.rmi.RemoteException {
		super();	}
	/**
	 * getEmail
	 */
	public java.lang.String getEmail(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.getEmail(userName, password);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getTodosForAUser
	 */
	public java.util.ArrayList getTodosForAUser(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.ArrayList _EJS_result = null;
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.getTodosForAUser(userName, password);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getAllCategories
	 */
	public java.util.Collection getAllCategories() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = _EJS_beanRef.getAllCategories();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getPerson
	 */
	public java.util.HashMap getPerson(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.HashMap _EJS_result = null;
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = _EJS_beanRef.getPerson(userName, password);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getUser
	 */
	public todobeans.PersonLocal getUser(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		todobeans.PersonLocal _EJS_result = null;
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = _EJS_beanRef.getUser(userName, password);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * addTodo
	 */
	public void addTodo(java.lang.String todoName, java.sql.Timestamp startTime, java.sql.Timestamp endTime, java.lang.String userName, int categoryId, java.lang.String comment) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_beanRef.addTodo(todoName, startTime, endTime, userName, categoryId, comment);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addUser
	 */
	public void addUser(java.lang.String userName, java.lang.String password, java.lang.String firstName, java.lang.String lastName, java.lang.String emailAddress) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_beanRef.addUser(userName, password, firstName, lastName, emailAddress);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeTodos
	 */
	public void removeTodos(int[] todoIds) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 7, _EJS_s);
			_EJS_beanRef.removeTodos(todoIds);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateTodo
	 */
	public void updateTodo(int todoId, java.lang.String todoName, java.sql.Timestamp startTime, java.sql.Timestamp endTime, java.lang.String userName, int categoryId, java.lang.String comment) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.FacadeBean _EJS_beanRef = (todobeans.FacadeBean)container.preInvoke(this, 8, _EJS_s);
			_EJS_beanRef.updateTodo(todoId, todoName, startTime, endTime, userName, categoryId, comment);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
