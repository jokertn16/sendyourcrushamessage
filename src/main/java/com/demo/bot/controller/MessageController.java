package com.demo.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bot.service.UserService;

@RestController
public class MessageController {

    @Autowired
    UserService userService;

    @SuppressWarnings("rawtypes")
	@GetMapping(value = "/api/send")
    public ResponseEntity sendMessage(@RequestParam("uid") String uid, @RequestParam("msg") String msg){
        userService.sendMessage(msg, uid);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
