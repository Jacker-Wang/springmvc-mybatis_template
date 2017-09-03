package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.StreamingHttpOutputMessage;
/** ע�ⲻ�������import���ᵼ�³����Ҳ������� Controller�ȵĴ��� */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
    @RequestMapping("/login")
    public ModelAndView login(String user_name,String pass_word){
    	System.out.println("===========login");
    	System.out.println(user_name);
    	User user=userService.getUserByUsernameAndPass(user_name, pass_word);
    	ModelAndView modelAndView=new ModelAndView();
    	if(user!=null){
    		modelAndView.addObject("usere",user);
    		modelAndView.setViewName("login_success");
    	}else{
    		modelAndView.addObject("message","对不起，你登录发生错误！！！");
    		modelAndView.setViewName("login_err");
    	}
    	return modelAndView;
    }
    
    @RequestMapping("/regist")
    public ModelAndView login(User user){
    	System.out.println("===========regist");
    	Boolean isRegist=userService.insertUser(user);
    	ModelAndView modelAndView=new ModelAndView();
    	if(isRegist){
    		modelAndView.addObject("user",user);
    		modelAndView.setViewName("regist_success");
    	}else{
    		modelAndView.addObject("message","对不起，你注册失败！！！");
    		modelAndView.setViewName("regist_err");
    	}
    	return modelAndView;
    }
}
