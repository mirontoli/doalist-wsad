package todobeans;
/**
 * Bean implementation class for Enterprise Bean: Category
 */
public abstract class CategoryBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext myEntityCtx;
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}
	/**
	 * ejbCreate
	 */
	public todobeans.CategoryKey ejbCreate(int id)
		throws javax.ejb.CreateException {
		setId(id);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int id) throws javax.ejb.CreateException {
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}
	/**
	 * Get accessor for persistent attribute: id
	 */
	public abstract int getId();
	/**
	 * Set accessor for persistent attribute: id
	 */
	public abstract void setId(int newId);
	/**
	 * Get accessor for persistent attribute: categoryName
	 */
	public abstract java.lang.String getCategoryName();
	/**
	 * Set accessor for persistent attribute: categoryName
	 */
	public abstract void setCategoryName(java.lang.String newCategoryName);
	/**
	 * This method was generated for supporting the relationship role named todo.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract java.util.Collection getTodo();
	/**
	 * This method was generated for supporting the relationship role named todo.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract void setTodo(java.util.Collection aTodo);
}
