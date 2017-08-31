package springmvc.service;

import springmvc.dao.mapper.UserMapper;
import springmvc.dao.po.User;

public class TestSelect{
	UserMapper userMapper;
	
	public void test() throws Exception {
		User user=userMapper.getUserById(1);
		System.out.println(user);
	}
}
