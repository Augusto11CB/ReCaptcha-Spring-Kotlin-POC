package spring.studies.captcha.validation.domain


import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.validator.constraints.NotEmpty
import javax.persistence.*
import javax.validation.constraints.Size


@Entity

class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @NotEmpty
    @Size(max = 50)
    var firstName: String? = null
    @NotEmpty
    @Size(max = 50)
    var lastName: String? = null
    @NotEmpty
    @Size(max = 128)
    var email: String? = null
    @NotEmpty
    @Size(max = 60)
    @JsonIgnore
    var password: String? = null
    @Transient
    @JsonIgnore
    var confirmPassword: String? = null
}