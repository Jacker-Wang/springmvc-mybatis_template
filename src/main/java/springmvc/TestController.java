package springmvc;

/** ע�ⲻ�������import���ᵼ�³����Ҳ������� Controller�ȵĴ��� */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String testSpring(){
    	System.out.println("===========TestController");
        return "success";
    }
}
