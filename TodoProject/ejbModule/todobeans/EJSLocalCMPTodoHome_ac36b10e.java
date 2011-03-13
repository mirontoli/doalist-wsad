package todobeans;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPTodoHome_ac36b10e
 */
public class EJSLocalCMPTodoHome_ac36b10e extends EJSLocalWrapper implements todobeans.TodoLocalHome, todobeans.websphere_deploy.TodoBeanInternalLocalHome_ac36b10e {
	/**
	 * EJSLocalCMPTodoHome_ac36b10e
	 */
	public EJSLocalCMPTodoHome_ac36b10e() {
		super();	}
	/**
	 * create
	 */
	public todobeans.TodoLocal create(int id) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		todobeans.TodoLocal _EJS_result = null;
		try {
			todobeans.EJSCMPTodoHomeBean_ac36b10e _EJS_beanRef = (todobeans.EJSCMPTodoHomeBean_ac36b10e)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(id);
		}
		catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findByPrimaryKey
	 */
	public todobeans.TodoLocal findByPrimaryKey(todobeans.TodoKey primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		todobeans.TodoLocal _EJS_result = null;
		try {
			todobeans.EJSCMPTodoHomeBean_ac36b10e _EJS_beanRef = (todobeans.EJSCMPTodoHomeBean_ac36b10e)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		}
		catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findTodoLocalWithMaxId
	 */
	public todobeans.TodoLocal findTodoLocalWithMaxId() throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		todobeans.TodoLocal _EJS_result = null;
		try {
			todobeans.EJSCMPTodoHomeBean_ac36b10e _EJS_beanRef = (todobeans.EJSCMPTodoHomeBean_ac36b10e)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = _EJS_beanRef.findTodoLocalWithMaxId_Local();
		}
		catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.EJSCMPTodoHomeBean_ac36b10e _EJS_beanRef = (todobeans.EJSCMPTodoHomeBean_ac36b10e)container.preInvoke(this, 3, _EJS_s);
			_EJS_beanRef.remove(arg0);
		}
		catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (javax.ejb.EJBException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * findTodoByPersonKey_Local
	 */
	public java.util.Collection findTodoByPersonKey_Local(java.lang.String key) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			todobeans.EJSCMPTodoHomeBean_ac36b10e _EJS_beanRef = (todobeans.EJSCMPTodoHomeBean_ac36b10e)container.preInvoke(this, -2, _EJS_s);
			_EJS_result = _EJS_beanRef.findTodoByPersonKey_Local(key);
		}
		catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, -2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findTodoByCategoryKey_Local
	 */
	public java.util.Collection findTodoByCategoryKey_Local(todobeans.CategoryKey key) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			todobeans.EJSCMPTodoHomeBean_ac36b10e _EJS_beanRef = (todobeans.EJSCMPTodoHomeBean_ac36b10e)container.preInvoke(this, -2, _EJS_s);
			_EJS_result = _EJS_beanRef.findTodoByCategoryKey_Local(key);
		}
		catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, -2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
}
