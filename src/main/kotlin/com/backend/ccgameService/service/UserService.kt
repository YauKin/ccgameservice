package com.backend.ccgameService.service

import org.springframework.http.ResponseEntity

interface UserService {

    fun login(phone: String, password: String, authCode: String): ResponseEntity<String>

}