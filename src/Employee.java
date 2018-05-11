import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee implements Cloneable {

	protected int id;

	private String name;

	private Map<String, String> props;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", props=" + props + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	 @Override
	 protected Object clone() throws CloneNotSupportedException {
	 return super.clone();
	 }

}