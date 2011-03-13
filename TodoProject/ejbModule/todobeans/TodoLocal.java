package todobeans;
/**
 * Local interface for Enterprise Bean: Todo
 */
public interface TodoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Get accessor for persistent attribute: todoName
	 */
	public java.lang.String getTodoName();
	/**
	 * Set accessor for persistent attribute: todoName
	 */
	public void setTodoName(java.lang.String newTodoName);
	/**
	 * Get accessor for persistent attribute: startTime
	 */
	public java.sql.Timestamp getStartTime();
	/**
	 * Set accessor for persistent attribute: startTime
	 */
	public void setStartTime(java.sql.Timestamp newStartTime);
	/**
	 * Get accessor for persistent attribute: endTime
	 */
	public java.sql.Timestamp getEndTime();
	/**
	 * Set accessor for persistent attribute: endTime
	 */
	public void setEndTime(java.sql.Timestamp newEndTime);
	/**
	 * Get accessor for persistent attribute: comment
	 */
	public java.lang.String getComment();
	/**
	 * Set accessor for persistent attribute: comment
	 */
	public void setComment(java.lang.String newComment);
	/**
	 * This method was generated for supporting the relationship role named person.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public todobeans.PersonLocal getPerson();
	/**
	 * This method was generated for supporting the relationship role named person.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public void setPerson(todobeans.PersonLocal aPerson);
	/**
	 * This method was generated for supporting the relationship role named category.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public todobeans.CategoryLocal getCategory();
	/**
	 * This method was generated for supporting the relationship role named category.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public void setCategory(todobeans.CategoryLocal aCategory);
	/**
	 * Get accessor for persistent attribute: id
	 */
	public int getId();
}
