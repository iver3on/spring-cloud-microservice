package cloud.simple.service.dao;

import java.util.List;

import cloud.simple.service.model.User;


public interface UserDao {

	List<User> findAll();

	/**
	 * @param id
	 * @return
	 */
	//UserMapper 是一个接口，其接口名称以及定义的方法名称 findById 
	//是能与 UserMapper.xml 中的配置对应起来的。
	User findById(Integer id);
}
