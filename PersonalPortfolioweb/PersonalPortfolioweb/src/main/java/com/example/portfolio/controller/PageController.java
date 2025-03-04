package com.example.portfolio.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // Looks for about.html in src/main/resources/templates/
    }

    @GetMapping("/projects")
    public String projectsPage() {
        return "projects"; // Looks for projects.html in templates/
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact"; // Looks for contact.html in templates/
    }
}

