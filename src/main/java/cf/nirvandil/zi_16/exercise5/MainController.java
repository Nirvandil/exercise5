package cf.nirvandil.zi_16.exercise5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sort")
    public String sort(Model model, @RequestParam("array") Integer[] array) {
        Arrays.sort(array);
        model.addAttribute("result", array);
        return "result";
    }

}
