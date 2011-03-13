package todobeans;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import todobeans.websphere_deploy.TodoBeanCacheEntry_ac36b10e;
import todobeans.websphere_deploy.MSSQLSERVER_V7_1.TodoBeanCacheEntryImpl_ac36b10e;

/**
 * Bean implementation class for Enterprise Bean: Todo
 */
public class ConcreteTodo_ac36b10e extends todobeans.TodoBean implements javax.ejb.EntityBean, ConcreteBeanWithLink {
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
	private TodoBeanCacheEntry_ac36b10e dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteTodo_ac36b10e
	 */
	public ConcreteTodo_ac36b10e() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private todobeans.websphere_deploy.TodoBeanInjector_ac36b10e getInjector() {
		return (todobeans.websphere_deploy.TodoBeanInjector_ac36b10e)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (todobeans.websphere_deploy.TodoBeanCacheEntry_ac36b10e) inRecord;;
		personKey = dataCacheEntry.getPersonKey();
		categoryKey = dataCacheEntry.getCategoryKey();
		super.ejbLoad();
	}
	/**
	 * resetCMP
	 */
	public void resetCMP() {
			dataCacheEntry = null;
			personKey = null;
			categoryKey = null;
	}
	/**
	 * resetCMR
	 */
	public void resetCMR() {
			personLink = null;
			categoryLink = null;
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public todobeans.TodoKey ejbFindByPrimaryKey(todobeans.TodoKey primaryKey) throws javax.ejb.FinderException {
		return (todobeans.TodoKey)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindTodoLocalWithMaxId_Local
	 */
	public todobeans.TodoKey ejbFindTodoLocalWithMaxId_Local() throws javax.ejb.FinderException {
		return (todobeans.TodoKey) instanceExtension.executeFind("FindTodoLocalWithMaxId", null);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((todobeans.TodoKey)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public todobeans.TodoKey ejbFindByPrimaryKeyForCMR_Local(todobeans.TodoKey pk) throws javax.ejb.FinderException {
		return (todobeans.TodoKey)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public todobeans.TodoKey ejbCreate(int id) throws javax.ejb.CreateException {
		dataCacheEntry = new TodoBeanCacheEntryImpl_ac36b10e();
		 super.ejbCreate(id);
		return (todobeans.TodoKey)instanceExtension.ejbCreate();
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
		todobeans.TodoKey pk = new todobeans.TodoKey();
		pk.id = getId();
		return pk;
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 9;
	}
	/**
	 * getLink
	 */
	public com.ibm.ws.ejbpersistence.associations.AssociationLink getLink(java.lang.String name) {
		if (name.equals("person")) return getPersonLink();
		if (name.equals("category")) return getCategoryLink();
		return null;
	}
	/**
	 * executeFinderForLink
	 */
	public java.lang.Object executeFinderForLink(java.lang.String name, java.lang.Object key) throws javax.ejb.FinderException {
		if (name.equals("person")){
			todobeans.websphere_deploy.PersonBeanInternalLocalHome_22757dd8 home = (todobeans.websphere_deploy.PersonBeanInternalLocalHome_22757dd8)instanceExtension.getHomeForLink("person");
		  return home.findByPrimaryKeyForCMR((java.lang.String)key);
		}
		if (name.equals("category")){
			todobeans.websphere_deploy.CategoryBeanInternalLocalHome_148d766e home = (todobeans.websphere_deploy.CategoryBeanInternalLocalHome_148d766e)instanceExtension.getHomeForLink("category");
		  return home.findByPrimaryKeyForCMR((todobeans.CategoryKey)key);
		}
		return null;
	}
	/**
	 * getPerson
	 */
	public todobeans.PersonLocal getPerson() {
		return (todobeans.PersonLocal)getPersonLink().getValue();
	}
	/**
	 * setPerson
	 */
	public void setPerson(todobeans.PersonLocal value) {
		getPersonLink().setValue(value);
	}
	private java.lang.String personKey;
	/**
	 * getPersonKey
	 */
	public java.lang.String getPersonKey() {
		if (personLink == null) return personKey;
		return (java.lang.String) personLink.getKey();
	}
	/**
	 * getPersonLink
	 */
	private com.ibm.ws.ejbpersistence.associations.AssociationLink getPersonLink() {
		if (personLink == null) 
		personLink = instanceExtension.createLink("person",personKey,7);
		return personLink;
	}
	private com.ibm.ws.ejbpersistence.associations.AssociationLink personLink;
	/**
	 * ejbFindTodoByPersonKey_Local
	 */
	public java.util.Collection ejbFindTodoByPersonKey_Local(java.lang.String key) throws javax.ejb.FinderException {
		Object[] result = instanceExtension.getAssociatedKeys("person",key);
		if (result!=null )  return (java.util.Collection) result[0];
		javax.resource.cci.IndexedRecord record = instanceExtension.getInputRecord("findTodoByPersonKey_Local");
		getInjector().findTodoByPersonKey_Local(key, record);
		return (java.util.Collection) instanceExtension.executeFind("findTodoByPersonKey_Local", record);
	}
	/**
	 * getCategory
	 */
	public todobeans.CategoryLocal getCategory() {
		return (todobeans.CategoryLocal)getCategoryLink().getValue();
	}
	/**
	 * setCategory
	 */
	public void setCategory(todobeans.CategoryLocal value) {
		getCategoryLink().setValue(value);
	}
	private todobeans.CategoryKey categoryKey;
	/**
	 * getCategoryKey
	 */
	public todobeans.CategoryKey getCategoryKey() {
		if (categoryLink == null) return categoryKey;
		return (todobeans.CategoryKey) categoryLink.getKey();
	}
	/**
	 * getCategoryLink
	 */
	private com.ibm.ws.ejbpersistence.associations.AssociationLink getCategoryLink() {
		if (categoryLink == null) 
		categoryLink = instanceExtension.createLink("category",categoryKey,8);
		return categoryLink;
	}
	private com.ibm.ws.ejbpersistence.associations.AssociationLink categoryLink;
	/**
	 * ejbFindTodoByCategoryKey_Local
	 */
	public java.util.Collection ejbFindTodoByCategoryKey_Local(todobeans.CategoryKey key) throws javax.ejb.FinderException {
		Object[] result = instanceExtension.getAssociatedKeys("category",key);
		if (result!=null )  return (java.util.Collection) result[0];
		javax.resource.cci.IndexedRecord record = instanceExtension.getInputRecord("findTodoByCategoryKey_Local");
		getInjector().findTodoByCategoryKey_Local(key, record);
		return (java.util.Collection) instanceExtension.executeFind("findTodoByCategoryKey_Local", record);
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
	 * Get accessor for persistent attribute: todoName
	 */
	public java.lang.String getTodoName() {
		return dataCacheEntry.getTodoName();
	}
	/**
	 * Set accessor for persistent attribute: todoName
	 */
	public void setTodoName(java.lang.String newTodoName) {
		instanceExtension.markDirty(1,getTodoName(),newTodoName);
		dataCacheEntry.setTodoName(newTodoName);
	}
	/**
	 * Get accessor for persistent attribute: startTime
	 */
	public java.sql.Timestamp getStartTime() {
		return dataCacheEntry.getStartTime();
	}
	/**
	 * Set accessor for persistent attribute: startTime
	 */
	public void setStartTime(java.sql.Timestamp newStartTime) {
		instanceExtension.markDirty(2,getStartTime(),newStartTime);
		dataCacheEntry.setStartTime(newStartTime);
	}
	/**
	 * Get accessor for persistent attribute: endTime
	 */
	public java.sql.Timestamp getEndTime() {
		return dataCacheEntry.getEndTime();
	}
	/**
	 * Set accessor for persistent attribute: endTime
	 */
	public void setEndTime(java.sql.Timestamp newEndTime) {
		instanceExtension.markDirty(3,getEndTime(),newEndTime);
		dataCacheEntry.setEndTime(newEndTime);
	}
	/**
	 * Get accessor for persistent attribute: comment
	 */
	public java.lang.String getComment() {
		return dataCacheEntry.getComment();
	}
	/**
	 * Set accessor for persistent attribute: comment
	 */
	public void setComment(java.lang.String newComment) {
		instanceExtension.markDirty(4,getComment(),newComment);
		dataCacheEntry.setComment(newComment);
	}
	/**
	 * Get accessor for persistent attribute: person_userName
	 */
	public java.lang.String getPerson_userName() {
		return dataCacheEntry.getPerson_userName();
	}
	/**
	 * Set accessor for persistent attribute: person_userName
	 */
	public void setPerson_userName(java.lang.String newPerson_userName) {
		instanceExtension.markDirty(5,getPerson_userName(),newPerson_userName);
		dataCacheEntry.setPerson_userName(newPerson_userName);
	}
	/**
	 * Get accessor for persistent attribute: category_id
	 */
	public java.lang.Integer getCategory_id() {
		return new java.lang.Integer (dataCacheEntry.getCategory_id());
	}
	/**
	 * Set accessor for persistent attribute: category_id
	 */
	public void setCategory_id(java.lang.Integer newCategory_id) {
		instanceExtension.markDirty(6,getCategory_id(),newCategory_id);
		dataCacheEntry.setCategory_id(newCategory_id.intValue());
	}
}
