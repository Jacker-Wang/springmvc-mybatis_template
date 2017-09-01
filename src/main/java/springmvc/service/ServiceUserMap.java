package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import springmvc.dao.mapper.UserMapper;
import springmvc.dao.po.User;

public class ServiceUserMap {
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;

	public void getUserById() throws Exception {
		System.out.println(userMapper);
		 User user=userMapper.getUserById(1);
		 System.out.println(user);
	}
}
