import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  @GetMapping("/main/1")
  @ResponseBody
  public String main(){
    return "스프링부트 첫 수업";
  }
}
