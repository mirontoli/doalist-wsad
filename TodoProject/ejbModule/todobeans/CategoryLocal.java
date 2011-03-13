package todobeans;
/**
 * Local interface for Enterprise Bean: Category
 */
public interface CategoryLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Get accessor for persistent attribute: categoryName
	 */
	public java.lang.String getCategoryName();
	/**
	 * Set accessor for persistent attribute: categoryName
	 */
	public void setCategoryName(java.lang.String newCategoryName);
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
	 * Get accessor for persistent attribute: id
	 */
	public int getId();
}
