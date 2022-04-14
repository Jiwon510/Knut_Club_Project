package KNUT_CLUB.KNUT_CLUB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    @GetMapping(value = "/join")
    public String goJoin() {
        return "join/join";
    }
}
