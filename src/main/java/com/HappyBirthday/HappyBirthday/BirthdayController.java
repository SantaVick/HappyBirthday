package com.HappyBirthday.HappyBirthday;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BirthdayController {

    @GetMapping("/")
    public String birthdayPage(Model model) {
        // Add dynamic data that can be used in Thymeleaf
        model.addAttribute("name", "Patience Mumbi");
        model.addAttribute("age", 9);
        model.addAttribute("currentYear", java.time.Year.now().getValue());

        return "birthday";
    }

    // Optional: For a personalized URL
    @GetMapping("/happy-birthday")
    public String happyBirthday(Model model) {
        model.addAttribute("name", "Patience Mumbi");
        model.addAttribute("age", 9);
        return "birthday";
    }
}