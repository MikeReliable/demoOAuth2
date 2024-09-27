package com.mike.demooauth2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @PreAuthorize("hasRole('USER')and hasAnyAuthority('OIDC_USER')")
    @GetMapping("/get")
    public String getUser() {
        log.info("User login");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Welcome to User page with username: " + authentication.getName();
    }
}
