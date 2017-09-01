package springmvc.dao.mapper;



import org.apache.ibatis.annotations.Select;

import springmvc.dao.po.User;

public interface UserMapper {

	@Select("SELECT * FROM login WHERE user_id=#{id}")
	public User getUserById(int id);

}
