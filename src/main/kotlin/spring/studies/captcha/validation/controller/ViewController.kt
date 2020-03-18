package spring.studies.captcha.validation.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import spring.studies.captcha.validation.domain.User


@Controller
class ViewController {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("user", User())

        return "index"
    }


}