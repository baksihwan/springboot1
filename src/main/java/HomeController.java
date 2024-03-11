import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

  @GetMapping("/mbti/{name}")
  @ResponseBody
  public String showMbti(@PathVariable String name) {
    System.out.println(name);

    String rs = switch (name) {
      case "홍길동" -> "INFP";
      case "홍길순" -> "ENFP";
      case "임꺽정" -> "ESFJ";
      case "신짱구" -> "ENTP";
      default -> "모름";
    };

    return rs;
  }
}