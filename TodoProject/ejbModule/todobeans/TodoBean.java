package todobeans;
/**
 * Bean implementation class for Enterprise Bean: Todo
 */
public abstract class TodoBean implements javax.ejb.EntityBean {
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
	public todobeans.TodoKey ejbCreate(int id)
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
	 * Get accessor for persistent attribute: todoName
	 */
	public abstract java.lang.String getTodoName();
	/**
	 * Set accessor for persistent attribute: todoName
	 */
	public abstract void setTodoName(java.lang.String newTodoName);
	/**
	 * Get accessor for persistent attribute: startTime
	 */
	public abstract java.sql.Timestamp getStartTime();
	/**
	 * Set accessor for persistent attribute: startTime
	 */
	public abstract void setStartTime(java.sql.Timestamp newStartTime);
	/**
	 * Get accessor for persistent attribute: endTime
	 */
	public abstract java.sql.Timestamp getEndTime();
	/**
	 * Set accessor for persistent attribute: endTime
	 */
	public abstract void setEndTime(java.sql.Timestamp newEndTime);
	/**
	 * Get accessor for persistent attribute: comment
	 */
	public abstract java.lang.String getComment();
	/**
	 * Set accessor for persistent attribute: comment
	 */
	public abstract void setComment(java.lang.String newComment);
	/**
	 * This method was generated for supporting the relationship role named person.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract todobeans.PersonLocal getPerson();
	/**
	 * This method was generated for supporting the relationship role named person.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract void setPerson(todobeans.PersonLocal aPerson);
	/**
	 * This method was generated for supporting the relationship role named category.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract todobeans.CategoryLocal getCategory();
	/**
	 * This method was generated for supporting the relationship role named category.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract void setCategory(todobeans.CategoryLocal aCategory);
}
