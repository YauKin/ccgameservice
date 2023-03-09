package com.backend.ccgameService.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UserServiceImpl: UserService {

    val restTemplate = RestTemplate()

    @Value("\${ccgame.endpoint}")
    var ccgameEndpoint: String? = null

    override fun login(phone: String, password: String, authCode: String): ResponseEntity<String> {
        val url = "${ccgameEndpoint}user/login/?phone=$phone&pwd=$password&authLoginCode=$authCode"
        val response = restTemplate.getForEntity(url,String::class.java)
        return response;
    }

}