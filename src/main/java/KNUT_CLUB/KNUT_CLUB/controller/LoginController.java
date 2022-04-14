package KNUT_CLUB.KNUT_CLUB.controller;

import KNUT_CLUB.KNUT_CLUB.service.UserService;
import KNUT_CLUB.KNUT_CLUB.entitiy.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping(value= "/login/login")
    public String gologin() {
        return "login/login";
    }

    @PostMapping(value = "/login/login")
    public String dologin(@ModelAttribute User user) {
        if(userService.login(user)) {
            return "redirect:/";
        }
        return "login/login";
    }


}
