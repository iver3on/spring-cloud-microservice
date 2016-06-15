package cloud.simple.model;


public class User {
	//更需要注意的是，User类的四个字段的名字和数据库中user表的各个对应的字段名称完全相同。

	private Integer id;
	private String username;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"username\":\"" + username + "\"}";
	}
}
