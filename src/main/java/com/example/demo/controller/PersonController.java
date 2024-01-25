package com.example.demo.controller;

import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;


}
