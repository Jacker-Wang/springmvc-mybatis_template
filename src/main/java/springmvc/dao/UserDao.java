package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import springmvc.dao.mapper.UserMapper;
import springmvc.model.User;

public class UserDao {
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	public int insertUser(User user){
		return userMapper.insertUser(user);
	}
	
	public User SelectByUsernameAndPass(String user_name,String pass_word) {
		return userMapper.getUserByUsernameAndPass(user_name,pass_word);
	}

}
