package KNUT_CLUB.KNUT_CLUB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {

    @GetMapping(value = "/notice")
    public String goNotice() {
        return "notice/notice";
    }
}
