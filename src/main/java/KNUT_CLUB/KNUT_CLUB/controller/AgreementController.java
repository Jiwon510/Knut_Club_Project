package KNUT_CLUB.KNUT_CLUB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgreementController {

    @GetMapping(value = "/agreement")
    public String goAgreement() {
        return "agreement/agreement";
    }
}
