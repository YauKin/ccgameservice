package com.backend.ccgameService.controller

import com.backend.ccgameService.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/api/user/login")
    @CrossOrigin(origins = ["*"])
    fun login(@RequestParam("phone") phone:String,@RequestParam("pwd") password:String,@RequestParam("authLoginCode") authCode:String): ResponseEntity<String> =
        userService.login(phone,password,authCode)


}