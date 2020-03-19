package spring.studies.captcha.validation.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import spring.studies.captcha.validation.client.ServerCaptchaValidator
import spring.studies.captcha.validation.domain.User
import spring.studies.captcha.validation.domain.dto.CandidateWaitListEntity
import javax.servlet.http.HttpServletRequest
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ApiController(val serverCaptchaValidator: ServerCaptchaValidator) {

    @PostMapping("/signup")
    public fun signup(@Valid user: User, @RequestParam(name = "g-recaptcha-response") recaptchaResponse: String,
                      request: HttpServletRequest): ResponseEntity<*> {

        val user = CandidateWaitListEntity("42736743865", "Augusto Test", "augusto@gmail.com", "11942743818", recaptchaResponse)

        serverCaptchaValidator.verifyServerCaptcha(user)

        return ResponseEntity.ok("200")

    }

}