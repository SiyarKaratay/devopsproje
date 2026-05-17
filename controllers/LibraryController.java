cat << 'EOF' > src/main/java/com/sau/libraryapp/controllers/LibraryController.java
package com.sau.libraryapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    
    @GetMapping("/")
    public String getBooks() {
        return "<h1>Welcome to the Local Kubernetes Library Management System!</h1><p>Available Books: 1984, Brave New World, Fahrenheit 451</p>";
    }
}
EOF
