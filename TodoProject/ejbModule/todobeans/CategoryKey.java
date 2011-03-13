package todobeans;
/**
 * Key class for Entity Bean: Category
 */
public class CategoryKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	/**
	 * Implementation field for persistent attribute: id
	 */
	public int id;
	/**
	 * Creates an empty key for Entity Bean: Category
	 */
	public CategoryKey() {
	}
	/**
	 * Creates a key for Entity Bean: Category
	 */
	public CategoryKey(int id) {
		this.id = id;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof todobeans.CategoryKey) {
			todobeans.CategoryKey o = (todobeans.CategoryKey) otherKey;
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
