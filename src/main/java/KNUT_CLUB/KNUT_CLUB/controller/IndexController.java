package KNUT_CLUB.KNUT_CLUB.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    @GetMapping(value= "/")
    public String goindex() {
        return "/";
    }
}
