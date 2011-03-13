package todobeans;
/**
 * Bean implementation class for Enterprise Bean: Person
 */
public abstract class PersonBean implements javax.ejb.EntityBean {
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
	public java.lang.String ejbCreate(java.lang.String userName)
		throws javax.ejb.CreateException {
		setUserName(userName);
		return null;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String userName)
		throws javax.ejb.CreateException {
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
	 * Get accessor for persistent attribute: userName
	 */
	public abstract java.lang.String getUserName();
	/**
	 * Set accessor for persistent attribute: userName
	 */
	public abstract void setUserName(java.lang.String newUserName);
	/**
	 * Get accessor for persistent attribute: password
	 */
	public abstract java.lang.String getPassword();
	/**
	 * Set accessor for persistent attribute: password
	 */
	public abstract void setPassword(java.lang.String newPassword);
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public abstract java.lang.String getFirstName();
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public abstract void setFirstName(java.lang.String newFirstName);
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public abstract java.lang.String getLastName();
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public abstract void setLastName(java.lang.String newLastName);
	/**
	 * Get accessor for persistent attribute: emailAddress
	 */
	public abstract java.lang.String getEmailAddress();
	/**
	 * Set accessor for persistent attribute: emailAddress
	 */
	public abstract void setEmailAddress(java.lang.String newEmailAddress);
	/**
	 * This method was generated for supporting the relationship role named todo.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract java.util.Collection getTodo();
	/**
	 * This is our method to get all todos for one person
	 */
	public java.util.Collection getTodos() {
		java.util.Collection c = new java.util.ArrayList();
		c.addAll(getTodo());
		return c;
	}
	public boolean isPasswordCorrect(String password) {
		boolean correct = false;
			if (getPassword().equals(password)) {
				correct = true;
			}
		return correct;
	}
	/**
	 * This method was generated for supporting the relationship role named todo.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public abstract void setTodo(java.util.Collection aTodo);
}
