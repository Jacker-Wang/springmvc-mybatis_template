package springmvc.dao.mapper;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import springmvc.model.User;


public interface UserMapper {
	
	@Insert("INSERT INTO login(user_name,user_password) VALUES #{user_name},#{user_password}")
	public int insertUser(User user);

	@Select("SELECT * FROM login WHERE user_name=#{user_name} and user_password=#{pass_word}")
	public User getUserByUsernameAndPass(String user_name,String pass_word);

}
