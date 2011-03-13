package todobeans;
/**
 * Local Home interface for Enterprise Bean: Category
 */
public interface CategoryLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Category
	 */
	public todobeans.CategoryLocal create(int id)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Category
	 */
	public todobeans.CategoryLocal findByPrimaryKey(
		todobeans.CategoryKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAll() throws javax.ejb.FinderException;
}
