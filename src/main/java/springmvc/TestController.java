package springmvc;

/** 注意不加下面的import，会导致出现找不到符号 Controller等的错误 */
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
