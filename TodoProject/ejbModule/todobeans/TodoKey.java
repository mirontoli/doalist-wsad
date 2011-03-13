package todobeans;
/**
 * Key class for Entity Bean: Todo
 */
public class TodoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	/**
	 * Implementation field for persistent attribute: id
	 */
	public int id;
	/**
	 * Creates an empty key for Entity Bean: Todo
	 */
	public TodoKey() {
	}
	/**
	 * Creates a key for Entity Bean: Todo
	 */
	public TodoKey(int id) {
		this.id = id;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof todobeans.TodoKey) {
			todobeans.TodoKey o = (todobeans.TodoKey) otherKey;
			return ((this.id == o.id));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return ((new java.lang.Integer(id).hashCode()));
	}
}
