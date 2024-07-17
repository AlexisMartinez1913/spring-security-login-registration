package jagarcia.registration.login.system.controller;

import jagarcia.registration.login.system.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    //handler method to handle home page request
    @GetMapping("/index")
    public String home() {
        return "index";
    }
    //handle method to handle registration form request
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        //create model object to store form data
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }
}
