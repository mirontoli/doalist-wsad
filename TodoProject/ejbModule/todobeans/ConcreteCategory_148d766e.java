package todobeans;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import todobeans.websphere_deploy.CategoryBeanCacheEntry_148d766e;
import todobeans.websphere_deploy.MSSQLSERVER_V7_1.CategoryBeanCacheEntryImpl_148d766e;

/**
 * Bean implementation class for Enterprise Bean: Category
 */
public class ConcreteCategory_148d766e extends todobeans.CategoryBean implements javax.ejb.EntityBean, ConcreteBeanWithLink {
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
		instanceExtension.setEntityContext(ctx);
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		super.unsetEntityContext();
		instanceExtension.unsetEntityContext();
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
			super.ejbActivate();
			instanceExtension.ejbActivate();
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		instanceExtension.ejbLoad();
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
		super.ejbPassivate();
		instanceExtension.ejbPassivate();
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		super.ejbRemove();
		instanceExtension.ejbRemove();
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		super.ejbStore();
		instanceExtension.ejbStore();
	}
	private ConcreteBeanInstanceExtension instanceExtension;
	private CategoryBeanCacheEntry_148d766e dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteCategory_148d766e
	 */
	public ConcreteCategory_148d766e() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private todobeans.websphere_deploy.CategoryBeanInjector_148d766e getInjector() {
		return (todobeans.websphere_deploy.CategoryBeanInjector_148d766e)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (todobeans.websphere_deploy.CategoryBeanCacheEntry_148d766e) inRecord;;
		super.ejbLoad();
	}
	/**
	 * resetCMP
	 */
	public void resetCMP() {
			dataCacheEntry = null;
	}
	/**
	 * resetCMR
	 */
	public void resetCMR() {
			todoLink = null;
	}
	/**
	 * ejbFindAll_Local
	 */
	public java.util.Collection ejbFindAll_Local() throws javax.ejb.FinderException {
		return (java.util.Collection) instanceExtension.executeFind("FindAll", null);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public todobeans.CategoryKey ejbFindByPrimaryKey(todobeans.CategoryKey primaryKey) throws javax.ejb.FinderException {
		return (todobeans.CategoryKey)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((todobeans.CategoryKey)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public todobeans.CategoryKey ejbFindByPrimaryKeyForCMR_Local(todobeans.CategoryKey pk) throws javax.ejb.FinderException {
		return (todobeans.CategoryKey)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public todobeans.CategoryKey ejbCreate(int id) throws javax.ejb.CreateException {
		dataCacheEntry = new CategoryBeanCacheEntryImpl_148d766e();
		 super.ejbCreate(id);
		return (todobeans.CategoryKey)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int id) throws javax.ejb.CreateException {
		super.ejbPostCreate(id);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		todobeans.CategoryKey pk = new todobeans.CategoryKey();
		pk.id = getId();
		return pk;
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 3;
	}
	/**
	 * getLink
	 */
	public com.ibm.ws.ejbpersistence.associations.AssociationLink getLink(java.lang.String name) {
		if (name.equals("todo")) return getTodoLink();
		return null;
	}
	/**
	 * executeFinderForLink
	 */
	public java.lang.Object executeFinderForLink(java.lang.String name, java.lang.Object key) throws javax.ejb.FinderException {
		if (name.equals("todo")){
			todobeans.websphere_deploy.TodoBeanInternalLocalHome_ac36b10e home = (todobeans.websphere_deploy.TodoBeanInternalLocalHome_ac36b10e)instanceExtension.getHomeForLink("todo");
		  return home.findTodoByCategoryKey_Local((todobeans.CategoryKey)key);
		}
		return null;
	}
	/**
	 * getTodo
	 */
	public java.util.Collection getTodo() {
		return (java.util.Collection)getTodoLink().getValue();
	}
	/**
	 * setTodo
	 */
	public void setTodo(java.util.Collection value) {
		getTodoLink().setValue(value);
	}
	/**
	 * getTodoLink
	 */
	private com.ibm.ws.ejbpersistence.associations.AssociationLink getTodoLink() {
		if (todoLink == null) 
		todoLink = instanceExtension.createLink("todo",null,2);
		return todoLink;
	}
	private com.ibm.ws.ejbpersistence.associations.AssociationLink todoLink;
	/**
	 * ejbFindCategoryByTodoKey_Local
	 */
	public todobeans.CategoryKey ejbFindCategoryByTodoKey_Local(todobeans.TodoKey key) throws javax.ejb.FinderException {
		Object[] result = instanceExtension.getAssociatedKeys("todo",key);
		if (result!=null )  return (todobeans.CategoryKey) result[0];
		javax.resource.cci.IndexedRecord record = instanceExtension.getInputRecord("findCategoryByTodoKey_Local");
		getInjector().findCategoryByTodoKey_Local(key, record);
		return (todobeans.CategoryKey) instanceExtension.executeFind("findCategoryByTodoKey_Local", record);
	}
	/**
	 * Get accessor for persistent attribute: id
	 */
	public int getId() {
		return dataCacheEntry.getId();
	}
	/**
	 * Set accessor for persistent attribute: id
	 */
	public void setId(int newId) {
		instanceExtension.markDirty(0,getId(),newId);
		dataCacheEntry.setId(newId);
	}
	/**
	 * Get accessor for persistent attribute: categoryName
	 */
	public java.lang.String getCategoryName() {
		return dataCacheEntry.getCategoryName();
	}
	/**
	 * Set accessor for persistent attribute: categoryName
	 */
	public void setCategoryName(java.lang.String newCategoryName) {
		instanceExtension.markDirty(1,getCategoryName(),newCategoryName);
		dataCacheEntry.setCategoryName(newCategoryName);
	}
}
