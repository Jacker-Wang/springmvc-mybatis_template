package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import springmvc.dao.mapper.UserMapper;
import springmvc.model.User;

public class UserService {
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	public boolean insertUser(User user){
		return userMapper.insertUser(user)==1?true:false;
	}

	public User getUserByUsernameAndPass(String user_name,String pass_word){
		 User user=userMapper.getUserByUsernameAndPass(user_name, pass_word);
		 System.out.println(user);
		 return user;
	}
}
