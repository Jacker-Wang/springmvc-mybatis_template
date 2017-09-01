package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/** 注意不加下面的import，会导致出现找不到符号 Controller等的错误 */
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
