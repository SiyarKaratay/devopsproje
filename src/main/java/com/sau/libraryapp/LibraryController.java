package com.sau.libraryapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String index() {
        return "<h1>Welcome to the Local Kubernetes Library Management System!</h1>" +
               "<p>SWE304 DevOps Project - Status: SUCCESSFUL</p>" +
               "<ul>" +
               "<li>Book 1: Clean Code</li>" +
               "<li>Book 2: Introduction to DevOps</li>" +
               "<li>Book 3: Kubernetes in Action</li>" +
               "</ul>";
    }
}