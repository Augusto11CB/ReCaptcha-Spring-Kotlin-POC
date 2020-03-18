package spring.studies.captcha.validation.config

import feign.Logger

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClientsConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.core.env.Environment

@Configuration
@EnableFeignClients(basePackages = ["spring.studies.captcha.validation"])
@Import(FeignClientsConfiguration::class)
class FeignConfig(val environment: Environment) {

    @Bean
    fun feignLoggerLevel(): Logger.Level {
        return Logger.Level.FULL
    }
}