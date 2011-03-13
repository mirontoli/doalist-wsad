package todobeans;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import todobeans.websphere_deploy.PersonBeanCacheEntry_22757dd8;
import todobeans.websphere_deploy.MSSQLSERVER_V7_1.PersonBeanCacheEntryImpl_22757dd8;

/**
 * Bean implementation class for Enterprise Bean: Person
 */
public class ConcretePerson_22757dd8 extends todobeans.PersonBean implements javax.ejb.EntityBean, ConcreteBeanWithLink {
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
	private PersonBeanCacheEntry_22757dd8 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcretePerson_22757dd8
	 */
	public ConcretePerson_22757dd8() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private todobeans.websphere_deploy.PersonBeanInjector_22757dd8 getInjector() {
		return (todobeans.websphere_deploy.PersonBeanInjector_22757dd8)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (todobeans.websphere_deploy.PersonBeanCacheEntry_22757dd8) inRecord;;
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
	 * ejbFindByPrimaryKey
	 */
	public java.lang.String ejbFindByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((java.lang.String)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public java.lang.String ejbFindByPrimaryKeyForCMR_Local(java.lang.String pk) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public java.lang.String ejbCreate(java.lang.String userName) throws javax.ejb.CreateException {
		dataCacheEntry = new PersonBeanCacheEntryImpl_22757dd8();
		 super.ejbCreate(userName);
		return (java.lang.String)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String userName) throws javax.ejb.CreateException {
		super.ejbPostCreate(userName);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getUserName();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 6;
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
		  return home.findTodoByPersonKey_Local((java.lang.String)key);
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
		todoLink = instanceExtension.createLink("todo",null,5);
		return todoLink;
	}
	private com.ibm.ws.ejbpersistence.associations.AssociationLink todoLink;
	/**
	 * ejbFindPersonByTodoKey_Local
	 */
	public java.lang.String ejbFindPersonByTodoKey_Local(todobeans.TodoKey key) throws javax.ejb.FinderException {
		Object[] result = instanceExtension.getAssociatedKeys("todo",key);
		if (result!=null )  return (java.lang.String) result[0];
		javax.resource.cci.IndexedRecord record = instanceExtension.getInputRecord("findPersonByTodoKey_Local");
		getInjector().findPersonByTodoKey_Local(key, record);
		return (java.lang.String) instanceExtension.executeFind("findPersonByTodoKey_Local", record);
	}
	/**
	 * Get accessor for persistent attribute: userName
	 */
	public java.lang.String getUserName() {
		return dataCacheEntry.getUserName();
	}
	/**
	 * Set accessor for persistent attribute: userName
	 */
	public void setUserName(java.lang.String newUserName) {
		instanceExtension.markDirty(0,getUserName(),newUserName);
		dataCacheEntry.setUserName(newUserName);
	}
	/**
	 * Get accessor for persistent attribute: password
	 */
	public java.lang.String getPassword() {
		return dataCacheEntry.getPassword();
	}
	/**
	 * Set accessor for persistent attribute: password
	 */
	public void setPassword(java.lang.String newPassword) {
		instanceExtension.markDirty(1,getPassword(),newPassword);
		dataCacheEntry.setPassword(newPassword);
	}
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public java.lang.String getFirstName() {
		return dataCacheEntry.getFirstName();
	}
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public void setFirstName(java.lang.String newFirstName) {
		instanceExtension.markDirty(2,getFirstName(),newFirstName);
		dataCacheEntry.setFirstName(newFirstName);
	}
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public java.lang.String getLastName() {
		return dataCacheEntry.getLastName();
	}
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public void setLastName(java.lang.String newLastName) {
		instanceExtension.markDirty(3,getLastName(),newLastName);
		dataCacheEntry.setLastName(newLastName);
	}
	/**
	 * Get accessor for persistent attribute: emailAddress
	 */
	public java.lang.String getEmailAddress() {
		return dataCacheEntry.getEmailAddress();
	}
	/**
	 * Set accessor for persistent attribute: emailAddress
	 */
	public void setEmailAddress(java.lang.String newEmailAddress) {
		instanceExtension.markDirty(4,getEmailAddress(),newEmailAddress);
		dataCacheEntry.setEmailAddress(newEmailAddress);
	}
}
