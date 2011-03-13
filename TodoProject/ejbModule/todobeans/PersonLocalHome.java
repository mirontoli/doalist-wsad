package todobeans;
/**
 * Local Home interface for Enterprise Bean: Person
 */
public interface PersonLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Person
	 */
	public todobeans.PersonLocal create(java.lang.String userName)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Person
	 */
	public todobeans.PersonLocal findByPrimaryKey(java.lang.String primaryKey)
		throws javax.ejb.FinderException;
}
