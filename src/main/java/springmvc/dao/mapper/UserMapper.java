package springmvc.dao.mapper;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import springmvc.model.User;


public interface UserMapper {
	
	@Insert("INSERT INTO login(user_name,user_password) VALUES (#{user_name},#{user_password})")
	public int insertUser(User user);

	@Select("SELECT * FROM login WHERE user_name=#{user_name} and user_password=#{user_password}")
	public User getUserByUsernameAndPass(@Param("user_name") String user_name,@Param("user_password") String pass_word);

}
