package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import springmvc.dao.mapper.UserMapper;
import springmvc.dao.po.User;

public class ServiceUserMap {
	@Autowired
	private UserMapper userMapper;

	public void getUserById() throws Exception {
		 User user=userMapper.getUserById(1);
		 System.out.println(user);
	}
}
