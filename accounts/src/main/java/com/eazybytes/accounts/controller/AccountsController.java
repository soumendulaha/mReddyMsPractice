package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/common/v1")
public class AccountsController {

    @GetMapping(value="/getData")
    public String getSomeData() {
        return "Hello how are you?";
    }
}
