package springmvc;

/** ע�ⲻ�������import���ᵼ�³����Ҳ������� Controller�ȵĴ��� */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.service.TestSelect;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String testSpring() throws Exception{
    	System.out.println("===========TestController");
    	TestSelect s=new TestSelect();
    	s.test();
         return "success";
    }
}
