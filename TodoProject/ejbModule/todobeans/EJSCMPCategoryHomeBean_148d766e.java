package todobeans;

import com.ibm.ejs.container.*;

/**
 * EJSCMPCategoryHomeBean_148d766e
 */
public class EJSCMPCategoryHomeBean_148d766e extends EJSHome {
	/**
	 * EJSCMPCategoryHomeBean_148d766e
	 */
	public EJSCMPCategoryHomeBean_148d766e() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create_Local
	 */
	public todobeans.CategoryLocal create_Local(int id) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		todobeans.CategoryLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			todobeans.CategoryBean bean = (todobeans.CategoryBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(id);
			Object ejsKey = keyFromBean(bean);
			result = (todobeans.CategoryLocal) super.postCreate_Local(beanO, ejsKey, true);
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
	 * findAll_Local
	 */
	public java.util.Collection findAll_Local() throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			todobeans.ConcreteCategory_148d766e bean = (todobeans.ConcreteCategory_148d766e) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAll_Local();
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
	 * findByPrimaryKey_Local
	 */
	public todobeans.CategoryLocal findByPrimaryKey_Local(todobeans.CategoryKey primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (todobeans.CategoryLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * findCategoryByTodoKey_Local
	 */
	public todobeans.CategoryLocal findCategoryByTodoKey_Local(todobeans.TodoKey key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		todobeans.CategoryLocal result = null;
		EntityBeanO beanO = null;

		todobeans.CategoryKey pKey = null;
		try {
			beanO = super.getFinderEntityBeanO();
			todobeans.ConcreteCategory_148d766e bean = (todobeans.ConcreteCategory_148d766e) beanO.getEnterpriseBean();
			pKey = bean.ejbFindCategoryByTodoKey_Local(key);
			result = (todobeans.CategoryLocal)activateBean_Local(pKey);
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
	public todobeans.CategoryLocal findByPrimaryKeyForCMR_Local(todobeans.CategoryKey key) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (todobeans.CategoryLocal)super.activateBean_Local(key);
	}
	/**
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		todobeans.ConcreteCategory_148d766e tmpEJB = (todobeans.ConcreteCategory_148d766e) generalEJB;
		todobeans.CategoryKey keyClass = new todobeans.CategoryKey();
		keyClass.id = tmpEJB.getId();
		return keyClass;
	}
	/**
	 * keyFromFields
	 */
	public todobeans.CategoryKey keyFromFields(int f0) {
		todobeans.CategoryKey keyClass = new todobeans.CategoryKey();
		keyClass.id = f0;
		return keyClass;
	}
}
