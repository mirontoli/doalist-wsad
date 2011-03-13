package todobeans;

import com.ibm.ejs.container.*;

/**
 * EJSCMPTodoHomeBean_ac36b10e
 */
public class EJSCMPTodoHomeBean_ac36b10e extends EJSHome {
	/**
	 * EJSCMPTodoHomeBean_ac36b10e
	 */
	public EJSCMPTodoHomeBean_ac36b10e() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create_Local
	 */
	public todobeans.TodoLocal create_Local(int id) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		todobeans.TodoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			todobeans.TodoBean bean = (todobeans.TodoBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(id);
			Object ejsKey = keyFromBean(bean);
			result = (todobeans.TodoLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(id);
			super.afterPostCreate(beanO, ejsKey);
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
			if(preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * findByPrimaryKey_Local
	 */
	public todobeans.TodoLocal findByPrimaryKey_Local(todobeans.TodoKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (todobeans.TodoLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * findTodoLocalWithMaxId_Local
	 */
	public todobeans.TodoLocal findTodoLocalWithMaxId_Local() throws javax.ejb.FinderException, java.rmi.RemoteException {
		todobeans.TodoLocal result = null;
		EntityBeanO beanO = null;

		todobeans.TodoKey pKey = null;
		try {
			beanO = super.getFinderEntityBeanO();
			todobeans.ConcreteTodo_ac36b10e bean = (todobeans.ConcreteTodo_ac36b10e) beanO.getEnterpriseBean();
			pKey = bean.ejbFindTodoLocalWithMaxId_Local();
			result = (todobeans.TodoLocal)activateBean_Local(pKey);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		}
		catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		}
		finally {
			if (beanO != null )
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * findTodoByPersonKey_Local
	 */
	public java.util.Collection findTodoByPersonKey_Local(java.lang.String key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			todobeans.ConcreteTodo_ac36b10e bean = (todobeans.ConcreteTodo_ac36b10e) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindTodoByPersonKey_Local(key);
			result = super.getCMP20Collection_Local(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		}
		catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		}
		finally {
			if (beanO != null )
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * findTodoByCategoryKey_Local
	 */
	public java.util.Collection findTodoByCategoryKey_Local(todobeans.CategoryKey key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			todobeans.ConcreteTodo_ac36b10e bean = (todobeans.ConcreteTodo_ac36b10e) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindTodoByCategoryKey_Local(key);
			result = super.getCMP20Collection_Local(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		}
		catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		}
		finally {
			if (beanO != null )
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		todobeans.ConcreteTodo_ac36b10e tmpEJB = (todobeans.ConcreteTodo_ac36b10e) generalEJB;
		todobeans.TodoKey keyClass = new todobeans.TodoKey();
		keyClass.id = tmpEJB.getId();
		return keyClass;
	}
	/**
	 * keyFromFields
	 */
	public todobeans.TodoKey keyFromFields(int f0) {
		todobeans.TodoKey keyClass = new todobeans.TodoKey();
		keyClass.id = f0;
		return keyClass;
	}
}
