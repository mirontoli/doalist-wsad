package todobeans;
/**
 * Local interface for Enterprise Bean: Person
 */
public interface PersonLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Get accessor for persistent attribute: password
	 */
	public java.lang.String getPassword();
	/**
	 * Set accessor for persistent attribute: password
	 */
	public void setPassword(java.lang.String newPassword);
	/**
	 * Get accessor for persistent attribute: firstName
	 */
	public java.lang.String getFirstName();
	/**
	 * Set accessor for persistent attribute: firstName
	 */
	public void setFirstName(java.lang.String newFirstName);
	/**
	 * Get accessor for persistent attribute: lastName
	 */
	public java.lang.String getLastName();
	/**
	 * Set accessor for persistent attribute: lastName
	 */
	public void setLastName(java.lang.String newLastName);
	/**
	 * Get accessor for persistent attribute: emailAddress
	 */
	public java.lang.String getEmailAddress();
	/**
	 * Set accessor for persistent attribute: emailAddress
	 */
	public void setEmailAddress(java.lang.String newEmailAddress);
	/**
	 * This method was generated for supporting the relationship role named todo.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public java.util.Collection getTodo();
	/**
	 * This method was generated for supporting the relationship role named todo.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public void setTodo(java.util.Collection aTodo);
	/**
	 * This is our method to get all todos for one person
	 */
	public java.util.Collection getTodos();
	public boolean isPasswordCorrect(String password);
}
