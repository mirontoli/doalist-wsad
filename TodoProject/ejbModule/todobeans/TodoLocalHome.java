package todobeans;
/**
 * Local Home interface for Enterprise Bean: Todo
 */
public interface TodoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Todo
	 */
	public todobeans.TodoLocal create(int id) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Todo
	 */
	public todobeans.TodoLocal findByPrimaryKey(todobeans.TodoKey primaryKey)
		throws javax.ejb.FinderException;
	public todobeans.TodoLocal findTodoLocalWithMaxId() throws javax.ejb.FinderException;
}
