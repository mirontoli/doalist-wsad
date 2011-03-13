package todobeans;

import com.ibm.ejs.container.*;

/**
 * EJSCMPPersonHomeBean_22757dd8
 */
public class EJSCMPPersonHomeBean_22757dd8 extends EJSHome {
	/**
	 * EJSCMPPersonHomeBean_22757dd8
	 */
	public EJSCMPPersonHomeBean_22757dd8() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public todobeans.PersonLocal findByPrimaryKey_Local(java.lang.String primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (todobeans.PersonLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public todobeans.PersonLocal create_Local(java.lang.String userName) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		todobeans.PersonLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			todobeans.PersonBean bean = (todobeans.PersonBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(userName);
			Object ejsKey = keyFromBean(bean);
			result = (todobeans.PersonLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(userName);
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
	 * findPersonByTodoKey_Local
	 */
	public todobeans.PersonLocal findPersonByTodoKey_Local(todobeans.TodoKey key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		todobeans.PersonLocal result = null;
		EntityBeanO beanO = null;

		java.lang.String pKey = null;
		try {
			beanO = super.getFinderEntityBeanO();
			todobeans.ConcretePerson_22757dd8 bean = (todobeans.ConcretePerson_22757dd8) beanO.getEnterpriseBean();
			pKey = bean.ejbFindPersonByTodoKey_Local(key);
			result = (todobeans.PersonLocal)activateBean_Local(pKey);
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
	 * findByPrimaryKeyForCMR_Local
	 */
	public todobeans.PersonLocal findByPrimaryKeyForCMR_Local(java.lang.String key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (todobeans.PersonLocal)super.activateBean_Local(key);
	}
	/**
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		todobeans.ConcretePerson_22757dd8 tmpEJB = (todobeans.ConcretePerson_22757dd8) generalEJB;
		return tmpEJB.getUserName();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.String keyFromFields(java.lang.String f0) {
		return f0;
	}
}
