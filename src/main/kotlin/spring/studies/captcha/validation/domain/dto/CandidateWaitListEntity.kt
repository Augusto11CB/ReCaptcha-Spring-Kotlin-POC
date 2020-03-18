package spring.studies.captcha.validation.domain.dto

data class CandidateWaitListEntity(

        var id: String = "",

        var name: String = "",

        var email: String = "",

        var cellphone: String = "",

        var captcha: String = ""
)