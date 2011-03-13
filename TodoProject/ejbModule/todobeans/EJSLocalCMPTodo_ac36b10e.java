package todobeans;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPTodo_ac36b10e
 */
public class EJSLocalCMPTodo_ac36b10e extends EJSLocalWrapper implements todobeans.TodoLocal {
	/**
	 * EJSLocalCMPTodo_ac36b10e
	 */
	public EJSLocalCMPTodo_ac36b10e() {
		super();	}
	/**
	 * getId
	 */
	public int getId() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 0, _EJS_s);
			_EJS_result = beanRef.getId();
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
	 * getComment
	 */
	public java.lang.String getComment() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 1, _EJS_s);
			_EJS_result = beanRef.getComment();
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
	 * getTodoName
	 */
	public java.lang.String getTodoName() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 2, _EJS_s);
			_EJS_result = beanRef.getTodoName();
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
	 * getEndTime
	 */
	public java.sql.Timestamp getEndTime() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.sql.Timestamp _EJS_result = null;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 3, _EJS_s);
			_EJS_result = beanRef.getEndTime();
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
		return _EJS_result;
	}
	/**
	 * getStartTime
	 */
	public java.sql.Timestamp getStartTime() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.sql.Timestamp _EJS_result = null;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 4, _EJS_s);
			_EJS_result = beanRef.getStartTime();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getCategory
	 */
	public todobeans.CategoryLocal getCategory() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		todobeans.CategoryLocal _EJS_result = null;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 5, _EJS_s);
			_EJS_result = beanRef.getCategory();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getPerson
	 */
	public todobeans.PersonLocal getPerson() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		todobeans.PersonLocal _EJS_result = null;
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 6, _EJS_s);
			_EJS_result = beanRef.getPerson();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * setCategory
	 */
	public void setCategory(todobeans.CategoryLocal aCategory) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 7, _EJS_s);
			beanRef.setCategory(aCategory);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setComment
	 */
	public void setComment(java.lang.String newComment) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 8, _EJS_s);
			beanRef.setComment(newComment);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setEndTime
	 */
	public void setEndTime(java.sql.Timestamp newEndTime) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 9, _EJS_s);
			beanRef.setEndTime(newEndTime);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 9, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setPerson
	 */
	public void setPerson(todobeans.PersonLocal aPerson) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 10, _EJS_s);
			beanRef.setPerson(aPerson);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 10, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setStartTime
	 */
	public void setStartTime(java.sql.Timestamp newStartTime) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 11, _EJS_s);
			beanRef.setStartTime(newStartTime);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 11, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setTodoName
	 */
	public void setTodoName(java.lang.String newTodoName) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		
		try {
			todobeans.TodoBean beanRef = (todobeans.TodoBean)container.preInvoke(this, 12, _EJS_s);
			beanRef.setTodoName(newTodoName);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 12, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
