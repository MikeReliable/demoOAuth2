package com.mike.demooauth2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @GetMapping("/get")
    public String getAdmin() {
        log.info("Admin login");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Welcome to Admin page with username:  " + authentication.getName();
    }


}
