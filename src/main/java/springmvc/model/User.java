package springmvc.model;

import org.springframework.stereotype.Repository;

/**
 * @author gacl
 * user������Ӧ��ʵ����
 */
public class User {

    //ʵ��������Ժͱ���ֶ�����һһ��Ӧ
    private int user_id;
    private String user_name;
    private String user_password;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public String getUser_password() {
		return user_password;
	}



	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
    public String toString() {
        return "User [id=" + user_id + ", name=" + user_name + ", password=" + user_password + "]";
    }
}