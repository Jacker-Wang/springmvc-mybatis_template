package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/** ע�ⲻ�������import���ᵼ�³����Ҳ������� Controller�ȵĴ��� */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.service.ServiceUserMap;

@Controller
public class TestController {
	@Autowired
	private ServiceUserMap s;
	
    @RequestMapping("/test")
    public String testSpring() throws Exception{
    	System.out.println("===========TestController");
    	s.getUserById();
         return "success";
    }
}
