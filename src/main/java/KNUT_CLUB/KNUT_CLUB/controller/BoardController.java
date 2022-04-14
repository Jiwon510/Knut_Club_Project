package KNUT_CLUB.KNUT_CLUB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping(value = "/board")
    public String goAgreement() {
        return "board/board";
    }
}
