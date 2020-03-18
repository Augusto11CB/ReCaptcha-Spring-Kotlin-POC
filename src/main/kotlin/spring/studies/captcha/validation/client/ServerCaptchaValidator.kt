package spring.studies.captcha.validation.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import spring.studies.captcha.validation.domain.dto.CandidateWaitListEntity

@FeignClient(name = "serverCaptchaValidator", url = "localhost:8080/")
interface ServerCaptchaValidator {

    @PostMapping(path = ["public/v1/subscribe-waitlist"])
    fun verifyServerCaptcha(@RequestBody candidate: CandidateWaitListEntity)

}